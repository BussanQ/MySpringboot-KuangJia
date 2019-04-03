package com.bussanq.group.alpha.service;

import com.bussanq.group.alpha.bean.New;
import com.bussanq.group.alpha.common.util.OkHttpUtils;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class RssService {

	Logger logger = LoggerFactory.getLogger(RssService.class);
	private List<New> lists;

	/**
	 * 根据链接地址得到数据
	 */
	@SuppressWarnings("finally")
	public List<New> parseXml(String url) throws IllegalArgumentException, FeedException {
		List<New> list = parseXmlMehtod(url);
		return list.subList(0, 10);
	}

	public List<New> parseXmlMehtod(String url) {
		List<New> list = new ArrayList<New>();
		try {
			SyndFeedInput input = new SyndFeedInput();
			SAXBuilder buider = new SAXBuilder();
			// 读取Rss源
			String xml = OkHttpUtils.get(url.toString());
			Document document = buider.build(new StringReader(xml));
			// 得到SyndFeed对象，即得到Rss源里的所有信息
			SyndFeed feed = input.build(document);
			for (int i = 0; i < 50; i++) {
				New news = new New();
				SyndEntry entry = (SyndEntry) feed.getEntries().get(i);
				news.setTitle(entry.getTitle());
				news.setLink(entry.getLink());
				news.setDescription(entry.getDescription().getValue());
				entry.getDescription();
				news.setPubDate(entry.getPublishedDate());
				list.add(news);
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
		} finally {
			lists = list;
			return list;// 得到所有的
		}
	}

	public List<New> getPage(int pageNum, int pageSize) {
		try {
			if (lists == null) {
				lists = parseXmlMehtod("https://rss.cnbeta.com/rss");
			}
			int to = (pageNum + 1) * pageSize;
			int from = pageNum * pageSize;
			if (to <= lists.size())
				return lists.subList(from, to);
		} catch (Exception ex) {
			logger.error(ex.getMessage());
		}
		return new ArrayList<>();
	}
}

package com.bussanq.group.alpha.service;

import com.bussanq.group.alpha.bean.New;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

@Service
public class RssService {

	Logger logger = LoggerFactory.getLogger(RssService.class);
	private List<New> lists;

	/**
	 * 根据链接地址得到数据
	 */
	@SuppressWarnings("finally")
	public List<New> parseXml(URL url) throws IllegalArgumentException, FeedException {
		List<New> list = parseXmlMehtod(url);
		return list.subList(0,10);
	}

	public List<New> parseXmlMehtod(URL url){
		List<New> list = new ArrayList<New>();
		try {
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed = null;
			URLConnection conn = url.openConnection();
			String content_encoding = conn.getHeaderField("Content-Encoding");
			if (content_encoding != null && content_encoding.contains("gzip")) {
				System.out.println("conent encoding is gzip");
				GZIPInputStream gzin = new GZIPInputStream(conn.getInputStream());
				feed = input.build(new XmlReader(gzin));
			} else {
				feed = input.build(new XmlReader(conn.getInputStream()));
			}
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

	public List<New> getPage(int pageNum,int pageSize){
		try {
			if (lists == null) {
				lists = parseXmlMehtod(new URL("http://rss.cnbeta.com/rss"));
			}
			int to = (pageNum + 1) * pageSize;
			int from = pageNum * pageSize;
			if (to <= lists.size())
				return lists.subList(from, to);
		}
		catch (MalformedURLException ex){
			logger.error(ex.getMessage());
		}
		return new ArrayList<>();
	}
}

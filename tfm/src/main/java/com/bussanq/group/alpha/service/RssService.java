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
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

@Service
public class RssService {

	Logger logger = LoggerFactory.getLogger(RssService.class);

	private ThreadLocal<List<New>> listThreadLocal = new ThreadLocal<>();
	private List<New> lists;

	/**
	 * 根据链接地址得到数据
	 */
	@SuppressWarnings("finally")
	public List<New> parseXml(URL url) throws IllegalArgumentException, FeedException {
		List<New> list = new ArrayList<New>();
		try {
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed = null;
			URLConnection conn;
			conn = url.openConnection();
			String content_encoding = conn.getHeaderField("Content-Encoding");
			if (content_encoding != null && content_encoding.contains("gzip")) {
				System.out.println("conent encoding is gzip");
				GZIPInputStream gzin = new GZIPInputStream(conn.getInputStream());
				feed = input.build(new XmlReader(gzin));
			} else {
				feed = input.build(new XmlReader(conn.getInputStream()));
			}
			for (int i = 0; i < 50; i++) {
				New new1 = new New();
				SyndEntry entry = (SyndEntry) feed.getEntries().get(i);
				new1.setTitle(entry.getTitle());
				new1.setLink(entry.getLink());
				new1.setDescription(entry.getDescription().getValue());
				entry.getDescription();
				new1.setPubDate(entry.getPublishedDate());
				list.add(new1);
			}
			//System.out.println("feed size:" + feed.getEntries().size());
		} catch (IOException e) {
			logger.error(e.getMessage());
		} finally {
			listThreadLocal.set(list);
			lists = list;
			return list.subList(0,10);// 得到所有的
		}
	}

	public List<New> getPage(int pageNum,int pageSize){
//		List<New> list = listThreadLocal.get();
		if (lists==null){
			return new ArrayList<>();
		}
		int to = (pageNum+1)*pageSize;
		int s = pageNum * pageSize;
		if(to > lists.size())
			return new ArrayList<>();
		return lists.subList(s,to);
	}


}

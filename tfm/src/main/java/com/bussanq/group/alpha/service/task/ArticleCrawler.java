package com.bussanq.group.alpha.service.task;

import com.bussanq.group.alpha.bean.New;
import com.bussanq.group.alpha.service.NewService;
import com.bussanq.group.alpha.service.RssService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lizh
 * @date 2017/11/26
 */
@Component
public class ArticleCrawler {
	Logger logger = LoggerFactory.getLogger(ArticleCrawler.class);
	private static final String url = "http://rss.cnbeta.com/rss";

	@Autowired
	RssService rssService;

	@Autowired
	NewService newService;

	@Scheduled(fixedDelay= 30 * 60 * 1000)
	public void saveArticle(){
		try{
			List<New> list = rssService.parseXmlMehtod(url);
			newService.insertOrUpdateBatch(list);
		}
		catch (Exception ex){
			logger.error("",ex);
		}
	}
}

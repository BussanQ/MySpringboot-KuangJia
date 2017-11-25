package com.bussanq.group.alpha.controller;

import com.bussanq.group.alpha.bean.New;
import com.bussanq.group.alpha.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URL;
import java.util.List;

@Controller
@RequestMapping("/rss")
public class RssController {
	@Autowired
	private RssService rssService; // 自动载入Service对象

	@RequestMapping(value = "/rssList", produces = "application/json; charset=utf-8")
	@ResponseBody
	public List<New> rssList()
			throws Exception {
		List<New> list = rssService.parseXml(new URL("http://rss.cnbeta.com/rss"));
		return list;
	}

	@RequestMapping(value = "/rssListPage")
	@ResponseBody
	public List<New> rssListPage(int pageNum,int pageSize){
		return rssService.getPage(pageNum,pageSize);
	}
}

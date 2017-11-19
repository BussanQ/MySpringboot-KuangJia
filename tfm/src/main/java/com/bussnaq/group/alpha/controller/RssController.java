package com.bussnaq.group.alpha.controller;

import com.alibaba.fastjson.JSON;
import com.bussnaq.group.alpha.bean.New;
import com.bussnaq.group.alpha.bean.User;
import com.bussnaq.group.alpha.service.RssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URL;
import java.util.List;

@Controller
@RequestMapping("/rss")
public class RssController {
	@Autowired
	private RssService rssService; // 自动载入Service对象

	@RequestMapping(value = "/rssList", produces = "application/json; charset=utf-8")
	@ResponseBody
	public String rssList(HttpServletRequest request, HttpServletResponse response, User user, HttpSession session)
			throws Exception {
		String result;
		List<New> list = rssService.parseXml(new URL("http://rss.cnbeta.com/rss"));
		result = JSON.toJSONString(list);
		return result;
	}
}

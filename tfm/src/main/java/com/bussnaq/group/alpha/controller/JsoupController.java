package com.bussnaq.group.alpha.controller;

import com.bussnaq.group.alpha.bean.User;
import com.bussnaq.group.alpha.bean.UserData;
import com.bussnaq.group.alpha.common.util.StringUtils;
import com.bussnaq.group.alpha.service.UserDataService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/jsoupUrl")
public class JsoupController {

	@Autowired
	private UserDataService userDataService;
	
	@RequestMapping(value = "/showArticle", produces = "application/json; charset=utf-8")
	public String showArticle() {
		return "/cnbeta/articles";
	}

	@RequestMapping(value = "/getArticle", method = RequestMethod.GET)
	public String getArticle(String url, String title, HttpSession session, RedirectAttributes attr) throws IOException {
		//redirect必须是方法映射路径，jsp无效
		if(StringUtils.isEmpty(url)|| StringUtils.isEmpty(url)){
			return "redirect:/mvc/error";
		}	
		User user= (User) session.getAttribute("userInfo");
		String loginId="lizh";
		if(user!=null)
			loginId=user.getLoginId();			
		userDataService.saveUserData(new UserData(url, loginId,title));
		Document doc = Jsoup.connect(url).get();
		Element topic = doc.select(".article-summary").first();
		Element content = doc.select("div.article-content").first();
		// 封装要显示到视图的数据 不显示到url
		attr.addFlashAttribute("title",title);
		attr.addFlashAttribute("topic",topic.html());
		attr.addFlashAttribute("data",content.html());
		return "redirect:/jsoupUrl/showArticle";
	}
}

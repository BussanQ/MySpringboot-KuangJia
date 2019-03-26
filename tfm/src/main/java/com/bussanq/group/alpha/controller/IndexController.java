package com.bussanq.group.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/")
	public String index() {
		return "/cnbeta/showList";
	}

	@RequestMapping(value = "/404")
	public String ee() {
		return "/404";
	}

	@RequestMapping(value = "/500")
	public String e500() {
		return "/500";
	}

	@RequestMapping(value = "/403")
	public String e403() {
		return "/403";
	}
}

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
}

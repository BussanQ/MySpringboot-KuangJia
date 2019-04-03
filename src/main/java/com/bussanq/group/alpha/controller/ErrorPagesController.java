package com.bussanq.group.alpha.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorPagesController  implements ErrorController{

	private static final String ERROR_PATH = "/error";

	@RequestMapping(value = ERROR_PATH)
	public String index() throws Exception {
		return "/403";
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}

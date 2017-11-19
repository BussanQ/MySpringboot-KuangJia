package com.bussnaq.group.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2016/9/22.
 */
@Controller
@RequestMapping("/mvc")
public class MainController {
	
	@RequestMapping(value = "/showList", method = RequestMethod.GET)
    public String showList() {
        return "/showList";
    }
	
    @RequestMapping(value = "/listActionLog", method = RequestMethod.GET)
    public String hello() {
        return "list_action_log";
    }

    /**
     * 登陆页面
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(){
        return "jsp/login.jsp";
    }

    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(){
        return "login";
    }
    
    /**
     * 后台主页
     *
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
    
    /**
     * 后台主页
     *
     * @return
     */
    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public String error() {
        return "view/404.html";
    }

}

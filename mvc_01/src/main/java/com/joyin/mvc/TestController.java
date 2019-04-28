package com.joyin.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("welcome to controller ,Hello world!!!");
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}

}

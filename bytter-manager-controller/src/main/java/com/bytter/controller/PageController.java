package com.bytter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示jsp页面
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * @author	sangdy@foxmail.com
 * @date	2016年7月14日 23:08:24
 * @version 1.0
 */
@Controller
public class PageController {

	/**
	 * 展示首页
	 * <p>Title: showIndex</p>
	 * <p>Description: </p>
	 * @return
	 */
	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}
	
	/**
	 * 展示功能页面
	 * <p>Title: showPage</p>
	 * <p>Description: </p>
	 * @param page
	 * @return
	 */
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
}

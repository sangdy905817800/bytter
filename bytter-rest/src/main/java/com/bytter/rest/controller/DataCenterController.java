package com.bytter.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dc")
public class DataCenterController {
	@RequestMapping("/pull/uk")
	@ResponseBody
	public Object getUser(){
    	//http://localhost:8081/rest/dc/pull/uk
		return "test";
    }
}

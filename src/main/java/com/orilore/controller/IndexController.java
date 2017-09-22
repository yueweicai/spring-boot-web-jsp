package com.orilore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/welcome")
	public String welcome(ModelMap map){
		map.put("name", "东方罗尔");
		return "index";
	}
}

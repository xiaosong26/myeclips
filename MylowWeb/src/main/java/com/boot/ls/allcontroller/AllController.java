package com.boot.ls.allcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AllController {
	@ResponseBody
	@RequestMapping("/firstlove")
	public String MyIndex() {
		return "my first love";
	}
	@RequestMapping("/mythymeleaf")
	public String mythymeleaf(Map<String,Object> map) {
		map.put("welcome", "wo shi ");
		return "result";
	}
}

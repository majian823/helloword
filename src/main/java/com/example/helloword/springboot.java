package com.example.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springboot {

	@ResponseBody
	@RequestMapping("helloword")
	public String helloword() {
		return "helloword springboot";
	}

}

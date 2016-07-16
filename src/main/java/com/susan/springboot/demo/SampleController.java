package com.susan.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
*@author Tanjiao
*@date 2016年7月16日下午1:06:26
*@version 1.0
*/

@Controller
@EnableAutoConfiguration
public class SampleController {

	@RequestMapping("/**")
	@ResponseBody
	String home(){
		return "Hello World!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);

	}

}

package com.hsbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController 
{
@RequestMapping("/")
@ResponseBody
public String welcome()
{
	return "index";
	}

public String register() {
	return "index";
}
}

package com.example.demo.controllers;

import com.example.demo.services.calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.services.EvaluateString;

@Controller
public class HomeController {
	
	@Autowired
	calculate eval;
	
	@RequestMapping("/")
	public String home()
	{
		return "Calculator.html";
	}
	
	@RequestMapping("/getResult")
	@ResponseBody
	public String func(@RequestParam("expression") String exp,@RequestParam("button") String button)
	{
		String result="";
		result=Double.toString(eval.evaluate(exp,button));
		return result;
	}

}

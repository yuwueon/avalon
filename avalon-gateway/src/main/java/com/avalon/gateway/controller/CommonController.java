package com.avalon.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommonController {

	@RequestMapping(path = "/commonfallback",method =RequestMethod.GET)
	public CommonResponse commonFallBack(){
		return new CommonResponse("404", "Request time out");
	}
}

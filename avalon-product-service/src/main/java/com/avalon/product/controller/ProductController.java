package com.avalon.product.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private final Logger log = LoggerFactory.getLogger(getClass());

	@RequestMapping(path ="/hello",method = RequestMethod.GET)
	public String test(){
		log.info("/product/hello");
		return "product service say hello";
	}
}

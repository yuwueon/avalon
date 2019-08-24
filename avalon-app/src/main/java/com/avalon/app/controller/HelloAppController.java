package com.avalon.app.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.avalon.service.api.AccountService;
import com.avalon.service.api.ProductService;

@RestController
public class HelloAppController {
	private static final Log logger = LogFactory.getLog(HelloAppController.class);
	
	@Autowired
	private AccountService accountService;
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(path ="/hello",method = RequestMethod.GET)
    public String hello() {
        return "app invoke account service: " + accountService.hello() + ";product service:" + productService.hello();
    }

	@RequestMapping(path ="/hello/account",method = RequestMethod.GET)
    public String helloAccount() {
        return "app invoke account service: " + accountService.hello();
    }
	
	@RequestMapping(path ="/hello/product",method = RequestMethod.GET)
    public String helloProduct() {
        return "app invoke product service: " + productService.hello();
    }
	
	@RequestMapping(path ="/slow/return",method = RequestMethod.GET)
    public String slowTest() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			logger.error("thread sleep error");
		}
        return "success ";
    }
}

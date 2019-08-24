package com.avalon.service.hystrix;

import org.springframework.stereotype.Component;

import com.avalon.service.api.ProductService;

@Component
public class ProductServiceHystrix implements ProductService {

	@Override
	public String hello() {
		return "fail to invoke product service";
	}

}

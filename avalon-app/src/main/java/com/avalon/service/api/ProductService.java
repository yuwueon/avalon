package com.avalon.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avalon.service.hystrix.ProductServiceHystrix;

@FeignClient(value="avalon-product",fallback=ProductServiceHystrix.class)
public interface ProductService {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	String hello();
}

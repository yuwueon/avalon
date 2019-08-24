package com.avalon.service.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.avalon.service.hystrix.AccountServiceHystrix;

@FeignClient(value="avalon-account",fallback=AccountServiceHystrix.class)
public interface AccountService {

	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	String hello();
}

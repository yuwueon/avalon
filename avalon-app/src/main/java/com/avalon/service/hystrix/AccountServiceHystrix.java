package com.avalon.service.hystrix;

import org.springframework.stereotype.Component;

import com.avalon.service.api.AccountService;

@Component
public class AccountServiceHystrix implements AccountService {

	@Override
	public String hello() {
		return "fail to invoke account service";
	}

}

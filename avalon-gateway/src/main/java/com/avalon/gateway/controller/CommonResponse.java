package com.avalon.gateway.controller;

import java.io.Serializable;

public class CommonResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	private String msg;
	
	public CommonResponse(){
		this.code = "200";
		this.msg = "success";
	}
	public CommonResponse(String _code,String _msg){
		this.code = _code;
		this.msg = _msg;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}

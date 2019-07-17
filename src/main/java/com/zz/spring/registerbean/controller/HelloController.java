package com.zz.spring.registerbean.controller;

import com.zz.spring.registerbean.itface.IRequestDemo;
import com.zz.spring.registerbean.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zengzhen
 * @Date: 2019/7/17 14:20
 * @Version 1.0
 */
@RestController
public class HelloController {

	@Autowired
	IRequestDemo requestDemo;
	@RequestMapping("/test1")
	public HttpResult<String> test1()
	{
		return requestDemo.test1();
	}
}

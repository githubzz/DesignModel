package com.zz.designmodel.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @Author: zengzhen
 * @Date: 2019/7/7 16:06
 * @Version 1.0
 */
public class CglibMainTest {
	public static void main(String[] args) {
		//该设置用于输出cglib动态代理产生的类
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\class");
		// 生成 Cglib 代理类
		Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
		// 调用相关方法
		engineerProxy.eat();
	}
}
package com.zz.designmodel.proxy.cglib;

/**
 * @Author: zengzhen
 * @Date: 2019/7/7 16:05
 * @Version 1.0
 */
public class Engineer {
	// 可以被代理
	public void eat() {
		System.out.println("工程师正在吃饭");
	}

	// final 方法不会被生成的字类覆盖
	public final void work() {
		System.out.println("工程师正在工作");
	}

	// private 方法不会被生成的字类覆盖
	private void play() {
		System.out.println("this engineer is playing game");
	}
}

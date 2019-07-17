package com.zz.designmodel.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * @Author: zengzhen
 * @Date: 2019/7/7 16:06
 * @Version 1.0
 */
public class CglibProxy implements MethodInterceptor {
	private Object target;

	public CglibProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("###   before invocation");
		Object result = method.invoke(target, objects);
		System.out.println("###   end invocation");
		return result;
	}

	public static Object getProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		// 设置需要代理的对象
		enhancer.setSuperclass(target.getClass());
		// 设置代理人
		enhancer.setCallback(new CglibProxy(target));
		return enhancer.create();
	}
}

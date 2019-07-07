package com.zz.designmodel.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zengzhen
 * @Date: 2019/7/2 16:42
 * @Version 1.0
 */
public class ServiceProxyFactory implements InvocationHandler {
	private ServiceImpl service;

	public ServiceProxyFactory(ServiceImpl service) {
		this.service = service;
	}


	public IService getInstance()
	{
		IService service = (IService)Proxy.newProxyInstance(this.getClass().getClassLoader(),ServiceImpl.class.getInterfaces(),this);
		return service;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ServiceProxyFactory：打开事务");
		//执行的时候需要传入实际对象才能执行，否则报NPE
		Object result =method.invoke(service,args);
		System.out.println("ServiceProxyFactory：关闭事务");
		return result;
	}
}

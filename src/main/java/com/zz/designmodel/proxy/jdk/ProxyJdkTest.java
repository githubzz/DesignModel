package com.zz.designmodel.proxy.jdk;

/**
 * @Author: zengzhen
 * @Date: 2019/7/2 16:50
 * @Version 1.0
 */
public class ProxyJdkTest {
	public static void main(String[] args) {
		//该设置用于输出jdk动态代理产生的类
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		//代理对象和实际对象是两个对象，并且分别实例化
		ServiceImpl serviceImpl = new ServiceImpl();
		//初始化代理对象的时候需要传入实际对象
		ServiceProxyFactory serviceProxyFactory = new ServiceProxyFactory(serviceImpl);
		IService service = serviceProxyFactory.getInstance();
		service.add();

	}
}

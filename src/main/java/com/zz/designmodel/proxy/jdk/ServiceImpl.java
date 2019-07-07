package com.zz.designmodel.proxy.jdk;

/**
 * @Author: zengzhen
 * @Date: 2019/7/2 16:41
 * @Version 1.0
 */
public class ServiceImpl implements IService {
	@Override
	public void add() {
		System.out.println("ServiceImpl：执行add");
		deduce();
	}

	@Override
	public void deduce() {
		System.out.println("ServiceImpl：执行deduce");
	}
}

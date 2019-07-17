package com.zz.java.overridetest;

/**
 * @Author: zengzhen
 * @Date: 2019/7/8 11:06
 * @Version 1.0
 */
public class FatherClass extends SunClass{
	@Override
	public final void sing() {
		System.out.println("father - sing");
		super.sing();
	}
	@Override
	public final void dance() {
		System.out.println("father - dance");
	}

	public static void main(String[] args) {
		FatherClass fatherClass=new FatherClass();
		fatherClass.sing();
	}
}

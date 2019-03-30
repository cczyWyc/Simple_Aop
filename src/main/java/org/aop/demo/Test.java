package org.aop.demo;


/**

* @Description: 定义被代理的实体类
* @Author:      王有成
* @CreateDate:  Create by Intellij IDEA 2019/3/6 14:45
*/
public class Test {

	public void doSomeThing() {
		System.out.println("do some thing...");
	}

	public void doWtihNotProxy() {
		System.out.println("do some thing with not proxy");
	}
}

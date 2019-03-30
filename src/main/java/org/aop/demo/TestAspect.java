package org.aop.demo;

import org.aop.annotion.aspect.Aspect;
import org.aop.annotion.aspect.PointCut;
import org.aop.proxy.AbsMethodAdvance;

/**

* @Description: 定义切点和切面
* @Author:      王有成
* @CreateDate:  Create by Intellij IDEA 2019/3/6 14:46
*/
@Aspect
public class TestAspect extends AbsMethodAdvance {

	/**
	 * 全类名_方法名
	 */
	@PointCut("org.aop.demo.Test_doSomeThing")
	public void testAspect() {
	}

	@Override
	public void doBefore() {
		System.out.println("do before");
	}

	@Override
	public void doAfter() {
		System.out.println("do after");
	}
}

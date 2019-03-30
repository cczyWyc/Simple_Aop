package org.aop.annotion.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**

* @Description: 切面
* @Author:      王有成
* @CreateDate:  Create by Intellij IDEA 2019/3/6 14:44
*/
@Retention(RetentionPolicy.RUNTIME)//保留时间长短
@Target(value = {ElementType.TYPE})//使用范围 接口、类、枚举、注解
public @interface Aspect {
}

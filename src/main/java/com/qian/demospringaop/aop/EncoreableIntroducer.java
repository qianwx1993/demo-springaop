package com.qian.demospringaop.aop;

import com.qian.demospringaop.servvice.Encoreable;
import com.qian.demospringaop.servvice.impl.EncordableImpl;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * 6、让Sleepable接口实现wc功能
 * @Auther: qian
 * @Date: 2019/3/15 19:33
 * @Company Bangsun
 * @Description:
 * @author qian
 */
@Aspect
public class EncoreableIntroducer {
	/**@DeclareParents注解表示我们需要把Encoreable声明为某些指定类型的父接口，
		然后通过@DeclareParents的value属性指定需要作用的类的形式，其语法和Pointcut表达式类似。
		通过defaultImpl属性指定默认Encoreable接口的实现类是EncordableImpl
	 */
	@DeclareParents(value = "com.qian.demospringaop.servvice.Sleepable+",
			defaultImpl = EncordableImpl.class)
	public static Encoreable encoreable;
}
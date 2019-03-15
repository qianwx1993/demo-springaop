package com.qian.demospringaop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 2、更简单的方式，通过AspectJ提供的注解实现AOP。
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/13 21:03
 */
@Aspect
public class SleepHelper2{

	@Pointcut("execution(* com.qian.demospringaop.servvice.*.sleep(..))")
	//@Pointcut("execution(* *.sleep())")
	public void sleeppoint(){}

	//@Before("sleeppoint()")
	//public void beforeSleep(){
	//	System.out.println("睡觉前要脱衣服!");
	//}
	//
	//@AfterReturning("sleeppoint()")
	//public void afterSleep(){
	//	System.out.println("睡醒了要穿衣服！");
	//}

	/**
	 * 5、测试@Around,获取参数，返回值
	 */
	@Around("sleeppoint()")
	public Object around(ProceedingJoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		String argStr="";
		for (Object arg : args) {
			argStr+=arg;
		}
		System.out.println("请求参数："+argStr);

		Object result = null;
		try {
			result = joinPoint.proceed();
		} catch (Throwable throwable) {
			System.out.println("异常："+throwable.getMessage());
			throwable.printStackTrace();
		}

		System.out.println("返回参数："+result);

		return result;
	}

}

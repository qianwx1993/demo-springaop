package com.qian.demospringaop.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

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

	@Pointcut("execution(* com.qian.demospringaop.servvice.*.sleep())")
	//@Pointcut("execution(* *.sleep())")
	public void sleeppoint(){}

	@Before("sleeppoint()")
	public void beforeSleep(){
		System.out.println("睡觉前要脱衣服!");
	}

	@AfterReturning("sleeppoint()")
	public void afterSleep(){
		System.out.println("睡醒了要穿衣服！");
	}

}

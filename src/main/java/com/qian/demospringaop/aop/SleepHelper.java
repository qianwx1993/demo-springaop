package com.qian.demospringaop.aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 1、经典的aop实习
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/13 21:03
 */
public class SleepHelper implements MethodBeforeAdvice,AfterReturningAdvice {
	@Override
	public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
		System.out.println("起床后要穿衣服！");
	}

	@Override
	public void before(Method method, Object[] objects, Object o) throws Throwable {
		System.out.println("睡觉前要脱衣服！");
	}
}

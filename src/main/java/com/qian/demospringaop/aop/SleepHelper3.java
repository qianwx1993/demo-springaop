package com.qian.demospringaop.aop;

/**
 * 3、使用Spring来定义纯粹的POJO切面
 * （名字很绕口，其实就是纯粹通过<aop:fonfig>标签配置，也是一种比较简单的方式）。
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/13 21:03
 */
public class SleepHelper3 {

	public void beforeSleep(){
		System.out.println("睡觉前要脱衣服!");
	}

	public void afterSleep(){
		System.out.println("睡醒了要穿衣服！");
	}

}

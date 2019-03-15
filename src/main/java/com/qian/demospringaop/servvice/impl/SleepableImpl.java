package com.qian.demospringaop.servvice.impl;

import com.qian.demospringaop.servvice.Sleepable;

/**
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/13 20:58
 */
public class SleepableImpl implements Sleepable {
	@Override
	public void sleep() {
		System.out.println("\n睡觉！不休息哪里有力气学习！\n");
	}

	@Override
	public int sleep(int i) {
		System.out.println("\n睡觉！不休息哪里有力气学习！\n"+i+1);
		return i+1;
	}
}

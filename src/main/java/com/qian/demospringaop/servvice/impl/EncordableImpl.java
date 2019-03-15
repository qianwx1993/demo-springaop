package com.qian.demospringaop.servvice.impl;

import com.qian.demospringaop.servvice.Encoreable;

/**
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/15 19:47
 */
public class EncordableImpl implements Encoreable {
	@Override
	public void wc() {
		System.out.println("上了个厕所");
	}
}

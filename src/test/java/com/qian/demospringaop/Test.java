package com.qian.demospringaop;

import com.qian.demospringaop.servvice.Sleepable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/14 9:45
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext appCtx = new FileSystemXmlApplicationContext("classpath:application-bean2.xml");
		//Sleepable me = (Sleepable)appCtx.getBean("proxy");
		//		//me.sleep();

		Sleepable sleepable = (Sleepable) appCtx.getBean("sleepable");

		sleepable.sleep(1);
	}
}

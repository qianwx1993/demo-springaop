package com.qian.demospringaop;

import com.qian.demospringaop.servvice.Encoreable;
import com.qian.demospringaop.servvice.Sleepable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 6、让Sleepable接口实现wc功能
 * @Version 1.0
 * @Since JDK1.7
 * @Author Qian
 * @Company Bangsun
 * @Date 2019/3/14 9:45
 */
public class Test6 {
	public static void main(String[] args) {
		ApplicationContext appCtx = new FileSystemXmlApplicationContext("classpath:application-bean6.xml");

		Sleepable sleepable = (Sleepable) appCtx.getBean("sleepable");

		sleepable.sleep(1);

		Encoreable encoreable=(Encoreable) sleepable;
		encoreable.wc();
	}
}

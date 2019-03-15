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
	@DeclareParents(value = "com.qian.demospringaop.servvice.Sleepable+",
			defaultImpl = EncordableImpl.class)
	public static Encoreable encoreable;
}
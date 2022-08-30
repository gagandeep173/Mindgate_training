package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AnnoSecurityAspect {
//	//@Before("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void VerifyApplicationForm() {
//		System.out.println("Inna anno before call");
//	}
	
	//@After("execution(* com.sky.aop.ApplicationService.*(..))")
	public void ProcessResults() {
		System.out.println("processResults");
	}
	
	@Before("@annotation(com.sky.aop.Log)")
		public void processLoger()
		{
			System.out.println("processResults");
		}
	}
	


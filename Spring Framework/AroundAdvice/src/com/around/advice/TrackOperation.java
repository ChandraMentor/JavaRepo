package com.around.advice;
import org.aspectj.lang.ProceedingJoinPoint;

public class TrackOperation {
	public Object myadvice(ProceedingJoinPoint pjp) throws Throwable 
	{
		System.out.println("I'm Executing Before");
		Object obj=pjp.proceed();
		System.out.println("I'm Executing After");
		return obj;
	}
}
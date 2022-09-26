package com.after.advice;

import org.aspectj.lang.JoinPoint;


public class TrackOperation {
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("After the Bean method im executed");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
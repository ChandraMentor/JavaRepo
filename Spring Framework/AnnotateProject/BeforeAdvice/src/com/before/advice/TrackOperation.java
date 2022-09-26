package com.before.advice;
import org.aspectj.lang.JoinPoint;

public class TrackOperation {
	public void myadvice(JoinPoint jp)//it is advice
	{
		System.out.println("Getting Executed Before the Bean Method");
		//System.out.println("Method Signature: "  + jp.getSignature());
	}
}
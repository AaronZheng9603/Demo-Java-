// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   MyInvocationHandler.java

package com.aaron.demo.proxy;

import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler
	implements InvocationHandler
{

	private Object mTarget;

	public MyInvocationHandler(Object obj)
	{
		mTarget = obj;
	}

	public Object invoke(Object obj, Method method, Object aobj[])
		throws Throwable
	{
		System.out.println("Student should also eat.");
		return method.invoke(mTarget, aobj);
	}
}

// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Test.java

package com.aaron.demo.proxy;

import java.io.PrintStream;
import java.lang.reflect.Proxy;

// Referenced classes of package com.aaron.demo.proxy:
//			Student, MyInvocationHandler, Person

public class Test
{

	public Test()
	{
	}

	public static void main(String args[])
	{
		Student student = new Student();
		student.doSomething();
		System.out.println("---------------------------");
		Person person = (Person)Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), new MyInvocationHandler(student));
		person.doSomething();
	}
}

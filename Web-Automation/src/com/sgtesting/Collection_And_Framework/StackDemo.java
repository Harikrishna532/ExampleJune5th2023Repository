package com.sgtesting.Collection_And_Framework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
	     Stack st = new Stack();
	     PushDemo(st,100);
	     PushDemo(st,200);
	     PushDemo(st,300);
	     PushDemo(st,400);
	     PushDemo(st,500);
	     PopDemo(st);
	}
	private static void PushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println("Elements Added:"+a);
	}
	private static void PopDemo(Stack st)
	{
		int b = (int)st.pop();
		System.out.println("Elements Removed:"+b);
	}
	

}

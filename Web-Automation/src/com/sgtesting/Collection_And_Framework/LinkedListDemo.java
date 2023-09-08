package com.sgtesting.Collection_And_Framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		//addElements();	
		//removeElements();
		//readElements1();
		//readElements2();
		//	readElementsUsingIterator();
		//readElementsUsingListIterator();
		//WithoutGenerics();
		QueueDemo();
	}
	private static void addElements()
	{
		LinkedList<String> obj = new LinkedList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Kiwi");
		obj.add("Mango");
		System.out.println("Elements:"+obj);
		LinkedList<String> obj1 = new LinkedList<String>();
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{
		LinkedList<String>obj = new LinkedList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		obj.remove("Grapes");
		System.out.println("Elements:"+obj);
		obj.remove(0);
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);
	}
	private static void readElements1()
	{
		LinkedList<String>obj = new LinkedList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("papaya");
		System.out.println("Elements:"+obj);
		for(String element:obj);
		{

			System.out.println("element");
		}
	}
	private static void readElements2()
	{
		LinkedList<String>obj = new LinkedList<String>();
		System.out.println("Elements:"+obj);
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	private static void readElementsUsingIterator()
	{
		LinkedList <String> obj = new  	LinkedList <String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		Iterator<String>elements = obj.iterator();
		while(elements.hasNext())
		{
			System.out.println(elements.next());
		}
	}
	private static void readElementsUsingListIterator()
	{
		LinkedList <String> obj = new  	LinkedList <String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		ListIterator<String>elements = obj.listIterator();
		System.out.println("Forward Direction to read Elements");
		while(elements.hasNext())
		{
			System.out.println(elements.next());
		}
		System.out.println("---------------------");
		System.out.println("Backward Direction to read Elements");
		while(elements.hasPrevious())
		{
			System.out.println(elements.previous());
		}
	}

	private static void WithoutGenerics()
	{
		LinkedList obj = new LinkedList();
		System.out.println("Elements:"+obj);
		System.out.println("Elements:"+obj);
		obj.add(12.75);
		obj.add('y');
		obj.add(true);
		obj.add(455);
		obj.add("Mango");
		System.out.println("Elements:"+obj);
	}
	private static void QueueDemo()
	{
		Queue<Integer> obj = new LinkedList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(100);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(500);
		System.out.println("Elements:"+obj);
		obj.remove();
		System.out.println("Elements:"+obj);
	}
}

package com.sgtesting.Collection_And_Framework;

import java.util.*;

public class Vectors {

	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElementsUsingIterator();
		//readElementsUsingEnumeration();
		WithoutGenerics();
	}
	private static void addElements()
	{
		Vector <String>obj = new Vector<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Kiwi");
		obj.add("Mango");
		System.out.println("Elements:"+obj);
		Vector <String>obj1 = new Vector<String>();
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{
		Vector <String>obj = new Vector<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		obj.remove("Grapes");
		System.out.println("Elements:"+obj);
		obj.remove(0);
		System.out.println("Elements:"+obj);
		obj.removeAll(obj);
		System.out.println("Elements:"+obj);
	}
	private static void readElements1()
	{
		Vector <String>obj = new Vector<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("papaya");
		System.out.println("Elements:"+obj);
		for(String str:obj);
		{

			System.out.println("str");
		}
	}
	private static void readElements2()
	{
		Vector <String>obj = new Vector<String>();
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
		Vector <String>obj = new Vector<String>();
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
	private static void readElementsUsingEnumeration()
	{
		Vector <String> obj = new Vector <String>();	
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		Enumeration<String> elements = obj.elements();
		while(elements.hasMoreElements());
		{
			System.out.println(elements.nextElement());
		}
	}
	private static void WithoutGenerics()
	{
		Vector obj = new Vector();
		System.out.println("Elements:"+obj);
		obj.add(12.75);
		obj.add('y');
		obj.add(true);
		obj.add(455);
		obj.add("Mango");
		System.out.println("Elements:"+obj);
	}

}

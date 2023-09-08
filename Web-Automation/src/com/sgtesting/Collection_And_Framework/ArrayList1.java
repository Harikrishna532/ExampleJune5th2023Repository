package com.sgtesting.Collection_And_Framework;
import java.net.MulticastSocket;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		//	addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElementsFromIterator();
		
		WithoutGenerics();
	}
	private static void addElements()
	{
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add(0,"Grapes");
		obj.add("Kiwi");
		obj.add("Mango");
		System.out.println("Elements:"+obj);
		ArrayList <String> obj1 = new ArrayList <String>();
		obj1.add("Blue");
		obj1.add("White");
		obj1.add("Green");
		obj.addAll(obj1);
		System.out.println("Elements:"+obj);
	}
	private static void removeElements()
	{
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		obj.remove("Apple");
		System.out.println("Elements:"+obj);
		obj.remove(0);
		System.out.println("Elements:"+obj);
	}
	private static void readElements1()
	{
		ArrayList<String> obj = new ArrayList<String>();
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
		ArrayList<String>obj = new ArrayList<String>();
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
	
	private static void readElementsFromIterator()
	{
		ArrayList<String> obj = new ArrayList<String>();
		System.out.println("Elements:"+obj);
		obj.add("Orange");
		obj.add("Mango");
		obj.add("Apple");
		obj.add("Grapes");
		obj.add("Kiwi");
		obj.add("Papaya");
		System.out.println("Elements:"+obj);
		Iterator<String>elements=obj.iterator();
		while(elements.hasNext());
		{
			System.out.println(elements.next());
		}
	}
	private static void WithoutGenerics()
	{
		ArrayList obj = new ArrayList();
		System.out.println("Elements:"+obj);
		obj.add(12.75);
		obj.add('y');
		obj.add(true);
		obj.add(455);
		obj.add("Mango");
		System.out.println("Elements:"+obj);
	}
	


}

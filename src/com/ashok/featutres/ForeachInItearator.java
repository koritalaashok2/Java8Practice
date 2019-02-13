package com.ashok.featutres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForeachInItearator {

	public static void main(String[] args) {
		//Map iteration example with Java8 forEach
		Map<String, Integer> items = new HashMap<>();
		items.put("One", 1);
		items.put("Two", 2);
		items.put("Three", 3);
		items.put("Four", 4);
		items.put("Five", 5);
		items.put("Six", 6);
		
		items.forEach((k,v)->System.out.println("Items::"+k+"-> values::"+v));
		
		//List Iteration example with Java8 forEach
		List<String> listItems= new ArrayList<>();
		listItems.add("One");
		listItems.add("Two");
		listItems.add("Three");
		listItems.add("Four");
		listItems.add("Five");
		listItems.add("Six");
		listItems.forEach(item->System.out.println(item));
		
		
		
	}
}

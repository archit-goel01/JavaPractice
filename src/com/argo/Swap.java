package com.argo;

import java.util.Arrays;
import java.util.List;

public class Swap {
	
	private static void swapNumber(String a, String b) {
		String temp=null;
		temp=b;
		b=a;
		a=temp;
		
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) {
		String a="Archit";
		String b="Goel";
		swapNumber(a,b);
		System.out.println(a+" "+b);
		
		List<String> strList = Arrays.asList("Archit","Mukta");
		
		for(String lst : strList) {
			strList.add("Keshav");
			System.out.println(lst);
		}
		
		strList.stream().forEach(s-> {strList.add("Keshav");
		System.out.println(s);});
		
		List<String> ls = Arrays.asList("a","b","c","d","e","f");
		ls.stream().forEach(p -> {
		    ls.add("p");
		});
	}

}

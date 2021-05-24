package com.argo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TreeMapClass {

	public static void main(String[] args) {
		Map<String,String> unsorted = new HashMap<String,String>();
		
		unsorted.put("A", "Archit");
		unsorted.put("N", "Nitin");
		unsorted.put("P", "Prateek");
		unsorted.put("AB", "Abhishek");
		unsorted.put("R", "Rahul");
		unsorted.put("S", "Sachin");
		
		List lst = new ArrayList();
		//lst.stream().collect()
		for(Map.Entry<String,String> unsortedEntry: unsorted.entrySet()) {
			  System.out.println("Unsorted Key is  :" +unsortedEntry.getKey() +
			  "   Unsorted Value is  :" + unsortedEntry.getValue());
			  }
		unsorted.forEach((key,value)->System.out.println(key+""+value));
		
		Map<String,String> sorted = sortByValues(unsorted);
		
		for(Map.Entry<String,String> sortedEntry: sorted.entrySet()) {
			 System.out.println("Sorted Key is  :" +sortedEntry.getKey() +
			 "  Sorted Value is  :" + sortedEntry.getValue()); 
			 }
		/*
		 * Map<String,String> sorted = new TreeMap<String,String>(unsorted);
		 * 
		 * for(Map.Entry<String,String> unsortedEntry: unsorted.entrySet()) {
		 * System.out.println("Unsorted Key is  :" +unsortedEntry.getKey() +
		 * "   Unsorted Value is  :" + unsortedEntry.getValue()); }
		 * 
		 * for(Map.Entry<String,String> sortedEntry: sorted.entrySet()) {
		 * System.out.println("Sorted Key is  :" +sortedEntry.getKey() +
		 * "  Sorted Value is  :" + sortedEntry.getValue()); }
		 */
	}
		private static HashMap<String,String> sortByValues(Map<String,String> map) { 
		       List list = new ArrayList(map.entrySet());
		       Collections.sort(list, new Comparator() {
		            public int compare(Object o1, Object o2) {
		               return ((Comparable) ((Map.Entry) (o1)).getValue())
		                  .compareTo(((Map.Entry) (o2)).getValue());
		            }
		       });

		       HashMap<String,String> sortedHashMap = new LinkedHashMap<String,String>();
		       for (Iterator it = list.iterator(); it.hasNext();) {
		              Map.Entry entry = (Map.Entry) it.next();
		              sortedHashMap.put(entry.getKey().toString(), entry.getValue().toString());
		       } 
		       return sortedHashMap;
		  }
}

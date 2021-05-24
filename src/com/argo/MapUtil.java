package com.argo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Long> map = new HashMap<>();
		
		map.put(1, (long) 1234567);
		map.put(2, (long) 12345645);
		map.put(3, (long) 12784567);
		map.put(4, (long) 12345347);
		map.put(5, (long) 12389567);
		// Create a list from elements of HashMap 
        List<Map.Entry<Integer, Long> > list = 
               new LinkedList<Map.Entry<Integer, Long> >(map.entrySet()); 
  
        // Sort the list 
        Collections.sort(list, new Comparator<Map.Entry<Integer, Long> >() { 
            public int compare(Map.Entry<Integer, Long> o1,  
                               Map.Entry<Integer, Long> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        // put data from sorted list to hashmap  
        HashMap<Integer, Long> temp = new LinkedHashMap<Integer, Long>(); 
        for (Map.Entry<Integer, Long> aa : list) { 
        	System.out.print(aa.getKey() + "    " + aa.getValue()+"\n");
            temp.put(aa.getKey(), aa.getValue()); 
        } 
	}

}

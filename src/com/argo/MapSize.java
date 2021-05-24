package com.argo;

import java.util.HashMap;
import java.util.Map;

public class MapSize {
	
	String name;
	public MapSize(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	int rollNo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<MapSize,String> map = new HashMap<MapSize,String>();

		map.put(new MapSize("Ram",1),"XYZ");
		map.put(new MapSize("Jacob",2),"ABC");
		map.put(new MapSize("Sita",3),"DEF");
		map.put(new MapSize("Ram",1),"QWE");

		System.out.println(map.size());

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapSize other = (MapSize) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

}

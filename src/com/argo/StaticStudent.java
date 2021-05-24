package com.argo;

import java.util.HashSet;
import java.util.Set;

class ChildSub extends StaticStudent{
	public static void  test() {
    	System.out.println("In child");
    }
}
public class StaticStudent {
        private String id;
        private String name;

	
	  public StaticStudent() { }
	 

        public StaticStudent(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public static void  test() {
        	System.out.println("In Parnt");
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    


    public static void main(String args[]){

		/*
		 * List<StaticStudent> students = new ArrayList<>(); StaticStudent s1 = new
		 * StaticStudent("1", "A"); students.add(s1); StaticStudent s2 = new
		 * StaticStudent("2", "B"); students.add(s2); StaticStudent s3 = new
		 * StaticStudent(); s3 = s1; s3.setName("C"); students.add(s3); StaticStudent s4
		 * = s2; s4.setName("D"); students.add(s4);
		 */
    	ChildSub c = new ChildSub();
    	c.test();
		StaticStudent s3 = new StaticStudent();
		s3.test();
		StaticStudent c1 = new ChildSub();
		c1.test();
		/*
		 * for(StaticStudent student : students){
		 * System.out.println("Printing Values: "+student.getId()+" : "+student.getName(
		 * )); }
		 */
		Set set  = new HashSet();
		set.add(new Integer(1));
		set.add(new Integer(1));
		set.add(new Integer(2));
		set.add(new Integer(3));
		System.out.println(set.size());
		try {
			int a = 10/0;
		} catch (Exception e) {
			try {
			throw new ArithmeticException();
			}
			catch(ArithmeticException ae) {
				System.out.println("ArithmaticException occured.");
			}
			
		} 

    }
    
}


package com.argo;

class SameParent {
	public void method(Child p) {
		System.out.println("In Parent");
	}
}
public class Child extends Parent {
	
	public void method(Parent c) {
		System.out.println("In Child");
		String s = "Archit";
	}
	
	/*
	 * public void method(Child c) { System.out.println("In child class Child");
	 * String s = "Archit"; }
	 */
	
	
	public static void main(String args[]) {
		Child c = new Child();
		c.method(c);
		c.method(new Parent());
		Parent p = new Parent();
		p.method(c);
		//p.method(p);error on this line
		//p.method(new Parent());
		Parent pc = new Child();
		//pc.method(pc);
		pc.method(c);
		//pc.method(p);
	}

}

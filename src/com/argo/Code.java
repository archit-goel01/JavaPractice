package com.argo;

 class A{
	public void method(Code p) {
		System.out.println("In A");
	}
  }
  public class Code extends A{
	
	public void method(A c) {
		System.out.println("In B");
	}	

	public static void main(String args[]) {
		Code c = new Code();
		c.method(c); //In A
		c.method(new A());//In B
		A p = new A();
		p.method(c); //In A
		//p.method(new A());//Error
		A pc = new Code();
		//pc.method(pc);//In B
		pc.method(c);//In A
		//pc.method(p);// In B
	}
}





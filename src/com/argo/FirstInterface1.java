package com.argo;

public interface FirstInterface1 {
	public void method();
	default public void methodDefault(){
	System.out.println("Inside first default method");
	}
}

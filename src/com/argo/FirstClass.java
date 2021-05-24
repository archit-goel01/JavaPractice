package com.argo;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

interface FirstInterface {
	public void method();
	default public void methodDefault(){
		System.out.println("Inside first default method");
	}
}
interface SecondInterface{
	public void methodOne();
}
public class FirstClass implements FirstInterface, SecondInterface {


		@Override
		public void method () {
			// TODO Auto-generated method stub
			System.out.println("Inside  method");
		}
		public static void main (String args[]){
			FirstInterface firstInterface = new FirstInterface() {
				@Override
				public void method() {

				}
			};
			FirstClass fi = new FirstClass();
			//fi.methodDefault();
			Thread t = new Thread(() -> {
				System.out.println("Inside thresad method");
			});
			t.start();

			List lst = new ArrayList();
			//lst.equals(equals);

			BlockingQueue bq = new LinkedBlockingDeque() {
			};
		}

	@Override
	public void methodOne() {

	}
	/*
	Solution * @Override public void methodDefault() { // TODO Auto-generated method stub
	 * FirstInterface.super.methodDefault(); }
	 */
//SecondInterface si = new FirstClass();
/*@Override
public void method() {
	// TODO Auto-generated method stub
	
}*/
//si.methodDefault();
//FirstInterface.super.methodDefault();
}


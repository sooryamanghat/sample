package com.nissan.trainingcorejava;


abstract class P{
	
	P(){
		System.out.println("inside constructor");
	}
	abstract void run();
	void f() {
		System.out.println("out");
	}
}
public class abstract3 extends P {

	void run() {}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

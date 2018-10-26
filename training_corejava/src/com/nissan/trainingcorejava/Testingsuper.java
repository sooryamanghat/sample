/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
class A{
	
	A(){
		
		System.out.println("inside parent function");
		
	}
}

class B extends A{
	B(){
		super();
		System.out.println("hello");
		
	}
	
}
public class Testingsuper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B an = new B();
	}

}

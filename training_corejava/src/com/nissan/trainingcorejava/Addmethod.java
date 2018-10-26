/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
public class Addmethod {

	/**
	 * @param args
	 */
	static int add(int a, int b) {
		
		return a+b;
	}
	
	static int add(int a,int b,int c) {
		
		
		return a+b+c;
	} 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(2,3));
		System.out.println(add(4,5,6));
	}

}

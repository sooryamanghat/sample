/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
interface operations{
	void add(int a,int b);
	void subtract(int a,int b);
	void mult(int a,int b);
	default void div(int a,int b) {
		System.out.println(a/b);
	}
}
public class Interfaceex implements operations{
	
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public void subtract(int a,int b) {
		System.out.println(a-b);
		
	}
	public void mult(int a,int b) {
		System.out.println(a*b);
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceex i =new Interfaceex();
		i.add(1,2);
		i.subtract(2,1);i.mult(4,5);i.div(8,2);
		

	}

}

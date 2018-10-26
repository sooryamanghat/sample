/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */

class Pub{
	
	void out() {
		
		System.out.println("Child object is an instance of the parent");
	}
}


public class assign31 extends Pub{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign31 ob = new assign31();
		if(ob instanceof Pub) {
			ob.out();
		}
	}

}

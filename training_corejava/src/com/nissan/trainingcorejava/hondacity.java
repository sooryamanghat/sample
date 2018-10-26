/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
abstract class car{
	
	abstract void run();
}
public class hondacity extends car{

	/**
	 * @param args
	 */
	void run() {
		System.out.println("The car's running");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hondacity h = new hondacity();
		h.run();

	}

}

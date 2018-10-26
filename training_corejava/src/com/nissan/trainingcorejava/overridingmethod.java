/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */

class vehicle{
	
	void run() {
		System.out.println("Vehicle is running");
	}
}

class overridingmethod extends vehicle{
	
	void run() {
		
		System.out.println("bike is running too");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overridingmethod a = new overridingmethod();
		a.run();
	}

}

/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
 class etwo {
	String name;
	int eid;
	void run() {
		
		name = "jerin";
		eid = 1234;
		System.out.println(name + eid);
	}
	
}
public class employee1 extends etwo{

	/**
	 * @param args
	 */
	void run() {
		
		name = "tom";
		eid = 2345;
		System.out.println(name + eid);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee1 e =  new employee1();
		e.run();
	}

}

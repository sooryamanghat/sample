/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	long phone,sall,eid;
	Employee(long phn,long sal,long id ){
		
		this.phone = phn;
		this.sall = sal;
		this.eid = id;
		
	}
	
	static long add1 (long p1,long s1,long id) {
		
		return p1+s1+id;
		
		
		 
	}
	static long add(long p1,long p2,long p3) {
		return p3+p1+p2;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee ed = new Employee(88966322,40000,12345);
		

	}

}

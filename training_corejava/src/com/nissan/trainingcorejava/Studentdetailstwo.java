/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
public class Studentdetailstwo {

	/**
	 * @param args
	 */
	int studentid;
	 String studentname;
	  
	 Studentdetailstwo(int i, String n ){
		 
		 studentid =i;
		 studentname=n;
		 
	 }
	 
	 void display() {
		 
		 System.out.println(studentid + " "+ studentname);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentdetailstwo s2 = new Studentdetailstwo(5,"jerin");
		s2.display();
	}

}

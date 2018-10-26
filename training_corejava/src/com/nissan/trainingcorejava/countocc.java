/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
class counter{
	
	int c = 0;
	
}

class count2 extends counter{
	
	int c = 2;
	void count() {
		String[] names = {"jerin","sachin","shankar","devi","jerin","shubham","jerin","rishab"};
		for(int i=0;i<8;i++) {
			if(names[i]=="jerin") {
				super.c++;
				
			} 
			
		
	}
		System.out.println("count = "+ super.c);
		
}
}
public class countocc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			count2 w = new count2();
			w.count();
			
		}
	}



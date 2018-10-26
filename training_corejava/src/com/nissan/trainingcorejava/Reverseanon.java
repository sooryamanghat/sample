package com.nissan.trainingcorejava;
import java.util.Collections;
import java.util.Arrays;

abstract class rev{
	
	abstract void rvr();
}

public class Reverseanon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rev r = new rev() {
		public void rvr() {
			String[] str = {"jerin","sachin","rishab","shankar"};
			Arrays.sort(str,Collections.reverseOrder());
			for(int i=0;i<str.length;i++) {
				System.out.println(str[i]);
			}
			
			
		}	
			
		};
		r.rvr();

	}

}

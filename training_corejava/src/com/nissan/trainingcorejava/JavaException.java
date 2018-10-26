package com.nissan.trainingcorejava;

import javax.management.openmbean.ArrayType;

public class JavaException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//code to be evaluated for errors
			//int number = 100/0;
			int [] a = new int[5];
			a[6]=8/0;
			}
		catch(ArrayIndexOutOfBoundsException e) {//exceptions catch  should be arranged based on priority
			System.out.println("Array task completed");
		}
		catch(ArithmeticException e) {
			System.out.println("Number task completed");
	}
		catch(Exception e) {
			System.out.println("Other errors");
		}
		System.out.println("Other parts of program");

	}

}

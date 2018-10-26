package com.nissan.trainingcorejava;

public class Finalex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int datamember = 20/0;
			System.out.println(datamember);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Inside finally");
		}

	}

}

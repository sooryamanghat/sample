package com.nissan.trainingcorejava;

public class Staticclass {
	
	static int membervalue = 100;
	static class Innerone{
		void displatmember() {
			System.out.println("Value is "+ membervalue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticclass.Innerone obj = new Staticclass.Innerone();
		obj.displatmember();

	}

}

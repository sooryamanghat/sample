package com.nissan.trainingcorejava;

public class Innerclass {
	
	private int datavalue = 100;
	class inner{
		
		void message() {
			System.out.println("Value is :" + datavalue);//datavalue is accessible inside a nested calss
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innerclass obj = new Innerclass();
		Innerclass.inner in = obj.new inner();
		in.message();

	}

}

package com.nissan.trainingcorejava;

public class Staticcheck {

	int k = 100;
	
	static class inner{
		void display() {
			System.out.println("Value is :"+ k);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticcheck.inner st = new Staticcheck.inner();
		st.display();

	}

}

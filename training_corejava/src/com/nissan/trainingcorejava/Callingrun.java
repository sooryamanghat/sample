package com.nissan.trainingcorejava;

public class Callingrun extends Thread {
	
	public void run() { //Overriding run
		
		System.out.println("thread run");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Callingrun c = new Callingrun();
		c.run();

	}

}

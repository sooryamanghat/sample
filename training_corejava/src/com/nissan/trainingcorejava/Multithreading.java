package com.nissan.trainingcorejava;

public class Multithreading implements Runnable{
	
	public void run() {
		System.out.println("Running a thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading m = new Multithreading();
		Thread t1 = new Thread(m);
		t1.start();

	}

}

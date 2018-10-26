package com.nissan.trainingcorejava;

public class Prioritythread extends Thread{
	
	public void run() {
		
		System.out.println("Thread name is :" + Thread.currentThread().getName());
		System.out.println("Thread priority is :" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prioritythread t1 = new Prioritythread();
		Prioritythread t2 = new Prioritythread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();

	}

}

package com.nissan.trainingcorejava;

public class DaemonThread extends Thread{
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread is working");
		}
		else {
			System.out.println("User thread is working");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		DaemonThread t3 = new DaemonThread();
		
		t1.setDaemon(true);//this sets my t1 as daemon
		
		t2.start();
		try {
		t2.join();
		}catch(InterruptedException e) {
			
			System.out.println(e);
		}
		t1.start();
		t3.start();

	}

}

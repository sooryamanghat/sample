package com.nissan.trainingcorejava;

public class Threadex extends Thread {
	public void run() {
		int f=0;
		
		for(int i=0,j=1;i<5;i++,j+=2) {
			
			
		
		if((i+j)%2 == 0) {
			
			System.out.println(i +" * "+ j + "=" + (i*j) );
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
		else {
			System.out.println(i +" + "+ j + "=" + (i+j) );
		}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadex t = new Threadex();
		Threadex t2 = new Threadex();
		t.start();
		t2.start();

	}

}

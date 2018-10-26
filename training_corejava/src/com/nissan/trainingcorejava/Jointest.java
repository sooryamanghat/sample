package com.nissan.trainingcorejava;


public class Jointest extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(3000);
			}catch(Exception e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jointest t1 = new Jointest();
		Jointest t2 = new Jointest();
		Jointest t3 = new Jointest();
		t1.start();
		
		try {
			t1.join();//main thread waits for t1 to finish theccontinues
		}catch(Exception e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}

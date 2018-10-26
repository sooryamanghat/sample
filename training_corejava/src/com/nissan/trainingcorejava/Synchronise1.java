package com.nissan.trainingcorejava;

class Print{
	int[] b= new int[20];
	 void printValue(int a) {
		 
		// synchronized(this) {
			 int[] b= new int[20];
		for(int i=1;i<=5;i++) {
			b[i] = a*i ;
			System.out.println(b[i]);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
//}
}

class Thread1 extends Thread{
	int[] n = new int[20];
	Print p;
	Thread1(Print p){
		
		this.p=p;
	}
	public void run() {
		 p.printValue(5);
		
	}
}


class Thread2 extends Thread {
	int[] n = new int[20];
	Print p;
	Thread2(Print p){
		
		this.p=p;
	}
	public void run() {
		p.printValue(5);
	}
}
public class Synchronise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print obj = new Print();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 =new Thread2(obj);
		t1.start();
		t2.start();
	}

}

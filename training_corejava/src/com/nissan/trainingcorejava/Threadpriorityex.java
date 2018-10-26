package com.nissan.trainingcorejava;

import java.util.Arrays;
import java.util.Collections;
public class Threadpriorityex extends Thread{
	int[] a = {3,2,5,4,3,2,1};
	String[] b = {"Jerin","Sachin","Shankar","Jeevesh'"};
	public void run() {
		
		if(Thread.currentThread().getPriority()==10) {
			Arrays.sort(a);
			System.out.println("Sorted array");
			for(int i=0;i<7;i++) {
				System.out.println(a[i]+" ");
			}
		}
		else {
			System.out.println("Name list:");
			Arrays.sort(b,Collections.reverseOrder());
			for(int i=0;i<3;i++) {
				System.out.println(b[i]+" ");
			}
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threadpriorityex a = new Threadpriorityex();
		Threadpriorityex a1 = new Threadpriorityex();
		a.setPriority(MAX_PRIORITY);
		a1.setPriority(MIN_PRIORITY);
		a.start();
		a1.start();

	}

}

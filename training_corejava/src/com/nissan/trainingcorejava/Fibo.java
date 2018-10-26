package com.nissan.trainingcorejava;

import java.io.FileOutputStream;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g;
		try {
		FileOutputStream fout = new FileOutputStream("D:\\test.txt");
		int t,f,s;
		f=0;s=1;
		//Byte b = getBytes();
		fout.write(Integer.toString(f).getBytes());
		fout.write(Integer.toString(s).getBytes());
		//System.out.println("Enter number of elements:");
		for(int i =0;i<10;i++) {
			t=f+s;
			fout.write(Integer.toString(t).getBytes());
			f=s;
			s=t;
		}
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}

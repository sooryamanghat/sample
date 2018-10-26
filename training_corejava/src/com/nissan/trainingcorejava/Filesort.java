package com.nissan.trainingcorejava;
import java.io.*;
import java.util.Arrays;

public class Filesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[30];
		try {
			FileOutputStream fout = new FileOutputStream("D:\\test1.txt");
			FileInputStream f = new FileInputStream("D:\\test2.txt");
			int i =0;
			while((a[i++]= f.read()) !=-1){
				
			}
			Arrays.sort(a);
			for(int k=0;k<a.length;k++) {
				fout.write(Integer.toString(a[k]).getBytes());
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

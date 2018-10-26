package com.nissan.trainingcorejava;
import java.util.Arrays;

public class Innersort {
	
	int[] a = {10,20,67,87,2,4,3,1,5,97};
	void srt() {
	Arrays.sort(a);
	}
	
	class inner{
		
		void largest() {
			
			System.out.println(a[a.length-1]+" is the largest element in the array'");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Innersort i = new Innersort();
		Innersort.inner in = i.new inner();
		i.srt();
		in.largest();
	}

}

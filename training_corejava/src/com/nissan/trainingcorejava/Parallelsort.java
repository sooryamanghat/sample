package com.nissan.trainingcorejava;
import java.util.Arrays;

public class Parallelsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {5,10,4,2,30,8,88};
		for(int i: array) {
			System.out.println(i+" ");
		}
		Arrays.parallelSort(array);
		System.out.println("After sorting");
		for(int i:array) {
			System.out.println(i+" ");
		}
	}

}

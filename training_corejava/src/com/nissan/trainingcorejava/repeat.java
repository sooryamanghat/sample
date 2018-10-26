package com.nissan.trainingcorejava;

public class repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,4,5,5,5,8};
		for(int i=0;i<6;i++) {
			for (int j=i+1;j<6;j++) {
				
				
				if(a[i]==a[j]) {
					System.out.println(a[j]+ " at"+ j + "at address" + a+j);
				}
			}
		}
	}

}

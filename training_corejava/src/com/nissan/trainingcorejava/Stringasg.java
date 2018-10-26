package com.nissan.trainingcorejava;

public class Stringasg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"catalans","catacomb","cartoons","dogrydoo","bikes","camoflauge"};
		for(int i=0;i<6;i++) {
			System.out.println("Element at 4:"+str[i].charAt(4)+"\nLength:"+str[i].length());
			System.out.println("substring : "+ str[i].substring(1,2));
		}

	}

}

package com.nissan.trainingcorejava;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb =new StringBuffer("Nissan");
		sb.append("Jerin");
		System.out.println(sb);
		sb.replace(1, 3, "jerin");
		System.out.println(sb);
		sb.delete(1,3);
		sb.reverse();
		System.out.println(sb);

	}

}

package com.nissan.trainingcorejava;

interface Speak{
	 void speaking() ;
}

public class Methodref {
	
	public static void speaksomething() {
		System.out.println("Hello Nissan -  I am static");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Speak s = Methodref::speaksomething;
		s.speaking();

	}

}

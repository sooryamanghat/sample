package com.nissan.trainingcorejava;

interface c1{//abstract class c1
	
	abstract void name();
}

public class Anonymousinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 c = new c1() {
			public void name() {
				System.out.println("Name is jerin");
			}
		};
		c.name();

	}

}

package com.nissan.trainingcorejava;

public class Garbagecollection {
	int a;
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	
	void data() {
		a=88;
		System.out.println("Value of member =" +a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagecollection s1 = new Garbagecollection();
		Garbagecollection s2 = new Garbagecollection();
		
			s1.data();
			s2.data();
			s1=null;
		System.gc();
		s1.data();
		System.out.println(s1.a);
		
		System.out.println("hno");

	}

}

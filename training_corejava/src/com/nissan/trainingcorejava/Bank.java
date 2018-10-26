package com.nissan.trainingcorejava;

abstract class loan{
	
	abstract void roi();
}

class HDFC extends loan{
	void roi() {
		
		System.out.println("Rate of interestfor HDFC = 15%");
	}
	
}
class sib extends loan{
	
	void roi() {
		
		System.out.println("Rate of interest for SIB = 8%");
	}
}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h = new HDFC();
		sib s = new sib();
		h.roi();
		s.roi();

	}

}

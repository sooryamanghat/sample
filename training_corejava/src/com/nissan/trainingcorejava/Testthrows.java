package com.nissan.trainingcorejava;
import java.io.IOException;

public class Testthrows {
	void master()throws IOException{
		
		throw new IOException("Error has occured");
	}
	void slave() throws IOException{
		master();
	}
	
	void puremaster() {
		try {
			slave();
		}catch(Exception e) {
			System.out.println("The error has been handled");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Testthrows obj = new Testthrows();
		obj.puremaster();
		System.out.println("the other parts");

	}

}

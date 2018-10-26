package com.nissan.trainingcorejava;

interface adder{
	
	public void add(int ac,int b);
}
public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adder a = (int ac,int b)->{
			System.out.println(ac+b);
		};
		a.add(2,5);

	}

}

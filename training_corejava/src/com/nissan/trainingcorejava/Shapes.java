package com.nissan.trainingcorejava;


abstract class Area{
	
	abstract void area(int a,int b);
}

class rectangle extends Area{
	
	void area(int a,int b) {
		System.out.println("Area of rectangle = "+a*b);
		
	}
}

class square extends Area{
	
	void area(int a,int b) {
		System.out.println("Area 0f square ="+a*b);
	}
}

class circle extends Area{
	void area(int a, int b) {
		
		System.out.println("Area of circle ="+ 3.14*a*b);
	}
}
class diamond extends Area{
	
	void area(int a,int b) {
		System.out.println("Area of diamond = " +a*b);
	}
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle a = new rectangle();
		square s = new square();
		circle c = new circle();
		a.area(3,4);
		s.area(4,4);
		c.area(5,5);

	}

}

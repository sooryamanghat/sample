package com.nissan.trainingcorejava;


class college{
	
	void courses() {
		
		System.out.println("14 different courses available");
		
	}
	void floors() {
		
		System.out.println("3 floors each in 9 buildings");
	}
	
}

class teacher extends college{
	void dept() {
		
		System.out.println("CSE department");
	}
	
}
public class Student extends college{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		teacher t = new teacher();
		t.courses();
		t.dept();
		s.courses();
		s.floors();
	}

}

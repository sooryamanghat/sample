package com.nissan.trainingcorejava;

class person{
	
	int eid;
	String name;
	int age;
	person(){
		eid = 122345;
		name = "jerin";
		age=22;
	}
}

class salary extends person{
	int sal;
	salary(int i){
		super();
		sal =i;
		
	}
	void modify() {
		int s2 =sal+super.age*sal/100;
		System.out.println("Employee name: "+ name + "\n EID : "+eid+"\nUpdated salary : "+ s2 );
	} 
	
	
}
public class saldeduce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		salary s = new salary(100);
		s.modify();
		

	}

}

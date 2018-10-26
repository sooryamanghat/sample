package com.nissan.trainingcorejava;

public class DefString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =  "Nissan";
		//java string literal
		
		String s1 = new String("  Nissan is where i work  ");
		//using new keyword
		char ch = s.charAt(3); //returns char value at index 2
		int t = s1.length();//returns length of string
		String n = String.format("name is %s",s); // returns formatted string
		int index = s1.indexOf("where");
		
		String j ="jerin";
		String empty = "";
		String notempty = "is not empty";
		System.out.println(empty.isEmpty());
		System.out.println(notempty.isEmpty());
		String joinstr = String.join("-","Hello","to","India");
		System.out.println(joinstr);
		System.out.println(j.concat(" is my name"));
		System.out.println(index);
		System.out.println(s.toLowerCase() +"\n"+ s.toUpperCase());
		System.out.println(s1.trim());//removes back and front spaces
		System.out.println("Substring:"+ s1.substring(2,8));//prints btw the args
		
		System.out.println(n);
		System.err.println(t);
		System.out.println(ch);
		System.out.println(s);
		System.out.println(s1);

	}

}

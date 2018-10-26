package com.nissan.trainingcorejava;

import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		ArrayList<String> name= new ArrayList <String>();
		LinkedList<String> phn = new LinkedList<String>();
		HashSet<String> age = new HashSet<String>();
		LinkedHashSet<String> dob = new LinkedHashSet<String>();
		System.out.println("Enter number of users");
		int k = sc.nextInt();
		//System.out.println("Enter user names");
		for(int i=0;i<k;i++) {
			System.out.println("Enter name");
			name.add(sc.nextLine());
			System.out.println("Enter phn number");
			phn.add(sc.next());
			System.out.println("Enter age");
			age.add(sc.next());
			System.out.println("Enter dob");
			dob.add(sc.next());
			
			
		}
		phn.addAll(name);
		age.addAll(phn);
		dob.addAll(age);
		for(String i: age) {
			System.out.println(i);
		}
		
		
		
		

	}

}

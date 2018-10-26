package com.nissan.trainingcorejava;

import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Rahul");
		ll.add("Jerin");
		ll.add("Shankar");
		Iterator<String> i = ll.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

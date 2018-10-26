package com.nissan.trainingcorejava;

import java.util.*;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> ll = new PriorityQueue<String>();
		ll.add("Rahul");
		ll.add("Jerin");
		ll.add("Shankar");
		
	for(String i : ll) {
		System.out.println(i);
	}
	ll.remove();
	System.out.println("Element removed");
	for(String i : ll) {
		System.out.println(i);
	}
	}


	}



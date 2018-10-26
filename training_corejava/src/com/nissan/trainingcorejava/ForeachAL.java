package com.nissan.trainingcorejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ForeachAL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList <String>();
		ArrayList<String> list1 = new ArrayList <String>();
		list.add("Jerin");
		list.add("Sachin");
		list.add("Raj");
		list.remove("Sachin");
		list1.addAll(list);
		//Iterator i = list.iterator();
		//Iterator m = list1.iterator();
		
		for(String k : list) {
			System.out.println(k);
		}
	}

}

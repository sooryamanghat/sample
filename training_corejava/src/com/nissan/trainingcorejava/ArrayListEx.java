package com.nissan.trainingcorejava;
import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList <String>();
		ArrayList<String> list1 = new ArrayList <String>();
		list.add("Jerin");
		list.add("Sachin");
		list.add("Raj");
		list.remove("Sachin");
		list1.addAll(list);
		
		Iterator i = list.iterator();
		Iterator m = list1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		while(m.hasNext()) {
			System.out.println(m.next());
		}

	}

}

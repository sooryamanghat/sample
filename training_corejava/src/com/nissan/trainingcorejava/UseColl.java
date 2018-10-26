package com.nissan.trainingcorejava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class UseColl {
	static LinkedHashMap<Integer,String> map =new LinkedHashMap<Integer,String>();
	static LinkedHashMap<Integer,Integer> price =new LinkedHashMap<Integer,Integer>();
	static int k=0;
	static void admin( int i) {
		int c;
		Scanner sc = new Scanner(System.in);
		byte data[] = null ;
				FileOutputStream out = null;
				try {
					out = new FileOutputStream("D://a.txt");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					out.write(data);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		System.out.println("Admin Portal \n1.Add product\n2.Remove Product \n3.Add Price \n4.Edit Price");
		c=sc.nextInt();
		switch(c) {
		case 1:
				System.out.println("Enter Product name");
				map.put(i, sc.next());
				break;
		case 2:
			System.out.println("Enter Product name and key");
			String str = new String();
			int cb = sc.nextInt();
			map.remove(cb);
			System.out.println("Item Removed");
			break;
		case 3:
			System.out.println("Enter price");
			price.put(k,sc.nextInt());
			System.out.println("Item Added");
			break;
			
		case 4:
			System.out.println("Edit Price...Enter key first and then price to be filled in");
			price.replace(sc.nextInt(), sc.nextInt());
			
		}
	}
	static void user() {
		System.out.println("available products>>");
		for(Map.Entry m:map.entrySet()) {//method conversion
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Scanner sc = new Scanner(System.in);
		int c=0,ch;
		do {
		System.out.println("\t\tMenu\n1Admin\n2.User\nEnter choice:");
		ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			admin(i++);
			break;
			
		case 2:
			user();
			break;
			
		
		}
		System.out.println("Press 1 to continue");
				c=sc.nextInt();
		}while(c==1);
	}
		
		

}

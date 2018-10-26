package com.nissan.trainingcorejava;
import java.util.Scanner;
public class Sappend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] str = {"jerin","sachin","Shankar","jerin","Pavi","devi","jerin"};
		int[] c = {0,0,0,0,0,0,0};
 		System.out.println(str.length);
		for(int i=0;i<str.length;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				
				if(str[i]==str[j]) {
					c[i]++;
					if(c[i]!=0) {
						System.out.println("Enter last name of first occurance :");
						str[i].concat(sc.next());
						System.out.println("Enter last name of next occurance :");
						str[j].concat(sc.next());
						
					}
					System.out.println("Enter last name of next occurance :");
					str[j].concat(sc.next());
					
				}
			}
		}
		for(int k=0;k<7;k++) {
			System.out.println(str[k]);
	}
	}

}

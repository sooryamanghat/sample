package com.nissan.trainingcorejava;
import java.util.Scanner;

public class Localinnerex {
	
	private int[] arr = new int [30];
	int n;
	Scanner sc = new Scanner(System.in);
	void data() {
		System.out.println("Enter array size");
		n=sc.nextInt();
		System.out.println("Enter values into array.");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		class evenodd{
			int[] ev = new int[20];
			int[] od = new int[20];
 			int e=0,o=0;
			void split() {
				
				for(int j =0;j<n;j++) {
					if(arr[j]%2==0) {
						ev[e++]=arr[j];
					}
					else {
						od[o++]=arr[j];
					}
				}
				System.out.println("Even array");
				for(int k=0;k<e;k++) {
					System.out.println(ev[k]);
				}
				System.out.println("Odd elements");
				for(int k=0;k<o;k++) {
					System.out.println(od[k]);
				}
				
			}
		}
		evenodd e = new evenodd();
		e.split();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Localinnerex l =new Localinnerex();
		l.data();
		

	}

}

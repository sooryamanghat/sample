package com.nissan.trainingcorejava;


interface sort{
	
	default void bubble(int a[],int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]= temp;
				}
			}
		}
		
	}
}
public class Sortinter implements sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sortinter s = new Sortinter();
		int[] a= {10,20,1,4,3,560,345};
		s.bubble(a,7);
		System.out.println("Sorted aray");
		for(int i=0;i<7;i++) {
			System.out.println(a[i]+" ");
		}
		

	}

}

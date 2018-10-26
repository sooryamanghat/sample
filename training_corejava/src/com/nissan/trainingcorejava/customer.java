/**
 * 
 */
package com.nissan.trainingcorejava;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Hp
 *
 */
public class customer {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] names= new String[30];
		int i=0,end;
		do {
		System.out.println("\t\tCUSTOMER DATABASE MANAGEMENT\n\n1.Add a customer\n 2.Delete a Customer \n3.Edit a customer\n Please enter your choice: ");
		int ch = sc.nextInt();
		String st,st1;
		int c;
		
		switch(ch) {
		
		case 1:
			System.out.println("Please enter the customer name : ");
			names[i++]=sc.next();
			Arrays.sort(names);
			System.out.println("Database after operation : ");
			for(int p =0;p<i;p++) {
				System.out.print(names[p]+" ");
			}
			break;
		case 2:
			System.out.println("Enter the customer name");
			st = sc.next();
			for(int j=0;j<i;j++) {
				
				if(st==names[j]) {
					
					for(int k=j;k<i;k++) {
						names[k]=names[k+1];
					}
					i--;
				}
			}
			System.out.println("Database after operation : ");
			for(int p =0;p<i;p++) {
				System.out.print(names[p]+" ");
			}
			break;
			
			
		case 3:
			System.out.println("\n 1.Add last name\n 2.Modify first name \nEnter your choice>>");
			c =sc.nextInt();
			switch(c) {
			case 1:
					System.out.println("Enter the customer name to be modified>>");
					st=sc.next();
					for(int j=0;j<names.length;j++) {
						
						if(st==names[j]) {
							
							System.out.println("Enter Last name:");
							st1=sc.next();
							names[j].concat(st1);
							System.out.println("Name Modified successfully");
							System.out.println("Database after operation : ");
							for(int p =0;p<i;p++) {
								System.out.print(names[p]+" ");
							}
							}
					}
					break;
			case 2:
				System.out.println("Enter the customer name to be modified>>");
				st=sc.next();
				for(int j=0;j<i;j++) {
					
					if(st==names[j]) {
						
						System.out.println("Enter Modification :");
						names[j]=sc.next();
						System.out.println("Name Modified successfully");
						System.out.println("Database after operation : ");
						for(int p =0;p<i;p++) {
							System.out.print(names[p]+" ");
						} 
						}
				}
				break;
			}
			break;
		}
		System.out.println("\nEnter 1 to continue :");
		end = sc.nextInt();
				
		}while(end==1);
		sc.close();
	}

}

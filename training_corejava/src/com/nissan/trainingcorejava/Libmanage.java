package com.nissan.trainingcorejava;
import java.util.Scanner;

interface book{
	abstract void add();
	abstract void remove();
	abstract void update();
	abstract void create();
}
interface use{
	
	abstract void borrow();
	abstract void ret();
}

class library{
	Scanner sc =new Scanner(System.in);
	String[] b = new String[30];
	//String[] user = new String[30];
	int[] c = new int[30];
	int i=0;
	void admin() {
	
	book a = new book() {
		public void add() {
			int f =0;
			String h;
			System.out.println("Books in the library...");
			for(int k=0;k<i;k++) {
				
				System.out.println(b[k]+"-"+c[k]);
				
			}
			
			System.out.println("Enter name of the book to be added :");
			
			
			h=sc.next();
			for(int l =0;l<i;l++) {
				if(h.equals(b[l])) {
					c[l]++;
					f=1;
					break;
				}
			}
			try {
			if(f!=1) {
				b[i]=h;
				c[i]++;
				i++;
				System.out.println("Books in the library...");
				for(int k=0;k<i;k++) {
					
					System.out.println(b[k]+"-"+c[k]);
					
				}
			}
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println(e);
			}
		}
		
		public void remove() {
			String h;
			int f=0;
			System.out.println("Books in the library...");
			for(int k=0;k<i;k++) {
				
				System.out.println(b[k]+"-"+c[k]);
				
			}
			System.out.println("Enter the name of the book to be removed :");
			h = sc.next();
			for(int l=0;l<i;l++) {
				if(h.equals(b[l])) {
					c[l]--;
					f=1;
					break;
				}
			}
			if(f!=1) {
				System.out.println("Book not found ");
				
			}
			else {
				System.out.println("Books in the library...");
				for(int k=0;k<i;k++) {
					
					System.out.println(b[k]+"-"+c[k]);
					
				}
			}
			
		}
		
		public void update() {
			String h;
			int f=0;
			System.out.println("Books in the library...");
			for(int k=0;k<i;k++) {
				
				System.out.println(b[k]+"-"+c[k]);
				
			}
			System.out.println("Enter the name of the book to be updated:");
			h = sc.next();
			for(int l =0;l<i;l++) {
				if(h.equals(b[l])) {
					c[l]++;
					f=1;
					break;
				}
			}
			if(f!=1) {
				System.out.println("Book not found ");
				
			}
			
			
		}
		
		public void create() {
			for(int k=0;k<30;k++){
				c[k]=0;
			}
			int k;
			System.out.println("Enter Number of books enlisted in the library:");
			int n = sc.nextInt();
			System.out.println("Enter the books and count of books one after the other");
			for( k=0;k<n;k++) {
				b[k]=sc.next();
				c[k]+=sc.nextInt();
				
			}
			i=n;
			System.out.println("Books in the library...");
			for(int z=0;z<i;z++) {
				
				System.out.println(b[z]+"-"+c[z]);
				
			}
			
			
		}
		
	};
	
	System.out.println("\t\t ADMINISTRATOR PORTAL\n1.Create Library Database\n2.Add Book\n3.Remove book\n4.Update\nEnter choice:");
	int c = sc.nextInt();
	switch(c) {
	case 1: a.create();
		break;
	case 2:
			a.add();
			break;
	case 3:
			a.remove();
				break;
	case 4:
			a.update();
			break;
	default:
		 	System.out.println("Wrong choice");
		 	break;
		 	
	}
	}
	
	void user() {
		
		use u= new use() {
			public void ret(){
				String h;
				int f=0;
				System.out.println("Enter the name of the book you wish to return:");
				h=sc.next();
				for(int k=0;k<i;k++) {
					if(h.equals(b[k])) {
						c[k]++;
						f=1;
						break;
					}
				}
				if(f!=1) {
					System.out.println("Book not found ");
					
				}
				else {
					System.out.println("Book found and registry updated");
					System.out.println("Books in the library...");
					for(int k=0;k<i;k++) {
						
						System.out.println(b[k]+"-"+c[k]);
						
					}
					
				}
				
				
			}
			public void borrow(){
				String h;
				int f=0;
				System.out.println("Books in the library...");
				for(int k=0;k<i;k++) {
					
					System.out.println(b[k]+"-"+c[k]);
					
				}
				System.out.println("Enter the name of the book you wish to issue:");
				h=sc.next();
				for(int k=0;k<i;k++) {
					if(h.equals(b[k])) {
						c[k]--;
						f=1;
						break;
					}
				}
				if(f!=1) {
					System.out.println("Book not found ");
					
				}
				else {
					System.out.println("Book found and registry updated");
					System.out.println("Books avilable in the library...");
					for(int k=0;k<i;k++) {
						
						System.out.println(b[k]+"-"+c[k]);
						
					}
				}
				
				
			}
			
		};
		
			
		System.out.println("\t\t USER PORTAL\n1.Issue book\n2.Return book\nENter choice:");
		int c = sc.nextInt();
		switch(c) {
		
		case 1:
				u.borrow();
				break;
		case 2:
				u.ret();
				break;
		}
		
		//System.out.println("Enter 1 to enter User portal");
		//p=sc.nextInt();
		
		
	}
	
}

public class Libmanage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p =0;
		int pin =6789,pin1;
		// TODO Auto-generated method stub
		library l =new library();
		do {
		System.out.println("\t\tMenu\n1.Admin\n2.User\nEnter your choice :");
		int ch = sc.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("Please enter Admin pin:");
			pin1 =  sc.nextInt();
			if(pin1==pin) {
			l.admin();
			}
			else {
				System.out.println("Wrong pin. Exiting...");
				break;
			}
			break;
		case 2:
			l.user();
			break;
		default:
				System.out.println("Wrong choice");
				break;
		}
		System.out.println("Enter 1 to return to main menu");
		p=sc.nextInt();
	}while(p==1);

	}

}

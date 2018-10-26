package com.nissan.trainingcorejava;

public class localinner {
	private int data =100;
	void show() {
		//local inner class
		class localclass{
			
			void display() {
				System.out.println(data);
			}
		}
		localclass i = new localclass();
		i.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localinner l = new localinner();
		l.show();
		
		

	}

}

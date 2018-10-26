/**
 * 
 */
package com.nissan.trainingcorejava;

/**
 * @author Hp
 *
 */
interface draw{ //public and abstract
	void drawsomething();
}
interface write{
	void writesomething();	//java8 allows method body for interfaces using default keyword

default void ink() {
	System.out.println("Default method");
}
}
public class Interface implements draw,write {//implements keyword,allows multiple inheritance

	/**
	 * @param args
	 */
	public void drawsomething() {
		System.out.println("This is a method of interface...");
	}
	public void writesomething() {
		System.out.println("This is a method of interface write");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface i = new Interface();
		i.drawsomething();
		i.writesomething();
		i.ink();
	}

}

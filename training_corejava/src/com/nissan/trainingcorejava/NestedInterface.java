package com.nissan.trainingcorejava;

interface writable{
	void write();
	interface Readable{
		void read();
	}
}

public class NestedInterface implements writable.Readable,writable {
	public void read() {
		System.out.println("Inside read method");
	}
	public void write() {
		System.out.println("Inside write");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedInterface n = new NestedInterface();
		n.read();
		n.write();
	}

}

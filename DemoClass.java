package com.sdmcet.cse.oop.simplecalc;

import java.util.Scanner;

class Addition extends Thread {
	int a, b;
	String title;

	Addition(String title, int a, int b) {
		super(title);
		this.title = title;
		this.a = a;
		this.b = b;
		start();
	}

	public void run() {
		System.out.println(this);
		int c = a + b;
		System.out.println("Addition:" + c);
	}
}

class Subtraction extends Thread {
	int a, b;
	String title;

	Subtraction(String title, int a, int b) {
		super(title);
		this.title = title;
		this.a = a;
		this.b = b;
		start();
	}

	public void run() {
		System.out.println(this);
		int c = a - b;
		System.out.println("Subtraction:" + c);
	}
}

class Division extends Thread {
	int a, b;
	String title;

	Division(String title, int a, int b) {
		super(title);
		this.title = title;
		this.a = a;
		this.b = b;
		start();
	}

	public void run() {
		System.out.println(this);
		int c = a / b;
		System.out.println("Division:" + c);
	}
}

class Multiplication extends Thread {
	int a, b;
	String title;

	Multiplication(String title, int a, int b) {
		super(title);
		this.title = title;
		this.a = a;
		this.b = b;
		start();
	}

	public void run() {
		System.out.println(this);
		int c = a * b;
		System.out.println("Multiplication:" + c);
	}
}

public class SimplecalcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
		int b = sc.nextInt();
		Thread t1 = new Addition("Addition", a, b);
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

		Thread t2 = new Subtraction("Subtraction", a, b);
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		Thread t3 = new Division("Division", a, b);
		try {
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
		Thread t4 = new Multiplication("Multiplication", a, b);
		try {
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();

		}

	}
}

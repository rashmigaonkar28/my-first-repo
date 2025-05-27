package com.sdmcet.cse.oop.simplecalc;

import java.util.Scanner;


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

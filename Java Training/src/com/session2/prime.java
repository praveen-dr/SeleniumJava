package com.session2;

import java.util.Scanner;

public class prime {
	
	public static void checkPrime(int number)
	{
		
		System.out.println(+number);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int limit = sc.nextInt();
		checkPrime(limit);
		
		sc.close();
	}

}


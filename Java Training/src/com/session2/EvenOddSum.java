package com.session2;

import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		
		// 1 2 3 4 5
		int count = 1, evenSum = 0, oddSum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value");
		int limit = sc.nextInt();
		
		while(count <= limit){
		//validating the number and adding to respective summation
			if(count%2 == 0)
				evenSum += count;
			else
				oddSum += count;
			count++;
		}
		System.out.println("Even Sum = " + evenSum);
		System.out.println("Odd Sum = " + oddSum);
		
		sc.close();
	}

}

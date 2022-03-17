package com.arrays.demo;

import java.util.Scanner;

public class Array001 {

	public static void main(String[] args) {
		int nums[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + nums.length + " numbers:");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		int sum=0;
		
		for(int i=0; i<nums.length; i++)
			sum = sum + nums[i];
		
		double avg = (double)sum / nums.length;
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		
		sc.close();

	}

}

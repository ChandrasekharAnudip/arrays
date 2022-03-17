package com.arrays.demo;

import java.util.Scanner;

public class Array002 {

	public static void main(String[] args) {
		int nums[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter " + nums.length + " numbers:");
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.println("Enter number to find: ");
		int f = sc.nextInt();
		
		boolean isFound = false;
		
		for(int i=0; i<nums.length; i++) {
			if(f == nums[i]) {
				System.out.println("Number was found");
				isFound = true;
				break;
			}
		}
		
		if(!isFound)
			System.out.println("Number was not found");
		
		sc.close();
	}

}

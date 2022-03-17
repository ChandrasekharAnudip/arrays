package com.arrays.demo;

import java.util.Scanner;

public class Array004 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums[] = new int[5];
		
		System.out.println("Enter " + nums.length + " numbers:");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1;j<nums.length; j++) {
				if(nums[i] > nums[j]) {
					int t = nums[i];
					
					nums[i] = nums[j];
					
					nums[j] = t;
				}
			}
		}
		
		System.out.println("The values in the array after sorting: ");
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		scan.close();
	}

}

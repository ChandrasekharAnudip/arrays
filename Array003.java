package com.arrays.demo;

import java.util.Scanner;

public class Array003 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		
		String names[] = new String[3];
		
		System.out.println("Enter " + names.length + " names:");
		for(int i=0; i<names.length; i++)
			names[i] = sca.next();
		
		System.out.println("Enter a name to find:");
		String name = sca.next();
		
		boolean isFound = false;
		
		for(int i=0; i<names.length; i++)  {
			//if(names[i] == name)
			if(names[i].equals(name)) {
				System.out.println("Name was found");
				isFound = true;
				break;
			}
		}
		
		if(!isFound)
			System.out.println("Name was not found");
		
		sca.close();

	}

}

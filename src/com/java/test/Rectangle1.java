package com.java.test;

import java.util.Scanner;

public class Rectangle1 {
	
		public static void main(String args[])
		{
			float l, b;
			Scanner sc=new Scanner(System.in);
			//system.in - input stream
			
			System.out.println("Enter the value of l:");
			l=sc.nextInt();
			
			System.out.println("Enter the value of b:");
			b=sc.nextInt();
			
			double area=l*b;
			double perimeter= 2*(l+b);
			
			System.out.println("Area="+ area);
			System.out.println("Perimeter="+perimeter);
		}

	}




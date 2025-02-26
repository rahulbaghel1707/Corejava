package com.basic;

import java.util.Scanner;

public class staticvariable {
	static int a;
	void setvalue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A :");
		a=sc.nextInt();
	}
	void printmvalue()
	{
		System.out.println("A :"+a);
	}
	public static void main(String[] args) {
		staticvariable s1=new staticvariable();
		staticvariable s2=new staticvariable();
		staticvariable s3=new staticvariable();
		
		s1.setvalue();
		s2.setvalue();
		s3.setvalue();
		
		s1.printmvalue();
		s2.printmvalue();
		s3.printmvalue();
	}

}

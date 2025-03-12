package com.basic;

import java.util.Scanner;

public class ladder {
	
	public static void main(String[] args) {
		int rno,s1,s2,s3,total;
		double per;
		String sname;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of the student :");
		sname=sc.next();
		System.out.println("Enter Roll no of the student :");
		rno=sc.nextInt();
		System.out.println("Enter marks of s1 :");
		s1=sc.nextInt();
		System.out.println("Enter marks of s2 :");
		s2=sc.nextInt();
		System.out.println("Enter marks of s3 :");
		s3=sc.nextInt();
		
		total=s1+s2+s3;
		per=total/3;
		
		System.out.println("Student name :"+sname);
		System.out.println("Student roll no :"+rno);
		System.out.println("total of marks :"+total);
		System.out.println("percentage of student :"+per);
		
		if(per>=70)
		{
			System.out.println("distiction");
		}
		else if(per>=60)
		{
			System.out.println("first class");
		}
		else if(per>=50)
		{
			System.out.println("second class");
		}
		else if(per>=40)
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}

package com.basic;

class Student1
{
	int rno;
	String sname;
	public Student1()
	{
		
		System.out.println("Default constructor");
	}
	public Student1(int rno,String sname)
	{
		this();
		System.out.println("Paramterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
	
	
}

public class thiskeyword {
    public static void main(String[] args) {

	Student1 s1=new Student1(22,"Rahul");
}
}
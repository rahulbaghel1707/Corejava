package com.basic;

import java.util.Scanner;

public class pyramid {
	public static void main(String[] args) {
		int i,j,k;

	    for(i=5;i>=0;i--)
	    {
	    	for(k=0;k<5-i;k++)
	    	{
	    		System.out.print(" ");
	    	}
	    	for(j=0;j<=i;j++)
	    	{
	    		System.out.print("* ");
	    	}
	    	System.out.println();
	    }
	}
}
	    		
	    	
	    
		
	



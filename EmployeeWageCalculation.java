package com.employewage;

public class EmployeeWageCalculation 
{
	
		 public static void main(String[] args) 
	{
		    	System.out.println(" Welcome to Employee Wage Computation ");
		    	System.err.println(" Let's first check  whether Employee is Present or Absent: -  ");
			
		    	int employee = 1;
		    	double empcheck = Math.floor( Math.random() *10 ) % 2;
			
		    	if ( empcheck == employee )
		    		System.out.println(" Employee is Present Today ");
		    	else
		    		System.out.println(" Employee is Absent Today ");
	}
	
}

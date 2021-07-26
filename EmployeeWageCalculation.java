package com.employewage;

public class EmployeeWageCalculation 
{
		 public static void main(String[] args) 
	{
		    	System.out.println(" Welcome to Employee Wage Computation ");
		    	int Employee_Present = 1;
		    	int WAGE_PER_HR = 20;
		    	int FULL_DAY_HR = 8;
		    	int Total_Wage_Per_Day;
		    	double Employee_Check = Math.floor( Math.random() * 10 ) % 2;
		    	
		    	System.err.println(" Let's first check  whether Employee is Present or Absent: -  ");
		    	if ( Employee_Check == Employee_Present ) 
		    	    {
		    		System.out.println(" Employee is Present Today ");
		    		Total_Wage_Per_Day = FULL_DAY_HR * WAGE_PER_HR;
		    		System.out.println (" Employee wage per day is = " + Total_Wage_Per_Day );
		    		}
		    			else {
		    		    System.out.println(" Employee is Absent Today ");
		    				 }
	
	}
}

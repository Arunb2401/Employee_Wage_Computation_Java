package com.employewage;

public class EmployeeWageCalculation 
{
		 public static void main(String[] args) 
	{
		    	int Employee_Present = 1;
		    	int WAGE_PER_HR = 20;
		    	int FULL_DAY_HR = 16;
		    	int HALF_DAY_HR = 8;
		    	int Total_Wage_Per_Day;
		    	int Employee_Check =(int)Math.floor( Math.random() * 10 ) % 2;
		    	
		    	if ( Employee_Check == Employee_Present ) {
		    		Total_Wage_Per_Day = FULL_DAY_HR * WAGE_PER_HR;
		    		System.out.println (" Employee wage Full day is = " + Total_Wage_Per_Day );
		    		}
		    			else if (Employee_Check != Employee_Present) {
		    					HALF_DAY_HR = HALF_DAY_HR * WAGE_PER_HR;
		    					System.out.println(" Employee wage for Half Day is = " + HALF_DAY_HR);
		    				 }	
	 }
}
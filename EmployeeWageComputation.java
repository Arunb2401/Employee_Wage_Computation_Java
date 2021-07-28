package com.employewage;


public class EmployeeWageComputation { 
     	 static final int PART_DAY_HR = 1; 
     	 static final int FULL_DAY_HR = 2; 
     	 static final int WAGE_PER_HR = 20; 
     	 static final int NUM_OF_WORKING_DAYS = 20; 
     	 public static final int MAX_HRS_IN_MONTH =100 ;
 
     	 public static void main(String[] args) { 
         int empHrs = 0;  
         int TotalEmployeeWage = 0; 
         int TotalWorkingDays=0; 
         int TotalEmpHrs=0; 

         while (TotalEmpHrs<=MAX_HRS_IN_MONTH && TotalWorkingDays<NUM_OF_WORKING_DAYS) {
         int empWage = 0;
        	 TotalWorkingDays++;  
         int Employee_Check = (int) Math.floor(Math.random() * 10) % 3; 
         switch (Employee_Check) { 
              case FULL_DAY_HR: 
                     empHrs = 16; 
                     System.out.println("Employee worked Full Day");
                     break; 
              case PART_DAY_HR: 
                     empHrs = 8; 
                     System.out.println("Employee worked Half Day");
                     break; 
              default: 
                     empHrs = 0; 
                     System.out.println("Employee is Absent");
             		} 
              empWage = empHrs * WAGE_PER_HR; 
              TotalEmployeeWage += empWage; 
              System.out.println("empWage = " + empWage); 
        System.out.println("TotalEmployeeWage = " + TotalEmployeeWage);
     	 } 
         	   
     	 }
 } 
     	 

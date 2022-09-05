package Brigdelabz.java.empwage;

import java.util.Random;

public class EmpWage {
	public static void main(String[] args) {
		
		//Master-Branch
		System.out.println("Welcome to Employee Wage Computation Program :)");
				
		//UC-1-Check Employee is Present or Absent
				Random empCheck = new Random();
		     int n = empCheck.nextInt(2);
		     if (n == 1)
				System.out.println("Employee is Present");
		     else
				System.out.println("Employee is Absent");
				        
				//UC2-Calculate Daily Employee Wage
				int workingHrs = 8;
				int dailyWage = workingHrs * 20 ;
				System.out.println("Daily wage of employee is --> $" + dailyWage );

	}

}

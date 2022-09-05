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

				//UC3-Add Part time Employee & Wage
				int workingHrs1 = 8;
				int dailyWage1 = workingHrs1 * 20 ;
				System.out.println("Part time wage of employee is --> $" + dailyWage1 );
				
				//UC4-Solving using Switch Case Statement
				Random empCheck1 = new Random();
			    int n = empCheck1.nextInt(2);
				int workingHrs11;

				
				
		 switch ((int)(n)) {
				
		  case 0 :
				workingHrs11 = 8;
				System.out.println("Employee is working Part Time");
				System.out.println("Working hours of Employee is --> " + workingHrs11);
			
		        break;
				
		  case 1 :
					workingHrs11 = 8;
					System.out.println("Employee is working Full Time");
					System.out.println("Working hours of Employee is --> " + workingHrs11);
					break;
					
				
				default :
					workingHrs11 = 0;
					break;
				
				}
				


	}

}

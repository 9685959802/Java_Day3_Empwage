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
				
			//UC5-Calculating Wages for a Month
			Random empCheck11 = new Random();
		    int n1 = empCheck11.nextInt(2);
		    int workingHrs111;
			int dailyWage11;
			int empRatePerHr = 20;
			int isFullTime;
			int isPartTime;
			int monthlyWage;
			int workingDays = 20;


			
			
	 switch ((int)(n1)) {
			
	  case 0 :
			workingHrs111 = 8;
			dailyWage11 = empRatePerHr * workingHrs111;
			monthlyWage = dailyWage11 * workingDays;
			System.out.println("Employee is working Part Time");
			System.out.println("Monthly wage of Employee is --> $" + monthlyWage);
		
	        break;
			
	  case 1 :
				workingHrs111 = 8;
				dailyWage11 = empRatePerHr * workingHrs111;
				monthlyWage = dailyWage11 * workingDays;
				System.out.println("Employee is working Full Time");
				System.out.println("Monthly wage of Employee is --> $" + monthlyWage);
				break;
				
			
			default :
				workingHrs111 = 0;
				break;
			
			}



	}

}

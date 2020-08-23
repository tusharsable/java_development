//Program to calculate salary of a employee

public class Employee_wage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		//declaring required variables
		int is_present = 1;
		boolean is_fulltime = true;
		int worked_hour = 0;
		int wage_per_hr = 20;
		int fulltime_hr = 8;
		//getting random integer number 1 for present and 0 if absent
		double attendance = Math.floor(Math.random() * 10 ) % 2;

		//checking if employee is present or not
		if (attendance == is_present) {
			System.out.println("Employee is Present");
			worked_hour = fulltime_hr;
			}
		else
			System.out.println("Employee is absent");

		//calculate wage for day
		int day_wage=worked_hour*wage_per_hr;
		
		System.out.println("The day wage is : "+day_wage);

	}

}

//Program to calculate salary of a employee

public class Employee_wage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		//declaring required variables
		int is_present = 1;
		int is_full_time = 1;
		int worked_hour = 0;
		int wage_per_hr = 20;
		int full_time_hr = 8;
		int part_time_hr = 4;
		//getting random integer number 1 for present and 0 if absent
		double attendance = Math.floor(Math.random() * 10 ) % 2;

		//getting randon integer number 1 for full_time and 0 for part_time employee
		double work_type = Math.floor(Math.random() * 10 ) % 2;

		//checking if employee is present or not
		if (attendance == is_present) {
			System.out.println("Employee is Present");

			if (work_type == is_full_time) {
				
				worked_hour = full_time_hr;
				System.out.println("Full time work done");
					}
			else {
				worked_hour = part_time_hr;
				System.out.println("Part time work done");
				}
			}
		else
			System.out.println("Employee is absent");

		//calculate wage for day
		int day_wage=worked_hour*wage_per_hr;
		
		System.out.println("The day wage is : "+day_wage);

	}

}

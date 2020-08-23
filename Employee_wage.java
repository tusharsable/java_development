//Program to calculate salary of a employee

public class Employee_wage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		//declaring required variables
		int worked_hour = 0;
		int wage_per_hr = 20;
		int full_time_hr = 8;
		int part_time_hr = 4;
		//getting random integer number 1 for present and 0 if absent
		int attendance = (int) Math.floor(Math.random() * 10 ) % 2;

		//getting randon integer number 1 for full_time and 0 for part_time employee
		int work_type = (int) Math.floor(Math.random() * 10 ) % 2;

		//checking if employee is present or not
		switch(attendance)
		{
		// if employee present
		case 1:{
			System.out.println("Employee is Present");
			switch(work_type){

				//if employee works full time
				case 1:{
					worked_hour = full_time_hr;
					System.out.println("Full time work done");
				break;
					}

				//if employee works part time
				case 0: {
					worked_hour = part_time_hr;
					System.out.println("Part time work done");
				break;
					}
				}

			break;

				}
		// if employee is absent
		case 0:
			{
				System.out.println("Employee is absent");
				break;
			}
		}
		//calculate wage for day
		int day_wage=worked_hour*wage_per_hr;
		
		System.out.println("The day wage is : "+day_wage);

	}

}

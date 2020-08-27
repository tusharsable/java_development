//Program to calculate salary of a employee

public class Employee_wage {
	
	public static final int working_days_max = 20;
	public static final int working_hours_max = 100;
	public static final int wage_per_hr = 20;
	public static final int full_time_hr = 8;
	public static final int part_time_hr = 4;
	public static final int is_part_time = 0;
	public static final int is_full_time = 1;

	public static int compute_emp_wage() {
				//declaring required variables
				int worked_hour = 0;
				
		
				for (int day=0;day<working_days_max;day++) {
		
				//getting random integer number 1 for present and 0 if absent
				int attendance = (int) Math.floor(Math.random() * 10 ) % 2;
		
				//getting randon integer number 1 for full_time and 0 for part_time employee
				int work_type = (int) Math.floor(Math.random() * 10 ) % 2;
		
				//checking if employee is present or not
				switch(attendance)
				{
				// if employee present
				case 1:{
		
					switch(work_type){
		
						//if employee works full time
						case is_part_time:{
							//add day work hours to total worked hours
							worked_hour += full_time_hr;
							System.out.println("Full time work done");
						
						break;
							}
		
						//if employee works part time
						case is_full_time: {
							//add day work hours to total worked hours
							worked_hour += part_time_hr;
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
		
				if (worked_hour>=working_hours_max) {
		
					//if working hours cross 100 break out of loop
					System.out.println("100 hours of month are completed");
					break;
		
					}
		
		
		
				}
				//calculate wage for day
				int month_wage=worked_hour*wage_per_hr;
				
				return month_wage;
		
			}
		
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int month_wage=compute_emp_wage();
		System.out.println("The day wage is : "+month_wage);
	}
	
}
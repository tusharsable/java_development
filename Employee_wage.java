//Program to calculate salary of a employee

public class Employee_wage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");

		//declaring required variables
		int Is_Present = 1;

		//getting random integer number 1 for present and 0 if absent
		double attendance = Math.floor(Math.random() * 10 ) % 2;

		//checking if employee is present or not
		if (attendance == Is_Present)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");

	}

}

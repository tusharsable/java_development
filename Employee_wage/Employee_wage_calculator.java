//Program to calculate salary of a employee
import java.util.*;
public class Employee_wage_calculator implements Compute_emp_wage {
    
    private int number_of_companies = 0;
    private  final int is_part_time = 0;
    private  final int is_full_time = 1;
    private ArrayList<Company_emp_wage> company_list;
    private HashMap<String, Company_emp_wage> company_wage_map;

    //Create a list to store all companies
    Employee_wage_calculator() {
        company_list = new ArrayList<Company_emp_wage>();
        company_wage_map = new HashMap<String, Company_emp_wage>();
    }

    //Method to add Companies to our array
    public void add_company(String name,int working_days_max,int working_hours_max,int wage_per_hr) {
        Company_emp_wage company_emp_wage = new Company_emp_wage(name,working_days_max,working_hours_max,wage_per_hr);
        company_list.add(company_emp_wage);
        company_wage_map.put(name,company_emp_wage);
    }

    //Method to compute employee wage of all companies
    public void compute_emp_wage() {
        //
        number_of_companies=company_list.size();
        for (int i=0;i<number_of_companies;i++)
            compute_emp_wage(company_list.get(i));

    }

    //Computaion for wage calculation and assignment
    private int compute_emp_wage(Company_emp_wage company) {
        //declaring required variables
        int worked_hour = 0;
                
        
        for (int day=0;day<company.working_days_max;day++) {
        
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
                            worked_hour += company.full_time_hr;
                           
                        
                        break;
                            }
        
                        //if employee works part time
                        case is_full_time: {
                            //add day work hours to total worked hours
                            worked_hour += company.part_time_hr;
                            
                        break;
                            }
                        }
        
                    break;
        
                    }
                // if employee is absent
                case 0:
                    {
                        //do nothing
                        break;
                    }
        
                }
        
            if (worked_hour>=company.working_hours_max) {
        
                    //if working hours cross 100 break out of loop
                    System.out.println("100 hours of month are completed");
                    break;
        
                }
    
        
        
            }
            //calculate wage for day
            int month_wage=worked_hour*company.wage_per_hr;
            
            //Assign Month wage to company object and return
            company.month_wage=month_wage;
            return month_wage;
    



    }
    public void get_employee_wage(String name) {
        int month_wage = company_wage_map.get(name).month_wage;
        System.out.println("The Wage for emploee of "+name+" is : "+month_wage);
    }
    public static void main(String[] args) {
        //Create object of employee wage calculator
        Compute_emp_wage companies = new Employee_wage_calculator();
        System.out.println("Welcome to Employee Wage Computation Program");

        //Add company templates to the object 
        companies.add_company("Reliance", 25, 120, 40);
        companies.add_company("Dmart", 25, 120, 35);

        //Compute wages of the employee of the respective company and display
        companies.compute_emp_wage();

        //Get wages of respective company by sending name;
        companies.get_employee_wage("Dmart");
        
    }
    
}
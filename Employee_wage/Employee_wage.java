//Program to calculate salary of a employee

public class Employee_wage {
    
	public String name;
	public int month_wage;
    private  int working_days_max;
    private  int working_hours_max;
    private  int wage_per_hr;
    private  final int full_time_hr = 8;
    private  final int part_time_hr = 4;
    private  final int is_part_time = 0;
    private  final int is_full_time = 1;

    Employee_wage(String name,int working_days_max,int working_hours_max,int wage_per_hr) {

        this.name=name;
        this.working_days_max=working_days_max;
        this.working_hours_max=working_hours_max;
        this.wage_per_hr=wage_per_hr;

    }
    public void compute_emp_wage() {
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
                           
                        
                        break;
                            }
        
                        //if employee works part time
                        case is_full_time: {
                            //add day work hours to total worked hours
                            worked_hour += part_time_hr;
                            
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
        
                if (worked_hour>=working_hours_max) {
        
                    //if working hours cross 100 break out of loop
                    System.out.println("100 hours of month are completed");
                    break;
        
                    }
        
        
        
                }
                //calculate wage for day
                this.month_wage=worked_hour*wage_per_hr;
                
                ;
        
            }
        
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Employee_wage reliance = new Employee_wage("Reliance", 25, 120, 40);
        Employee_wage dmart = new Employee_wage("Dmart", 25, 120, 35);
        reliance.compute_emp_wage();
        dmart.compute_emp_wage();
        System.out.println("The monthly wage for reliance "+reliance.month_wage);
        System.out.println("The monthly wage for dmart "+dmart.month_wage);
    }
    
}
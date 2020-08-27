public class Company_emp_wage {
    public String name;
	public int month_wage;
    public  int working_days_max;
    public  int working_hours_max;
    public  int wage_per_hr;
    public  final int full_time_hr = 8;
    public  final int part_time_hr = 4;
    Company_emp_wage(String name,int working_days_max,int working_hours_max,int wage_per_hr) {
        this.name=name;
        this.working_days_max=working_days_max;
        this.working_hours_max=working_hours_max;
        this.wage_per_hr=wage_per_hr;
    }


}
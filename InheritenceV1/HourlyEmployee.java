package InheritenceV1;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double monthlyHours; // aylık çalışma saati
    private double hourlyWage; // saatlik ücret
    

    public HourlyEmployee(String name, LocalDate hireDate){
        /*super(name, hireDate);
        monthlyHours = 200.0;
        hourlyWage = 20.0;*/
        this(name, hireDate, 200.0,20.0); //default çalışma saati ve saatlik ücret
    }
    public HourlyEmployee(String name,LocalDate hireDate,double monthlyHours,double hourlyWage){
        super(name,hireDate);
        disallowZerosAndNegatives(monthlyHours,hourlyWage);
        this.hourlyWage = hourlyWage;
        this.monthlyHours = monthlyHours;
    }
    public double getMonthlyHours() {
        return monthlyHours;
    }
   
    public double getHourlyWage() {
        return hourlyWage;
    }

    public void disallowZerosAndNegatives(double... args){
        for (double d : args) {
            if(d<=0){
                throw new IllegalArgumentException("Zero or Negative argument");
            }
        }
    }
}

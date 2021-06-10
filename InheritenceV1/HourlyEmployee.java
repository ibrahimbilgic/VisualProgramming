
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
        Utils.disallowZerosAndNegatives(monthlyHours,hourlyWage);
        this.hourlyWage = hourlyWage;
        this.monthlyHours = monthlyHours;
    }
    public double getMonthlyHours() {
        return monthlyHours;
    }
    @Override
   public String toString(){
       return super.toString() + " "+monthlyHours+ " " + hourlyWage;
   }
    public double getHourlyWage() {
        return hourlyWage;
    }
    @Override
    double monthlyPay() {
        return 200000;
    }
}

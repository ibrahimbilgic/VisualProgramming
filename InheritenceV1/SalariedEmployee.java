

import java.time.LocalDate;
import java.time.Month;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private final static int MONTH=12;

    public SalariedEmployee(String name, LocalDate hireDate,double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    @Override
    public double monthlyPay(){
        return annualSalary/MONTH;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}

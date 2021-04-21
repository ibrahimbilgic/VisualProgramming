package InheritenceV1;

import java.time.LocalDate;

public abstract class Employee extends Object implements Comparable<Employee>{
    private String name;
    private LocalDate hireDate;

    public Employee(String name,LocalDate hireDate){
        Utils.disallowNullArgs(name,hireDate);
        this.name = name;
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }
   
    public LocalDate getHireDate() {
        return hireDate;
    }
    
    abstract double monthlyPay();
    @Override
    public String toString() {
        return name + " "+ hireDate;
    }
    @Override
    public int compareTo(Employee other){
        return this.hireDate.compareTo(other.hireDate);
    }
}
  


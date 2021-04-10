package InheritenceV1;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name,LocalDate hireDate){
        disallowNullArgs(name,hireDate);
        this.name = name;
        this.hireDate = hireDate;
    }
    public String getName() {
        return name;
    }
   
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void disallowNullArgs(Object... args){
        for (Object object : args) {
            if(args == null){
                throw new IllegalArgumentException("Null Arguments");
            }
        }
    }
  
}

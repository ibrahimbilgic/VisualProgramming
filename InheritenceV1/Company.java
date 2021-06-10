import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(){
        employees.add(new HourlyEmployee("ibrahim", LocalDate.of(2021,01,02)));
        employees.add(1,new SalariedEmployee("zehra", LocalDate.of(2021, 04, 05),200000));
        employees.add(new HourlyEmployee("ozkan", LocalDate.of(2021, 04, 05)));
        
    }
    public void printEmployee(){
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }
    }
    public double monthlyPayroll(){
        double payroll = 0.0;
        for(Employee employee:employees){
            payroll += employee.monthlyPay();
        }
        return payroll;
    }
    public String toString(){
        return employees.toString();
    }
    public void sort(){
        Collections.sort(employees);
        //System.out.println("Çalıştım");
    }
    public static void main(String[] args) {
        /*
        //Employee can = new Employee("Can",LocalDate.of(2021, 6, 4));
        HourlyEmployee ozkan = new HourlyEmployee("Can",LocalDate.of(2021, 6, 4),220.0,25.0);
        Employee ibo = new Employee("ibrahim", LocalDate.of(2020, 3, 5));
        HourlyEmployee zehra = new HourlyEmployee("Zehra", LocalDate.of(2019, 8, 13));

        System.out.println(ozkan.getName());
        System.out.println(ozkan.getHireDate());
        System.out.println(ozkan.getHourlyWage());
        System.out.println(ozkan.getMonthlyHours());

        System.out.println("----------------------------------------------");

        System.out.println(ibo.getName());
        System.out.println(ibo.getHireDate());

        System.out.println("----------------------------------------------");
        //default aylık saat ve saat başı ücret gelecek
        System.out.println(zehra.getName());
        System.out.println(zehra.getHireDate());
        System.out.println(zehra.getMonthlyHours());
        System.out.println(zehra.getHourlyWage());*/

        Company sirket = new Company();

        //sirket.printEmployee();
        //System.out.println(sirket.monthlyPayroll());
        
        System.out.println(sirket.toString());
        sirket.sort();
        System.out.println(sirket.toString());

    }
}

package InheritenceV1;

import java.time.LocalDate;

import javax.naming.ldap.LdapContext;


public class Company {
    public static void main(String[] args) {
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
        System.out.println(zehra.getHourlyWage());

    }
}

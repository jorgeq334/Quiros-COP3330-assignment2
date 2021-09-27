package Ex39;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Sorting {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        Collections.sort(employeeList, new LastNameSort());

        System.out.println("Name" + "                 |  " + "Position            | "+" Separation Date" );
        System.out.println("---------------------|----------------------|----------------------|");

        for (Employee emp : employeeList) {
            System.out.format("%2s %4s       | %12s            |%16s", emp.getFirstName(), emp.getLastName(), emp.getPosition(), emp.getSeparationDate());
            System.out.println();
        }

    }
}
class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getSeparationDate() {
        return separationDate;
    }
    public void setSeparationDate(String separationDate) {
        this.separationDate = separationDate;
    }
}
class LastNameSort implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
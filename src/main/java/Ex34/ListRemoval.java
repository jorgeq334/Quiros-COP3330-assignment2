package Ex34;
import java.util.*;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class ListRemoval {
    public static void main(String[] args) {

        ArrayList employees = new ArrayList(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
        printEmployees(employees);

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = input.nextLine();//

        employees.remove(nameToRemove);

        System.out.println();
        printEmployees(employees);
    }

    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are "+employees.size()+" employees: ");
            for(int i= 0; i < employees.size(); i++){
        System.out.println(employees.get(i));
            }

    }
}

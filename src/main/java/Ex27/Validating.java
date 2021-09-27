package Ex27;
import java.util.*;
import java.util.regex.Pattern;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Validating {
    static String info = "";
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.println("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.println("Enter the employee ID: ");
        String employeeID = input.nextLine();


        validateInput(firstName, lastName, zip, employeeID);

    }


    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {
        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean idFlag = validateEmployeeID(employeeID);
        boolean zipFlag = validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            info = "There were no errors found.";
        }
        System.out.println(info);
    }


    public static boolean validateFirstName(String firstName) {
        boolean check = true;

        if (firstName.length() < 2) {
            info= info + "The first name must be at least 2 characters long.\n";
            check = false;
        }
        if (firstName.length() == 0) {
            info = info + "The first name must be filled in.\n";
            check = false;
        }
        return check;
    }


    public static boolean validateLastName(String lastName) {
        boolean check = true;

        if (lastName.length() < 2) {
            info = info + "The last name must be at least 2 characters long.\n";
            check = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            check = false;
        }
        return check;
    }

    public static boolean validateZipCode(String zip) {
        boolean check = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) {
                info = info + "The zipcode must be a 5 digit number.\n";
                check = false;
            }
        } catch (Exception e) {
            info = info + "The zipcode must be a 5 digit number.\n";
            check = false;
        }
        return check;
    }

    public static boolean validateEmployeeID(String employeeID) {
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(pattern, employeeID)) {
            info = info + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }

}

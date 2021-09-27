package Ex25;
import java.util.*;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Password {
    public static void passwordValidator(String input){
        int number= input.length();
        boolean lowerCase = false, upperCase = false, digit = false, specialChar= false;
        Set set= new HashSet(Arrays.asList('!','@','#','$','^','%','&','*','(',')','-','+'));
        for(char i : input.toCharArray()){
            if(Character.isLowerCase(i)){
                lowerCase = true;
            }
            if(Character.isUpperCase(i)){
                upperCase = true;
            }
            if(Character.isDigit(i));{
                digit = true;
            }
            if(set.contains(i)){
                specialChar = true;
            }
        }
        if((digit && lowerCase && specialChar) || (digit && upperCase && specialChar)  && (number >= 8)){
            System.out.println(input + " is a very strong password");
        }
        else if((lowerCase && digit || upperCase && digit ) && (number >= 8)){
            System.out.println(input + " is a strong password");
        }
        else if(lowerCase || upperCase && (number < 8)){
            System.out.println(input + " is a weak password");
        }
        else{
            System.out.println(input + " is a very weak password");
        }
    }
    public static void main(String[] args){
        String input;
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter your password:");
        input= in.nextLine();
        passwordValidator(input);
    }
}

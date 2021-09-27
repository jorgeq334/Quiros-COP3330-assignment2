package Ex31;
import java.util.*;
import java.lang.*;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Karvonen {
    public static void main (String[] args) throws java.lang.Exception
    {
        int restingHR,age;
        Scanner input=new Scanner(System.in);
        System.out.println("Please introduce your age:");
        age = input.nextInt();
        System.out.println("Please introduce resting heart rate:");
        restingHR = input.nextInt();


        System.out.println("Resting Pulse: " + restingHR + " Age: " + age);

        int intensity = 55;
        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(intensity<96){
            int target = (((220 - age) - restingHR) * intensity/100) + restingHR;
            System.out.println(intensity+"% | "+target +"bpm");
            intensity+=5;
        }
    }
}

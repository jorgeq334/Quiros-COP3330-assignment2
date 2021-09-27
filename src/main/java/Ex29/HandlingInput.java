package Ex29;
import java.util.*;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class HandlingInput {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        boolean check=false;
        while(true)
        {
            try
            {
                System.out.println("What is the rate of return? ");
                int r=Integer.parseInt(input.next());
                System.out.println("It will take "+(72/r)+" years to double your initial investment.");
                check=true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if(check)
            {
                break;
            }

        }
    }
}

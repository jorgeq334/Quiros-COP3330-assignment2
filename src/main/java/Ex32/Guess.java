package Ex32;
import java.util.*;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Guess {
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        int number;
        number = (int) (Math.random() * 999 + 1);
        Scanner input = new Scanner(System.in);
        int guess, count=0,level;
        boolean check = true;

        while(check){


            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            level=input.nextInt();
            if(level==1)
                number = (int) (Math.random() * 10 + 1);
            else if(level==2)
                number = (int) (Math.random() * 100 + 1);
            else
                number = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = Integer.parseInt(input.next());
                count++;
                if (guess == number){
                    System.out.println("You got it in "+count+"  guesses!");
                }
                else if (guess < number)
                    System.out.println("Too low. Guess again: ");
                else if (guess > number)
                    System.out.println("Too high. Guess again: ");

            }while (guess != number);
            count=0;
                System.out.print("\nDo you wish to play again (Y/N)? \n ");
                char play = input.next().charAt(0);
                if (play == 'N' || play == 'n') {
                    System.out.println("Thank you for playing");
                    check = false;
                }

        }

    }
}

package Ex33;
import java.util.*;
import java.util.Random;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Magic8 {
    public static void main(String[] args) {

        String[] response = {"Yes","No","Maybe","Ask again later"};

        Random random = new Random();

        Scanner input = new Scanner(System.in);

        System.out.println("What's your question?");
        String question = input.nextLine();

        int randomResponseIndex = random.nextInt(response.length);
        String answer = response[randomResponseIndex];

        System.out.println(answer);
    }
}

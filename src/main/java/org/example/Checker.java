package org.example;
import java.util.*;
/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Checker {
    static boolean isAnagram(String word1,String word2){
        String w1 = word1.replaceAll("\\s", "");
        String w2 = word2.replaceAll("\\s", "");
        boolean check = true;
        if (w1.length() != w2.length()) {
            check = false;
        } else {
            char[] arrayWord1 = w1.toLowerCase().toCharArray();
            char[] arrayWord2 = w2.toLowerCase().toCharArray();
            Arrays.sort(arrayWord1);
            Arrays.sort(arrayWord2);
            check= Arrays.equals(arrayWord1, arrayWord2);
        }
        if(check){
            return true;
        } else{
            return false;
        }
    }

    public static void main( String[] args )
    {
        Scanner input= new Scanner(System.in);
        System.out.println( "Enter two strings and I'll tell you if they are anagrams:" );
        System.out.println( "Enter the first string:" );
        String word1= input.nextLine();

        System.out.println( "Enter the second string:" );
        String word2= input.nextLine();
        if(isAnagram(word1, word2)) {
            System.out.println(word1 + " and " + word2 + " are anagrams.");
        }
        else{
            System.out.println( word1 + " and " + word2 +" are not anagrams." );
        }
    }
}

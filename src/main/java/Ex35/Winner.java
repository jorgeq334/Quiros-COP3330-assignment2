package Ex35;
import java.util.*;

/**
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Quiros
 */
public class Winner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = null;
        ArrayList nameList = new ArrayList();

        do {
            System.out.println("Enter a name:");
            name= input.nextLine();
            if(!name.isEmpty())
                nameList.add(name);
        }while(!name.isEmpty());

        Random random = new Random();
        int index = random.nextInt(nameList.size());
        System.out.println("The winner is... "+nameList.get(index));

    }
}

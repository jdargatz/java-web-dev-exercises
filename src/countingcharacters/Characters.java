package countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Characters {
    public static void main(String[] args) {
        //initialize input from user
        Scanner input = new Scanner(System.in);
        System.out.println("What quote do you like best?: ");
        String answer1 = input.nextLine().toLowerCase(); // user quote
        System.out.println("What letter do you want to count in your quote?: ");
        String answer2 = input.nextLine().toLowerCase(); // user letter
        char n = answer2.charAt(0); // convert letter to char
        input.close(); // close scanner
        ArrayList<Character> count = new ArrayList<>(); //initialize new arraylist
        char[] charactersInString = answer1.toCharArray(); // turn that quote into a char array
        for (char c : charactersInString) { // for each character in quote array
            if (c == n) { // if character = user selected letter
                count.add(c); // add that letter to my new count arraylist
            } // end if
        } // end for each
        System.out.println("There were " + count.size() + " instances of " + n + "."); // sum of count arraylist using .size() method
    } // end main
} // end class

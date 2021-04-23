package countingcharacters;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Characters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What letter do you want to count in a quote from Hidden Figures?: ");
        String answer = input.nextLine();
        char n = answer.charAt(0);
    String hiddenFigure = "If the product of two terms is zero then common sense says at least one of the two terms " +
            "has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
            "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, " +
            "it’s pretty straightforward from there.";
        input.close();
        ArrayList<Character> count = new ArrayList<>();
        char[] charactersInString = hiddenFigure.toCharArray();
        for (char c : charactersInString) {
            if (c == n) {
                count.add(c);
            }
        }
        System.out.println("There were " + count.size() + " instances.");
    } // end main
} // end class

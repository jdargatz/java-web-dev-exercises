package exercises;
import java.util.Scanner;


public class AreaofRectangle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Hello, what the length of the rectangle?:");
    int length = input.nextInt();
    System.out.println("Hello, what the width of the rectangle?:");
    int width = input.nextInt();
    int area = length * width;
    System.out.println("The area of your rectangle is " + area);
    input.close();
    }

}

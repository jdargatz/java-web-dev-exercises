package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // take a number from the user for area
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to use?: ");
        int number = Integer.parseInt((input.nextLine()));
        //Integer.parseInt will take whatever is wrapped in it and turns it into a number - like Number() in JavaScript
        System.out.println("This is your doubled number: " + DoubleMe(number));
        System.out.println("What's the radius of your circle?: ");
        double radius = input.nextInt();

        //double pi = 3.14;
        //double area = pi * radius * radius;
        System.out.println("The area of your circle is: " + Circle.getArea(radius));
    }
    public static int DoubleMe (int num) {
        return num * 2;
    }
}

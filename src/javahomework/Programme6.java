package javahomework;
//* Write a java program to input any number and find out if it’s odd or even */

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
Programme6 obj1 = new Programme6();
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter any number ");
        int number =scan1.nextInt();
        System.out.println(number + " is " + obj1.oddOrEven(number) );
scan1.close();

    }

    public String oddOrEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
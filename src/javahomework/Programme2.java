package javahomework;

import java.util.Scanner;

//* Write a java program to input any year like (ex.2007) and find out if it is leap year or
//not? */
public class Programme2 {
    public static void main(String[] args) {
        Programme2 prg = new Programme2();       //object creation
        Scanner scanner = new Scanner(System.in);    //scanner
        System.out.println("Enter a year ");
        int year = scanner.nextInt();
        prg.leapYear(year);        //method calling
scanner.close();
    }

    public void leapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year ");
        }

    }

}

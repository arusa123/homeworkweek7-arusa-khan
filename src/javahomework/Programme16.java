package javahomework;
//* Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO” */

import java.util.Scanner;

public class Programme16 {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan2.nextInt();

        if (a>0 ) {
            System.out.println("It's positive");
        } else if (a<0) {
            System.out.println("Number is negative ");
        } else {
            System.out.println("Number is zero");
        }
        {
            }
        scan2.close();
        }

    }


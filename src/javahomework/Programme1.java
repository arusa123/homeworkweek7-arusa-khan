package javahomework;
//*Write a java program that tells us that Input number is odd or even?
// */

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);     //scanner
        System.out.println("Enter the number: ");
        int number = scan.nextInt();
 String even_Odd = (number%2==0)? "even" : "odd";    //ternary operator
        System.out.println(number + " is " +even_Odd);        //print statement
scan.close();            //close scanner
    }

}

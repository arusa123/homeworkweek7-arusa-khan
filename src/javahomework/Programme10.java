package javahomework;
//*.Write a java program to input any two number and ask user to enter their symbol (+, -,  /, *)
// find addition, Subtraction,
// multiplication and division according to their symbol  (using if else) */


import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number ");              //output
        int a =scan.nextInt();
        System.out.println("Enter second number ");
        int b = scan.nextInt();
        System.out.println("Enter a symbol +,-,*,/");
        char symbol = scan.next().charAt(0);            //char scan
        calculate(a,b,symbol);
        scan.close();
    }
    public static void calculate(int a, int b, char symbol){
        if (symbol=='+'){
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if (symbol=='-') {
            System.out.println(a+" - " + b + " = " + (a-b));
        } else if (symbol=='*') {
            System.out.println(a + " * " + b + " = " + (a*b));
        } else if (symbol=='/') {
            System.out.println(a + " / " + b + " = " + (a/b));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }

    }
}

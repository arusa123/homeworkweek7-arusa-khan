package javahomework;

//* Write a program that tells us input value is number or an alphabet or symbol.*//

import java.util.Scanner;

public class Programme12 {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter a character ");             //output
        char c = java.next().charAt(0);
        java.close();                 //scanner close


        if (c>='0' && c<= '9'){                                  //if statement
            System.out.println("Input is a number ");
        } else if (c>= 'a'  && c<= 'z') {
            System.out.println("Input is a alphabet ");
        } else{
            System.out.println("Input is a symbol");
        }
    }



}

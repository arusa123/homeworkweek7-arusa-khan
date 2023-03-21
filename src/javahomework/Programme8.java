package javahomework;
//*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry */


import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Programme8 city1 = new Programme8();         //creating object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an alphabet between A-F");
        String name = scan.nextLine();
city1.cityName(name);
scan.close();
    }
              //Instance Method
    public void cityName(String city){
        if (city.equalsIgnoreCase("A")) {
            System.out.println("City name is Aberdeen ");
        } else if (city.equalsIgnoreCase("B")) {               //using if-else statement
            System.out.println("City name is Bolton");
            } else if (city.equalsIgnoreCase("C")) {
            System.out.println("City name is Cairo ");
        } else if (city.equalsIgnoreCase("D")) {
            System.out.println("City name is Delhi ");
        } else if (city.equalsIgnoreCase("E")) {
            System.out.println("City name is Edinburgh");
        } else if (city.equalsIgnoreCase("F")) {
            System.out.println("City name is Faisalabad");
        } else{
            System.out.println("not a valid selection");
        }
    }
    }




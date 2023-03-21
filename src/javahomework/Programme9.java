package javahomework;
//* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry using switch statement */


import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
            Programme9 obj = new Programme9();
        Scanner scan1 = new Scanner(System.in);
        System.out.println(" Enter an alphabet from A-F ");
        String name = scan1.nextLine();
        obj.switchStatement(name);
scan1.close();

    }

    public void switchStatement(String name){
        switch (name) {
            case "A":
                System.out.println("Abardeen");
                break;
            case "B":
                System.out.println("Bolton");
                break;
            case "C":
                System.out.println("Cairo");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Faisalabad");
                break;
            default:
                System.out.println("Invalid alphabet");
        }

    }
}

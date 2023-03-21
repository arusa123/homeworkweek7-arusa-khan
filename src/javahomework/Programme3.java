package javahomework;
//*Write a java program to input student Name, roll No, and three subjects Math, Science and
//English marks (marks is between 0 and 100 and if it is out of range print error message “Invalid
//Input, Marks should between 0 and 100”) and find out total, percentage and result.
//If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
//%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

import java.util.Scanner;


public class Programme3 {
    static double percentage;
    static String name;
    static int rollNum;
    static int totalMarks;

    static int math;
    static int science;
    static int english;


    public static void main(String[] args) {
        Scanner scan12 = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = scan12.nextLine();
        System.out.println("Enter student roll No: ");
        rollNum = scan12.nextInt();
        System.out.println("Enter Marks of Math: ");

        math = scan12.nextInt();
        if (math < 0 || math > 100) {
            System.out.println("Invalid input, marks should be between 0 and 100");
            math = scan12.nextInt();
        }
        //Science
        System.out.println("Enter Science Marks ");
        science = scan12.nextInt();
        if (science < 0 || science > 100) {
            System.out.println("Invalid input, marks should be between 0 and 100 ");
            science = scan12.nextInt();
        }
        //english
        System.out.println("Enter English Marks: ");
        english = scan12.nextInt();
        if (english < 0 || english > 100) {
            System.out.println("Invalid input, marks should be between 0 and 100 ");
            english = scan12.nextInt();
        }
        // total
        totalMarks = (math + science + english);
        percentage = (totalMarks * 100 / 300);

        //String result = totalMarks(math, english, science);
        printTheMarkSheet(math, science, english, percentage);

    }

    public static String passFail(int math, int english, int science) {
        if (math >= 35 && science >= 35 && english >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String grade(double percentage, int math, int english, int science) {
        String grade = null;
        if (percentage >= 80 && math > 35 && english > 35 && science > 35) {
            grade = "A+";
        } else if (percentage >= 60 && percentage < 80 && math > 35 && english > 35 && science > 35) {
            grade = "A";
        } else if (percentage >= 50 && percentage <= 59 && math > 35 && english > 35 && science > 35) {
            grade = "B";
        } else if (percentage >= 35 && percentage <= 49 && math > 35 && english > 35 && science > 35) {
            grade = "C";
        } else if ((percentage < 35) || math < 35 || english < 35 || science < 35) {
            grade = "Fail";
        }
        return grade;
    }
            //mark sheet
    public static void printTheMarkSheet(int m, int s, int e, double p) {
        System.out.println("|------------------------------|");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|------------------------------|");
        System.out.println("|Name     :          " + name + "  |");
        System.out.println("|Roll No   :        " + rollNum + "|");
        System.out.println("|______________________________|");
        System.out.println("|Subject   :          Marks    |");
        System.out.println("|------------------------------|");
        System.out.println("|Math      :         " + m + "     |");
        System.out.println("|Science   :         " + s + "     | ");
        System.out.println("|English   :         " + e + "     |");
        System.out.println("|------------------------------|");
        System.out.println("Total    :" + totalMarks + "|");
        System.out.println("-------------------------------|");
        System.out.println("|Percentage :    " + percentage + "|");
        System.out.println("Result :            " + passFail(m, s, e) + "  |");
        System.out.println("Grade :            " + grade(p,m,s,e) + "  |");
        System.out.println("|-------------------------------|");

    }

}

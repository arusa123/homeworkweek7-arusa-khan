package javahomework;
//*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross  salary
// HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
// PF= Basic salary 20%
// Gross salary = basic salary + HRA + TA + DA –PF
//Print in following format
//_______________________________
//| Salary Slip |
//|______________________________|
//| Employee Id : 2564 |
//| Employee Name : Jay |
//|______________________________|
//| Basic Salary : 25000.0 |
//| HRA 10% : 2500.0 |
//| TA 8% : 2250.0 |
//| DA 9% : 2000.0 |
//| PF - 20& : 5000.0 |
//|______________________________|
//| Gross Salary : 26750.0 |

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter employee id ");
        int id = scan.nextInt();
        System.out.println("Enter employee name ");
        String name1 = scan.next();
        System.out.println("Enter basic salary ");
        int basicSalary = scan.nextInt();
        scan.close();
//        calculateDA(basicSalary);
//        calculateHRA(basicSalary);
//        calculatePF(basicSalary);
//        calculateTA(basicSalary);

double hra= calculateHRA(basicSalary);
double da = calculateDA(basicSalary);
double ta = calculateTA(basicSalary);
double pf = calculatePF(basicSalary);
double grossSalary = basicSalary+hra+da+ta-pf;
//String salarySlip= (id,name1,basicSalary);


   // public static void salarySlip(int id, String name1, int basicSalary){
        System.out.println("|-------------------------------------|");
        System.out.println("| Salary Slip                         |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Employee Id:                        |");
        System.out.println("| Employee Name:           "+name1+"  |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Basic Salary:        "+basicSalary+"|");
        System.out.println("| HRA 10% :              "+ hra+"     |");
        System.out.println("| TA 8%   :                  "+ta+"   |");
        System.out.println("| DA 9%   :                   "+da+"  |");
        System.out.println("| PF -20% :                 "+pf+"    |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Gross salary :      "+grossSalary+" |");
    }



    //calculate HRA,DA,TA,PF
    public static double calculateHRA(double basicSalary){
        return (basicSalary*10)/100;
    }
    public static double calculateDA(double basicSalary){
        return (basicSalary*8)/100;
    }
    public static double calculateTA(double basicSalary){
        return (basicSalary*9)/100;
    }
    public static double calculatePF(double basicSalary){
        return (basicSalary*20)/100;
    }

}

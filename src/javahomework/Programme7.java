package javahomework;

import java.util.Scanner;

//*Write a java program input sales id, seller's name, sales amount, and salary basic and  then fined this sales
//Commission
// Sales amount >= 50,000 35%
// Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2% */
public class Programme7 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter sale Id ");
        int saleId = scan1.nextInt();
        System.out.println("Enter seller's name ");
        String sellerName = scan1.next();
        System.out.println("Enter sales amount ");
        int saleAmount = scan1.nextInt();
        System.out.println("Enter salary basic ");
        int salaryBasic = scan1.nextInt();
        Programme7 sale = new Programme7();
        sale.calculateCommission(saleAmount,salaryBasic);
        scan1.close();
    }
    public void calculateCommission(int saleAmount, int salary ){
        int commission;
        if (saleAmount >=50000){
            commission= (salary * 35)/ 100;
            System.out.println("sale commission is " + commission);
            } else if (salary >=30000 && saleAmount <49999) {
            commission= (salary * 20)/100;
            System.out.println("Sale commission is  " + commission);
        } else if (saleAmount>=20000 && saleAmount <29999){
            commission= (salary*10)/100;
            System.out.println("Sale commission is " + commission);
        } else if (saleAmount>=10000 && saleAmount <=19999){
            commission= (salary*5)/100;
            System.out.println("Sale commission is " + commission);
        } else{
            commission=(salary*2)/100;
            System.out.println("Sale commission is " + commission);
        }


    }
            }


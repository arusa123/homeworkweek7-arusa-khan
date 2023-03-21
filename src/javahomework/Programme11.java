package javahomework;
//*Write a java program to print the numbers between 1 and 100
// which can be divided by 3  and 5 separately.*/
public class Programme11 {
     public static void main(String [] args){
         System.out.println("Number divided by 3 are: ");
         for (int a =1; a <= 100; a++){
             divided3(a);
         }
         System.out.println("--------------");
         System.out.println("number divisible by 5 are: ");
         for (int b=1; b<= 100; b++){
             divided5(b);

         }
     }
     public static void divided3(int number1){
         if (number1 % 3==0){
             System.out.println(number1 + ", ");
         }

     }

     public static void divided5(int number){
         if (number%5==0){
             System.out.println(number + " ," );
         }
     }

}

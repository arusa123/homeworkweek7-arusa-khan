package javahomework;

import java.util.Arrays;

//*Write a Java program to sort a numeric array and a string array. */
public class Programme17 {
    public static void main(String[] args) {
        int [] num = {10, 20, 30, 40};
        String arrayName [];
         String[] name= {"Arusa ", "Nauman ", "Ayesha", "Ibrahim"};

        Arrays.sort(num);            //Numeric array
        System.out.println("Sorted numeric array :" + Arrays.toString(num));

        Arrays.sort(name);           //String array
        System.out.println("Sorted string array " + Arrays.toString(name));

    }
}

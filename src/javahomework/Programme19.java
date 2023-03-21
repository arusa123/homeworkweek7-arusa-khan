package javahomework;
//*Write a Java program to calculate the average value of array elements.*/

import java.util.Arrays;

public class Programme19 {
    public static void main(String[] args) {
        int numArray[]= {2,4,6,18};
        int sum = 0;
        for (int i=0; i< numArray.length; i++){
            sum= + numArray[i];
        }
        int average = sum/numArray.length;

        System.out.println("Value of array elements " + Arrays.toString(numArray));
        System.out.println("Average of array elements: " + average);
    }
}

package javahomework;

//*Write a Java program to sum values of an array. */
public class Programme18 {
    public static void main(String[] args) {
        //Approach
        int numArray[] = {2, 4, 6, 8};
        int sum = 0;
for (int i=0 ; i< numArray.length; i++){
    sum += numArray[i];
}
        System.out.println("Sum of an array:" + sum);
    }
}

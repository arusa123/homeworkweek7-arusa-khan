package javahomework;
//*Write a Java program to test if an array contains a specific value.*/

public class Programme20 {

    public static boolean array(int[] array, int item){
        boolean value = false;
        for (int i=0; i<array.length; i++){
            if (array[i]==item){
                value = true;
                break;
            }
        }
return value;
    }

    public static void main(String[] args) {
        int [] array = {20,60,80,100};
        System.out.println(array(array,100));
    }
}

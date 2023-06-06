package arrays;

import java.util.Scanner;

public class ArrayHandling {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] myInteger = getInteger(8);
        for (int i=0; i<myInteger.length;i++){
            System.out.println("Element"+i+"typed value"+myInteger[1]);
        }
        //positioning elements
       // int [] number = new int[50];// {1,2,3,4,5,6,7,8,9,10};
//        System.out.println( number[0]);
//        System.out.println( number[1]);
//        System.out.println( number[2]);
//        System.out.println( number[3]);
//        System.out.println( number[7]);
//        System.out.println( number[5]);
        // using for loop
//        for (int i= 0; i<number.length;i++){
//            number[i] =i*20;
//        }
//        //passing array methode
//        printArray(number);
//    }
//    public static void printArray(int[] array){
//        for (int i =0; i<array.length;i++){
//            System.out.println("Number"+i+"value"+array[i]);
//        }
    }
    public static int [] getInteger(int number){
        System.out.println("Enter"+ number+"integer value.\r");
       int [] value = new int[number];
       for (int i = 0;i<value.length;i++){ 
          value[i] = scanner.nextInt();
       }
       return value;
    }
    //reserve array

}

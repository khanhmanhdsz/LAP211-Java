/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0001 {

    public static final Scanner sc = new Scanner(System.in);

    //bubbleSort
    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    //check input n
    public static int checkInputN(){
        int n =0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    return n;
                } else {
                    System.out.print("n must >0, Please enter n again: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Value of n must be digit!, Please enter n again: ");
            }
        }
    }
    
    public static void check(String str) {
        System.out.print(str);
        int n = checkInputN();       
        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = checknumber("arr["+i+"]= ");
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(arr.length);
        }
        //input
        System.out.print("Unsorted array: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.print("]");
        System.out.println("");
        //sort
        bubbleSort(arr);
        //output
        System.out.print("Sorted array: [");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.print("]");
        System.out.println("");
    }
    
//    //check input element of array
//    public static int checknumber(String mess){
//        System.out.print(mess);
//        int n=0;
//        while (true) { 
//                try {                   
//                    n= Integer.parseInt(sc.nextLine());     
//                    break;
//                } catch (NumberFormatException e) {
//                    System.out.print("Value of arr must be digit!,");
//                    System.out.print(mess);
//                }
//            }
//        return n;
//    }

    public static void main(String[] args) {
        J1SP0001 a = new J1SP0001();
        a.check("Enter n: ");
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0002;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0002 {

    public static final Scanner sc = new Scanner(System.in);

    //SelectionSort
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (arr[min] != arr[i]) {
                int tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }

        }
    }//1 3 10 6 8

//    //check input n
//    public static int checkInputN(){
//        int n =0;
//        while (true) {
//            try {
//                n = Integer.parseInt(sc.nextLine());
//                if (n > 0) {
//                    return n;
//                } else {
//                    System.out.print("n must >0, Please enter n again: ");
//                }
//            } catch (NumberFormatException e) {
//                System.out.print("Value of n must be digit!, Please enter n again: ");
//            }
//        }
//    }
    public static void check(String mess) {
        System.out.print(mess);
        int n = checknumber("Enter n: ", 1, Integer.MAX_VALUE);
        int arr[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Random().nextInt(arr.length);
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checknumber("arr[" + i + "]= ", Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        //Input
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
        //Sort array
        selectionSort(arr);
        //Output
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

    //check input element of array
    public static int checknumber(String mess, int min, int max) {
        System.out.print(mess);
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    System.out.println("Please input number in rage [" + min + ", " + max + "]");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("Value of arr must be digit!,");
                System.out.print(mess);
            }
        }
        return n;
    }

    public static void main(String[] args) {
        J1SP0002 a = new J1SP0002();
        a.check("Enter n: ");
    }

}

//    public void insertionsort(int arr[]) {
//        int i, key, j;
//        for (i = 1; i < arr.length; i++) {
//            key = arr[i];
//            j = i - 1;
//
//            /* Move elements of arr[0..i-1], that are
//        greater than key, to one position ahead
//        of their current position */
//            while (j >= 0 && arr[j] > key) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = key;
//        }
//    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h206;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH206 {

    final public static Scanner sc = new Scanner(System.in);

    //check input element of array
    public static int checknumber(String mess, int min, int max) {
        System.out.print(mess);
        int n = 0;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    System.out.println("Please input number in rage [" + min + ", " + max + "]");
                    System.out.print(mess);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Value input must be digit");
                System.out.print(mess);
            }
        }
        return n;
    }
    
    public static void printSquare(int min,int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                if (j!=i) {
                    System.out.print(Math.abs(j));                    
                }else System.out.print(j);
            }//-4-3 43
            for (int j = min; j < i; j++) {
                System.out.print(Math.abs(j));
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        J1SH206 a = new J1SH206();
        int min,max;
        min = checknumber("Enter min number: ",Integer.MIN_VALUE,Integer.MAX_VALUE);     
        max = checknumber("Enter max number: ",min,Integer.MAX_VALUE);      
        a.printSquare(min, max);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //    public static void printSquare() {
//        int min = checkInputInt("Enter min number: ");
//        int max = checkInputmax("Enter max number: ", min);
//        int min1 = min;
//        int min2 = 0, min3 = 0;
//        int sub = max - min1 + 1;
//        for (int i = 0; i < sub; i++) {
//            int count = 0;
//            int count1=0;
//            for (int j = 0; j < sub; j++) {
//                if (min <= max) {
//                    System.out.print(min);
//                    min++;
//                    count++;
//                    if (count == 1) {
//                        min2 = min;
//                        min3 = min1;
//                    }
//                }
//                
//                if (min > max && count <sub) {
//                    count1++;
//                    if (count1>1) {
//                        System.out.print(min3);
//                        min3++;
//                    }                   
//                }
//            }
//            System.out.println("");
//            min = min2;
//        }
//    }

}

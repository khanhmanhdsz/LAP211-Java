/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h208;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH208 {

    final public static Scanner sc = new Scanner(System.in);

    //check user input Int
    public static int checkInputInt(String mess) {
        System.out.print(mess);
        //loop until user input correct
        while (true) {
            try {
                int min = Integer.parseInt(sc.nextLine());
                return min;
            } catch (NumberFormatException e) {
                System.err.println("Please input number Interger");
                System.out.print(mess);
            }
        }
    }

    public static int swapDigitPairs(int num) {
        int power = 1;
        int swapNum = 0;
        while (num >= 10) {
            int digit1 = num % 10;
            num /= 10;
            if (num <= 0) {
                break;
            }
            int digit2 = num % 10;
            num /= 10;
            swapNum += digit1 * (int) Math.pow(10, power) + digit2 * (int) Math.pow(10, power - 1);//4675  6457
            power += 2;
        }
        swapNum += num * Math.pow(10, power - 1);//14675  16457
        return swapNum;
    }

    public static void main(String[] args) {
        int a = checkInputInt("Enter Number: ");
        System.out.println("Ouput: " + swapDigitPairs(a));
    }

}

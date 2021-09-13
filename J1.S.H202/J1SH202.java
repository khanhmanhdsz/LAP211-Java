/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h202;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH202 {

    final public static Scanner sc = new Scanner(System.in);

    //check user input string
    public static String checkInputString(String mess) {
        System.out.print(mess);
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                return "";
            } else {
                return result;
            }
        }
    }

    public static String printfReverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {

        String input = checkInputString("Enter Input: ");
        if (input == "") {
            return;
        } else {
            System.out.print("Output: " + printfReverse(input));
            System.out.println("");

        }
    }

}

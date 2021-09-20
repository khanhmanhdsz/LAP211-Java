/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h207;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH207 {

    final public static Scanner sc = new Scanner(System.in);

    public static String checkInputString(String mess) {
        System.out.print(mess);
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print(mess);;
            } else {
                return result;
            }
        }
    }

    public static int secondHalfLetters(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'n' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'N' && s.charAt(i) <= 'Z')) {
                count++;
//                System.out.print(s.charAt(i) + " ");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = checkInputString("Enter String: ");
        System.out.println("\nThe number of letters after the letter n is: " + secondHalfLetters(s));
    }

}

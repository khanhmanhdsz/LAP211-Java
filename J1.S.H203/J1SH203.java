/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h203;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH203 {

    final public static Scanner sc = new Scanner(System.in);
    //check user input string
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
    
    public static String reverse(String input){
        String result="";
        String[] word = input.split("\\s+");//hello      manh
        String mess = word[word.length-1];
        mess = mess.substring(0,1).toUpperCase()+mess.substring(1);
        word[word.length-1] = mess;
        for (int i = word.length-1; i >=0; i--) {
            result+=word[i]+" ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        String input = checkInputString("Enter input: ");  
        System.out.println("Output: "+reverse(input));
        
    }
    
}

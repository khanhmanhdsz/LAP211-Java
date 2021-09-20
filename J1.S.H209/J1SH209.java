/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h209;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SH209 {

    public static final Scanner sc = new Scanner(System.in);

    public static File checkFile(String msg) {
        String name = "";
        File file;
        while (true) {
            System.out.print(msg);
            name = sc.nextLine().trim();
            file = new File(name);
            if (file.exists()) {
                break;
            } else {
                System.err.println("File " + name + " does not exist. Please Re-Enter");
            }
        }

        return file;
    }

    public static void countCoins(Scanner input) {
        double totalCents = 0; 
        double amount = 0; 
        while (input.hasNext()) {           
            String centValue = input.next();
            try {           
                amount = Double.parseDouble(centValue);
            } catch (Exception e) {
                System.err.println("Invalid coins value!");
                return;
            }
            
            String centType = input.next();
            if (centType.equalsIgnoreCase("pennies")) {
                totalCents += amount * 1;
            } else if (centType.equalsIgnoreCase("nickels")) {
                totalCents += amount * 5;
            } else if (centType.equalsIgnoreCase("dimes")) {
                totalCents += amount * 10;
            } else if (centType.equalsIgnoreCase("quarters")) {
                totalCents += amount * 25;
            } else {
                System.out.println("Invalid Data!!");
                return;
            }
        }
        System.out.println("Total money: $" + String.format("%.2f", totalCents / 100));
    }

    public static void main(String[] args) throws FileNotFoundException {
        File file = checkFile("Enter file name: ");
        countCoins(new Scanner(file));
    }
}

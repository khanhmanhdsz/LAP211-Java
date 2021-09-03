/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {

    static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int choice;

        System.out.println("========= Doctor Management =========");
        System.out.println("1. Add Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Search Doctor");
        System.out.println("5. Display All Doctor");
        System.out.println("6. Exit");
        choice = checkInputLimit(1, 6);
        return choice;
    }

    public static int checkInputLimit(int min, int max) {
        System.out.print("Please choice one option: ");
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new NumberFormatException();
                }
                return choice;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Please Enter again: ");
            }
        }
    }

    public static float checkInputFloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number Float");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInputInt() {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number Interger");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkCodeDoctor(ArrayList<Doctor> lc, String code) {
        for (int i = 0; i < lc.size(); i++) {
            if (lc.get(i).getCode().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDuplicate(ArrayList<Doctor> lc, String code,
            String name, String specialization, int availability) {
        //check from first to last list doctor
        for (Doctor doctor : lc) {
            if (code.equalsIgnoreCase(doctor.getCode())
                    && name.equalsIgnoreCase(doctor.getName())
                    && specialization.equalsIgnoreCase(doctor.getSpecialization())
                    && availability == doctor.getAvailability()) {
                return false;
            }
        }
        return true;
    }

    public static void addDoctor(ArrayList<Doctor> lc) {
        int count = 0;
        String code;
        do {
            if (count >= 1) {
                System.err.println("Doctor exist.");
            }
            System.out.print("Enter code:");
            code = checkInputString();
            count++;
        } while (!checkCodeDoctor(lc, code));
        System.out.print("Enter Name: ");
        String name = checkInputString();
        System.out.print("Enter Specialization: ");
        String Specialization = checkInputString();
        System.out.print("Enter Availability: ");
        int Availability = checkInputInt();
        lc.add(new Doctor(code, name, Specialization, Availability));
        System.err.println("Add Succesful!!!");
        System.out.println("");
    }

    public static void updateDoctor(ArrayList<Doctor> lc) {
        System.out.print("Enter Code: ");
        String code = checkInputString();
        if (checkCodeDoctor(lc, code)) {
            System.err.println("Doctor not exist!!!");
            return;
        }
        System.out.print("Enter Code update: ");
        String codeUpdate = checkInputString();
        System.out.print("Enter Name update: ");
        String nameUpdate = checkInputString();
        System.out.print("Enter Specialization update: ");
        String SpecializationUpdate = checkInputString();
        System.out.print("Enter Availability update: ");
        int AvailabilityUpdate = checkInputInt();
        if (!checkDuplicate(lc, codeUpdate, nameUpdate, SpecializationUpdate, AvailabilityUpdate)) {
            System.err.println("Duplicate Doctor!!!");
            return;
        }
        for (int i = 0; i < lc.size(); i++) {
            if (lc.get(i).getCode().equalsIgnoreCase(code)) {
                lc.get(i).setCode(codeUpdate);
                lc.get(i).setName(nameUpdate);
                lc.get(i).setSpecialization(SpecializationUpdate);
                lc.get(i).setAvailability(AvailabilityUpdate);
            }
        }
        System.err.println("Update Succesful!!!");
        System.out.println("");
    }

    public static void deleteDoctor(ArrayList<Doctor> lc) {
        System.out.print("Enter Code: ");
        String code = checkInputString();
        if (checkCodeDoctor(lc, code)) {
            System.err.println("Doctor not exist!!!");
            System.out.println("");
            return;
        }
        for (int i = 0; i < lc.size(); i++) {
            if (lc.get(i).getCode().equalsIgnoreCase(code)) {
                lc.remove(i);
            }
        }
        System.err.println("Delete Succesful!!!");
        System.out.println("");
    }

    public static void searchDoctor(ArrayList<Doctor> lc) {
        int count=0;
        System.out.print("Enter code: ");
        String codeSearch = checkInputString();
        if (lc.isEmpty()) {
            System.err.println("List empty.");
        } else {          
            for (int i = 0; i < lc.size(); i++) {               
                if (lc.get(i).getCode().equalsIgnoreCase(codeSearch)) {
                    System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
                    lc.get(i).display();
                    count++;
                }
            }
            if (count==0) {
                System.err.println("Doctor not exist!!!");
                System.out.println("");
            }
        }
    }
    
    public static void printfDoctor(ArrayList<Doctor> lc) {
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
        for (int i = 0; i < lc.size(); i++) {
            lc.get(i).display();
        }
    } 
}

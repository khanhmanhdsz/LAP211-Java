/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class J1SP0055 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Doctor> lc = new ArrayList<>();
        while (true) {            
            int choice = Manager.menu();
            switch(choice){
                case 1:
                    Manager.addDoctor(lc);
                    break;
                case 2:
                    Manager.updateDoctor(lc);
                    break;
                case 3:
                    Manager.deleteDoctor(lc);
                    break;
                case 4:
                    Manager.searchDoctor(lc);
                    break;
                case 5:
                    Manager.printfDoctor(lc);
                    break;
                case 6:
                    return ;
            }
                    
        }
    }
}

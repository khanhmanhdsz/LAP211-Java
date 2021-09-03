/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0055;

/**
 *
 * @author Admin
 */
public class Doctor {
    private String code;
    private String name;
    private String Specialization;
    private int Availability;

    public Doctor() {
    }

    public Doctor(String code, String name, String Specialization, int Availability) {
        this.code = code;
        this.name = name;
        this.Specialization = Specialization;
        this.Availability = Availability;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int Availability) {
        this.Availability = Availability;
    }
    public void display(){
        System.out.printf("%-10s%-15s%-25s%-20d\n",code,name,Specialization,Availability);
    }
}

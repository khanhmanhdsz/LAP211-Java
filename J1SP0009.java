/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0009;

/**
 *
 * @author Admin
 */
public class J1SP0009 {

    
    public static void main(String[] args) {
        J1SP0009 a = new J1SP0009();
        System.out.print("The 45 sequence fibonacci:");
        System.out.println(a.fabonacci(45, 1, 0));
        
    }
    public int fabonacci(int term, int lower, int higher){
        if (term<2) {
            return higher;
        }
        System.out.print(higher+" ");
        return fabonacci(term-1, higher, higher+lower);
    }
}

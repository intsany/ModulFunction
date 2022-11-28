
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Intsany
 */
public class ModulFunction2 {
    
    public static void hitung(int a,int b,int c) {
        
        Math.max(a, c);
        int maks;
        System.out.print("Nilai tertinggi: ");
        maks = Math.max(a ,b);
        if(b>maks){
            maks=b;
        }
        System.out.println(maks);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("Masukkan nilai a: ");
        a=input.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        b=input.nextInt();
        
        System.out.print("Masukkan nilai c: ");
        c=input.nextInt();
        
        hitung(a,b,c);
    }
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan3.input;

import java.util.Scanner;
/**
 * @author 
 * NAMA : Tegar Lucky'Q Oakley 
 * NIM : 10118066 
 * KELAS : IF2 
 * Deskripsi Program : Program ini berisi program untuk memasukkan nilai dari keyboard
 *
 */
public class PBO210118066Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah " + nama);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan23.nilaiterbesar.terkecil;

import java.util.Scanner;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Nilai Terbesar & Terkecil
 */
public class IF110118021Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int terbesar = 0;
        int terkecil = 100;

        System.out.println("Program Nilai Terbesar dan Terkecil Mahasiswa");
        System.out.println("Masukkan Nama Petugas : ");
        Scanner input = new Scanner(System.in);
        String namaPetugas = input.next();
        System.out.println("Masukkan banyaknya nilai Mahasiswa : ");
        int jumlahMhs = input.nextInt();
        int [] nilaiMhs = new int[jumlahMhs];
        for (int i = 0; i < jumlahMhs; i++){
        System.out.print("Masukkan nilai Mahasiswa ke-" + (i+1) + " : ");
        nilaiMhs[i] = input.nextInt();
        if(nilaiMhs[i] > terbesar)
            terbesar = nilaiMhs[i];
        if(nilaiMhs[i] < terkecil)
            terkecil = nilaiMhs[i];
        }
        System.out.println("Nilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        System.out.println("Nama Petugas : " + namaPetugas);
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
}

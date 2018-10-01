/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan23.nilaibesarkecil;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk melihat nilai paling besar dan kecil 
 */
public class PBO310117113Latihan23NilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int banyak;
        int Max = Integer.MAX_VALUE;
        int Min = Integer.MAX_VALUE;
        String petugas;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Program Nilai Terbesar dan Terkecil=======");
        System.out.print("Nama Petugas                : ");
        petugas = scanner.next();
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyak = scanner.nextInt();
       
        int[] nilai = new int[banyak];
        for (int i=0 ; i<banyak ; i++){
            System.out.print("Masukan Nilai Mahasiswa Ke-"+(i+1)+" : ");
            nilai[i] = scanner.nextInt();
            if(nilai[i]>Max){
                Max=nilai[i];
            }
            if(nilai[i]<Min){
                Min = nilai[i];
            }
        }
        System.out.println("");
        System.out.println("==== Hasil Nilai Mahasiswa ====");
        for (int i=0 ; i<banyak ; i++){
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" : "+nilai[i]);
            
            
        }
        System.out.println("");
        System.out.println("Nilai Terbesar Adalah = "+ Max);
        System.out.println("Nilai Terkecil Adalah = "+ Min);
        
        System.out.println("");
        System.out.println("Petugas = " +petugas);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rataratanilai;
import java.util.Scanner;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program menghitung rata-rata nilai, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai, i, banyakMahasiswa;
        double rata = 0;
        double jumlah = 0;
        
        
        System.out.print("Masukan Banyaknya Mahasiswa : " );
        Scanner scanner = new Scanner(System.in);
        banyakMahasiswa = scanner.nextInt();
        
        for(i=1; i<=banyakMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-"+i+" : ");
            nilai = scanner.nextInt();
            jumlah += nilai;
            rata = jumlah/banyakMahasiswa;
        }
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah "+rata);
        System.out.println("Developed by : Adrian Maidiyangsa");
        
        
        
    }
    
}

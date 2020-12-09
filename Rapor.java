/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapor;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class Rapor {

    /**
     * @param args the command line arguments
     */
  static void namaSiswa(){
      System.out.println("Nama: " + "Annisa Nur Isnaeni Ramadhanti");
  }
    public static void main(String[] args) {
        double nilai_tugas, nilai_kuis, nilai_uts, nilai_uas, nilai_akhir;
        char grade;
        System.out.println("    Rapot Siswa \n ================"  );
        namaSiswa();
    
        System.out.println("---Kriteria Rapor---");
       String [] kriteria= {" ", "Tugas", "Kuis", "UTS", "UAS"};
        for (int i = 1; i < kriteria.length; i++) {
            System.out.println(i + ":" + kriteria[i]); 
        }Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Nilai Tugas :");
        nilai_tugas = input.nextInt();
        System.out.println("Masukkan Nilai Kuis :");
        nilai_kuis = input.nextInt();
        System.out.println("Masukkan Nilai UTS :");
        nilai_uts = input.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        nilai_uas = input.nextInt();
        
        System.out.println("---Hasil Rapor---");
  
       nilai_akhir = (0.15 * nilai_tugas + 0.20 * nilai_kuis + 0.30 * nilai_uts + 0.35 * nilai_uas);
      if (nilai_akhir >= 85 && nilai_akhir <=100){
            grade = 'A';
        }
        else if (nilai_akhir > 75 && nilai_akhir < 85){
            grade = 'B';
        }
        else if (nilai_akhir > 65 && nilai_akhir < 75){
            grade = 'C';
        }
        else if (nilai_akhir > 50 && nilai_akhir < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+" Memiliki Nilai Akhir "+nilai_akhir+" ("+grade+")"+""
                    + "\n dan Dinyatakan LULUS");
        }
        else {
            System.out.println("\n"+" Memiliki Nilai Akhir "+nilai_akhir+" ("+grade+")"+""
                    + "\n dan Dinyatakan TIDAK LULUS");
    }
    
    }
} 
       

    


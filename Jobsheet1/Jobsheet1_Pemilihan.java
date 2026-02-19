

import java.util.Scanner;

public class Jobsheet1_Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilaiTugas = 0, nilaiKuis = 0, nilaiUTS = 0, nilaiUAS = 0;
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===============================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextDouble();
        

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = input.nextDouble();

        System.out.print("Masukkan Nilai UTS: ");
        nilaiUTS = input.nextDouble();
        

        System.out.print("Masukkan Nilai UAS: ");
        nilaiUAS = input.nextDouble();
        
        if ((nilaiTugas >= 0 && nilaiTugas <= 100) && (nilaiKuis >= 0 && nilaiKuis <= 100) && (nilaiUTS >= 0 && nilaiUTS <= 100) && (nilaiUAS >= 0 && nilaiUAS <= 100)) {
            nilaiTugas *= .2;
            nilaiKuis *= .2;
            nilaiUTS *= .3;
            nilaiUAS *= .3;
            double nilaiAkhir = nilaiTugas + nilaiKuis + nilaiUTS + nilaiUAS;
        String nilaiHuruf;
        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
        System.out.println("===============================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("===============================");

        if (nilaiHuruf.equalsIgnoreCase("D") || nilaiHuruf.equalsIgnoreCase("E")) {
            System.out.println("Anda tidak lulus!");
        }else{
            System.out.println("Anda lulus!");
        }

        }else{
            System.out.println("===============================");
            System.out.println("Nilai Tidak Valid!");
            System.out.println("===============================");
        }
        
    }
}
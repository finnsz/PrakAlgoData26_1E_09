

import java.util.Scanner;

public class Jobsheet1_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String mk[] = {"Pancasila","Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamtan dan Kesehatan Kerja"};

        double nilai[] = new double[8];
        System.out.println("==============================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("==============================");
        System.out.print("Masukkan nilai Pancasila: ");
        nilai[0] = input.nextDouble();
        System.out.print("Masukkan nilai Konsep Teknologi Informasi: ");
        nilai[1] = input.nextDouble();
        System.out.print("Masukkan nilai Critical Thinking dan Problen Solving: ");
        nilai[2] = input.nextDouble();
        System.out.print("Masukkan nilai Matematika Dasar: ");
        nilai[3] = input.nextDouble();
        System.out.print("Masukkan nilai Bahasa Inggris: ");
        nilai[4] = input.nextDouble();
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        nilai[5] = input.nextDouble();
        System.out.print("Masukkan nilai Praktikum Dasar Pemrograman: ");
        nilai[6] = input.nextDouble();
        System.out.print("Masukkan nilai Keselamatan dan Kesehatan Kerja: ");
        nilai[7] = input.nextDouble();
        
        String nilaiHuruf[] = new String[8];
        double bobotNilai[] = new double[8];
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4;
            }else if (nilai[i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            }else if (nilai[i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3;
            }else if (nilai[i] > 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.5;
            }else if (nilai[i] > 50) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2;
            }else if (nilai[i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1;
            }else{
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0;
            }
        }
        double sks[] = {2,2,2,3,2,2,3,2};
        int tot = 0;
        int jmlsks = 0;
        for (int i = 0; i < sks.length; i++) {
            tot += bobotNilai[i] * sks[i]; 
            jmlsks += sks[i];
        }
        int ip = tot / jmlsks;
        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-10s\n", "Mata Kuliah","Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("%-40s %-15s %-15s %-10s\n", mk[i],nilai[i], nilaiHuruf[i], bobotNilai[i]);
            
        }
        System.out.println("==============================");
        System.out.println(ip);
        System.out.println("==============================");
    }
}

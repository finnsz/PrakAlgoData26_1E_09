package PrakAlgoData26_1E_09.Jobsheet3;

import java.util.Scanner;

public class matakuliahdemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        matakuliah09[] arrayMatakuliah09 = new matakuliah09[jmlMatkul];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayMatakuliah09.length; i++) {
            System.out.println("Masukkan data matakuliah ke- " + (i+1));
            System.out.print("Kode\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t: ");
            nama = sc.nextLine();
            System.out.print("SKS\t\t: ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam\t: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------");
            
            arrayMatakuliah09[i] = new matakuliah09();
            arrayMatakuliah09[i].tambahData(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < arrayMatakuliah09.length; i++) {
            System.out.println("Data matakuliah ke- " + (i+1));
            arrayMatakuliah09[i].cetakInfo();
        }
    }
}

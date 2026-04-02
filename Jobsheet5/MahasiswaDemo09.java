package Jobsheet5;

import java.util.Scanner;

public class MahasiswaDemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09(jml);

        for (int i = 0; i < jml; i++) {
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            list.tambah(new Mahasiswa09(nim, nama, kelas, ipk));
        }

        System.out.println("\n--- Hasil Sorting (DESC) ---");
        list.insertionSort();
        list.tampil();
    }
}

package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs=5;
        MahasiswaBerprestasi09 list = new MahasiswaBerprestasi09(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
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
        list.tampil();
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.print("Masukkan ipk mahasiswa yang dicari");
        System.out.print("ipk: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}

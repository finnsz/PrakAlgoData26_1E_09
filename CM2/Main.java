package CM2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan laporan = new DLLPesanan();

        int noAntrian = 1;

        int menu;
        do {
            System.out.println("\n=================================");
            System.out.println("   SISTEM ANTRIAN ROYAL DELISH   ");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();

                    antrian.enqueue(new Pembeli(nama, hp, noAntrian));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
                    noAntrian++;
                    break;

                case 2:
                    antrian.print();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Tidak ada antrean saat ini.");
                    } else {
                        Pembeli p = antrian.dequeue();
                        System.out.println("\n" + p.namaPembeli + " (No Antrian: " + p.noAntrian + ") menuju kasir.");
                        System.out.println("--- Input Data Pesanan ---");

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String pesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        laporan.addPesanan(new Pesanan(kode, pesanan, harga));
                        System.out.println(p.namaPembeli + " telah memesan " + pesanan);
                    }
                    break;

                case 4:
                    laporan.sortByName();
                    laporan.printLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan sistem Royal Delish!");
                    break;

                default:
                    System.out.println("Pilihan menu tidak valid!");
            }
        } while (menu != 0);

        sc.close();
    }
}

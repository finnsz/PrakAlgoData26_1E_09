package Jobsheet11;

import java.util.Scanner;

public class MainAntrian09 {
    public static void main(String[] args) {
        QueueAntrian09 queue = new QueueAntrian09();
        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Daftar Antrian Mahasiswa Baru");
            System.out.println("2. Panggil Antrian (Layani)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrean Saat Ini");
            System.out.println("5. Cek Status Antrean (Kosong/Penuh)");
            System.out.println("6. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Keperluan: ");
                    String keperluan = sc.nextLine();
                    queue.enqueue(nim, nama, keperluan); 
                    break;
                case 2:
                    queue.dequeue(); 
                    break;
                case 3:
                    queue.printFrontBack();
                    break;
                case 4:
                    queue.printQueueSize();
                    break;
                case 5:
                    if (queue.isEmpty()) {  
                        System.out.println("Status: Antrian KOSONG.");
                    } else if (queue.isFull()) {
                        System.out.println("Status: Antrian PENUH.");
                    } else {
                        System.out.println("Status: Terdapat " + queue.size + " antrian berjalan.");
                    }
                    break;
                case 6:
                    queue.clear(); 
                    break;
                case 0:
                    System.out.println("Sistem ditutup. Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid, silakan coba lagi.");
            }
        } while (menu != 0);
        
        sc.close();
    }
}
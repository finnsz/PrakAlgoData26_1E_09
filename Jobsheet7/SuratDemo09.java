package Jobsheet7;

import java.util.Scanner;

public class SuratDemo09 {
    public static void main(String[] args) {
        StackSurat09 stack = new StackSurat09(10);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu Pengelolaan Surat Izin:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S: Sakit / I: Izin Lain): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat09 srt = new Surat09(idSurat, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    System.out.printf("Surat izin dari %s berhasil diterima dan diletakkan di tumpukan teratas.\n", srt.namaMahasiswa);
                    break;

                case 2:
                    Surat09 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("--- Memproses Surat ---");
                        System.out.println("ID Surat  : " + diproses.idSurat);
                        System.out.println("Nama      : " + diproses.namaMahasiswa);
                        System.out.println("Jenis Izin: " + (diproses.jenisIzin == 'S' || diproses.jenisIzin == 's' ? "Sakit" : "Izin Lain"));
                        System.out.println("Status    : Surat telah divalidasi oleh Admin Prodi.");
                    }
                    break;

                case 3:
                    Surat09 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("--- Surat Teratas ---");
                        System.out.println("Surat terakhir yang masuk adalah dari " + lihat.namaMahasiswa + " (ID: " + lihat.idSurat + ")");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan Nama Mahasiswa yang ingin dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;
                    
                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-4 atau 0.");
            }
        } while (pilih != 0);
        
        scan.close();
    }
}
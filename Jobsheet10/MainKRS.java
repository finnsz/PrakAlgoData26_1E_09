package Jobsheet10;
import java.util.Scanner;
public class MainKRS {

    public static void menu() {
        System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Proses KRS (2 Mahasiswa Sekaligus)");
        System.out.println("3. Lihat Semua Antrian");
        System.out.println("4. Lihat 2 Antrian Terdepan");
        System.out.println("5. Lihat Antrian Paling Akhir");
        System.out.println("6. Info Statistik KRS (Jumlah & Sisa)");
        System.out.println("7. Kosongkan Antrian");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueKRS antrian = new QueueKRS(10);
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.layaniKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.lihatDuaTerdepan();
                    break;
                case 5:
                    antrian.lihatAkhir();
                    break;
                case 6:
                    System.out.println("\n--- Statistik Proses KRS DPA ---");
                    System.out.println("Jumlah dalam antrian saat ini    : " + antrian.getJumlahAntrian());
                    System.out.println("Jumlah mahasiswa sudah proses KRS: " + antrian.getJumlahSudahKRS());
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + antrian.getJumlahBelumKRS() + " (dari target 30 mhs)");
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Program dihentikan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}

package CM1;

import java.util.Scanner;
public class cm1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] listMhs = {
            new Mahasiswa(22001, "Andi", "Teknik Informatika"),
            new Mahasiswa(22002, "Budi", "Teknik Informatika"),
            new Mahasiswa(22003, "Citra", "Sistem Informasi Bisnis")
        };
        Buku[] listBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };
        Pinjam[] listPinjam = {
            new Pinjam(listMhs[0], listBuku[0], 7),
            new Pinjam(listMhs[1], listBuku[1], 3),
            new Pinjam(listMhs[2], listBuku[2], 10),
            new Pinjam(listMhs[2], listBuku[3], 6),
            new Pinjam(listMhs[0], listBuku[1], 4)
        };
        System.out.println();

        int pilih;
        do {
            System.out.println("SISTEM PEMINJAMAN RUANG BACA JTI");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");

            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            System.out.println();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < listMhs.length; i++) {
                        listMhs[i].tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Daftar Buku:");
                    for (int i = 0; i < listBuku.length; i++) {
                        listBuku[i].tampilBuku();
                    }
                    break;
                case 3:
                    System.out.println("Data Peminjaman:");
                    for (int i = 0; i < listPinjam.length; i++) {
                        listPinjam[i].tampilPinjam();
                    }
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    insertionSortDenda(listPinjam);
                    for (int i = 0; i < listPinjam.length; i++) {
                        listPinjam[i].tampilPinjam();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    int cariNim = sc.nextInt();
                    prosesCariNIM(listPinjam, cariNim);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }

    public static void insertionSortDenda(Pinjam[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Pinjam temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].denda < temp.denda) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static void insertionSortNim(Pinjam[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Pinjam temp = arr[i];
            int j = i;
            // Gunakan > untuk mengurutkan angka (int) dari kecil ke besar
            while (j > 0 && arr[j - 1].mhs.nim > temp.mhs.nim) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public static int BinarySearch(Pinjam[] arr, int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == arr[mid].mhs.nim) {
                return mid;
            } else if (arr[mid].mhs.nim > cari) {
                return BinarySearch(arr, cari, left, mid - 1);
            } else {
                return BinarySearch(arr, cari, mid + 1, right);
            }
        }
        return -1;
    }

    public static void prosesCariNIM(Pinjam[] listPinjam, int cariNim) {
        insertionSortNim(listPinjam);
        int hasilIndex = BinarySearch(listPinjam, cariNim, 0, listPinjam.length - 1);
        if (hasilIndex == -1) {
            System.out.println("Data peminjaman dengan NIM " + cariNim + " tidak ditemukan.");
        } else {
            int awal = hasilIndex;
            while (awal > 0 && listPinjam[awal - 1].mhs.nim == cariNim) {
                awal--;
            }
            int akhir = hasilIndex;
            while (akhir < listPinjam.length - 1 && listPinjam[akhir + 1].mhs.nim == cariNim) {
                akhir++;
            }
            for (int i = awal; i <= akhir; i++) {
                listPinjam[i].tampilPinjam();
            }
        }
    }
}
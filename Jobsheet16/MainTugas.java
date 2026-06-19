package Jobsheet16;

import java.util.*;

class MahasiswaTugas {
    String nim;
    String nama;
    String noTelp;

    public MahasiswaTugas(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
}

class MataKuliah {
    String kode;
    String namaMk;
    int sks;

    public MataKuliah(String kode, String namaMk, int sks) {
        this.kode = kode;
        this.namaMk = namaMk;
        this.sks = sks;
    }
}

class Nilai {
    MahasiswaTugas mhs;
    MataKuliah mk;
    double nilai;

    public Nilai(MahasiswaTugas mhs, MataKuliah mk, double nilai) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilai = nilai;
    }
}

public class MainTugas {
    static Queue<MahasiswaTugas> listMahasiswa = new LinkedList<>(); 
    static List<MataKuliah> listMk = new ArrayList<>();
    static List<Nilai> listNilai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initData();

        int menu;
        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa Terdepan (Queue)");
            System.out.println("6. Keluar");
            System.out.println("*************************************************");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1: inputNilai(); break;
                case 2: tampilNilai(); break;
                case 3: cariNilai(); break;
                case 4: urutNilai(); break;
                case 5: hapusMahasiswaQueue(); break;
                case 6: System.out.println("Keluar..."); break;
                default: System.out.println("Pilihan tidak valid!");
            }
        } while (menu != 6);
    }

    static void initData() {
        listMahasiswa.add(new MahasiswaTugas("20001", "Thalhah", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20002", "Zubair", "021xxx"));
        listMahasiswa.add(new MahasiswaTugas("20003", "Abdur-Rahman", "021xxx"));

        listMk.add(new MataKuliah("00001", "Internet of Things", 3));
        listMk.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        listMk.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
    }

    static void inputNilai() {
        System.out.println("\n--- DAFTAR MAHASISWA ---");
        System.out.printf("%-10s %-20s %-10s\n", "NIM", "Nama", "Telf");
        for (MahasiswaTugas m : listMahasiswa) {
            System.out.printf("%-10s %-20s %-10s\n", m.nim, m.nama, m.noTelp);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String cariNim = sc.nextLine();
        
        MahasiswaTugas mhsDipilih = null;
        for (MahasiswaTugas m : listMahasiswa) {
            if (m.nim.equals(cariNim)) {
                mhsDipilih = m; break;
            }
        }

        System.out.println("\n--- DAFTAR MATA KULIAH ---");
        System.out.printf("%-10s %-40s %-10s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah mk : listMk) {
            System.out.printf("%-10s %-40s %-10d\n", mk.kode, mk.namaMk, mk.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String cariKode = sc.nextLine();
        
        MataKuliah mkDipilih = null;
        for (MataKuliah mk : listMk) {
            if (mk.kode.equals(cariKode)) {
                mkDipilih = mk; break;
            }
        }

        if (mhsDipilih != null && mkDipilih != null) {
            System.out.print("Masukan data Nilai : ");
            double nilai = sc.nextDouble();
            listNilai.add(new Nilai(mhsDipilih, mkDipilih, nilai));
            System.out.println("Berhasil menambahkan data.");
        } else {
            System.out.println("NIM atau Kode MK tidak ditemukan!");
        }
    }

    static void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai n : listNilai) {
            System.out.printf("%-10s %-15s %-40s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
        }
    }

    static void cariNilai() {
        System.out.println("\nPencarian Data Mahasiswa");
        System.out.print("Masukkan data mahasiswa [nim] : ");
        String cariNim = sc.nextLine();
        
        System.out.printf("%-10s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int totalSks = 0;
        for (Nilai n : listNilai) {
            if (n.mhs.nim.equals(cariNim)) {
                System.out.printf("%-10s %-15s %-40s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.namaMk, n.mk.sks, n.nilai);
                totalSks += n.mk.sks;
            }
        }
        System.out.println("Total SKS " + totalSks + " telah diambil.");
    }

    static void urutNilai() {
        Collections.sort(listNilai, (n1, n2) -> Double.compare(n2.nilai, n1.nilai));
        System.out.println("\nData Nilai Berhasil Diurutkan (Descending).");
        tampilNilai();
    }

    static void hapusMahasiswaQueue() {
        if (!listMahasiswa.isEmpty()) {
            MahasiswaTugas dihapus = listMahasiswa.poll();
            System.out.println("Berhasil menghapus mahasiswa antrian terdepan (Queue): " + dihapus.nama + " (" + dihapus.nim + ")");
        } else {
            System.out.println("Antrian mahasiswa sudah kosong!");
        }
    }
}

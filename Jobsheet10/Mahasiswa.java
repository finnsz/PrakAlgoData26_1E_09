package Jobsheet10;
public class Mahasiswa {
    String nim, nama, prodi, kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("%-10s %-15s %-10s %-10s\n", nim, nama, prodi, kelas);
    }
}

package Jobsheet11;

public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa09() {
    }

    public Mahasiswa09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama);
        System.out.println(nim);
        System.out.println(kelas);
        System.out.println(ipk);
    }
}
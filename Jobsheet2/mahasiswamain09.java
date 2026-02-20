package PrakAlgoData26_1E_09.Jobsheet2;

public class mahasiswamain09 {
    public static void main(String[] args) {
        mahasiswa09 mhsl = new mahasiswa09();
        mhsl.nama = "Geraldi Rama Nugraha";
        mhsl.nim = "254107020100";
        mhsl.kelas = "TI 1Z";
        mhsl.ipk = 4;

        mhsl.tampilkanInformasi();
        mhsl.ubahKelas("TI 1E");
        mhsl.updateIPK(3.85);
        mhsl.tampilkanInformasi();
    }
}
package PrakAlgoData26_1E_09.Jobsheet2;

public class mahasiswamain09 {
    public static void main(String[] args) {
        mahasiswa09 mhs1 = new mahasiswa09();
        mhs1.nama = "Geraldi Rama Nugraha";
        mhs1.nim = "254107020100";
        mhs1.kelas = "TI 1Z";
        mhs1.ipk = 4;
        mhs1.tampilkanInformasi();
        
        mhs1.ubahKelas("TI 1E");
        mhs1.updateIPK(3.85);
        mhs1.tampilkanInformasi();

        mahasiswa09 mhs2 = new mahasiswa09("Geraldi Rama Nugraha",  "254107020100", 3.67, "TI 1E"); 
        mhs2.updateIPK(3.30);
        mahasiswa09 mhsGeraldi = new mahasiswa09("Geraldi Rama Nugraha", "254107020100", 3.90, "TI 1E");
    }

    
}
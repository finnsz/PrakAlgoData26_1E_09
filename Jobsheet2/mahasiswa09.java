package PrakAlgoData26_1E_09.Jobsheet2;

import javax.crypto.spec.IvParameterSpec;

public class mahasiswa09 {   
    String nama, nim, kelas;
    double ipk;

    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(){
        kelas = kelasBaru;

    }

    void updateIPK(){
        ipk = ipkBaru;
    }

    String nilaiKerja(){
        if (ipk  >= 3.5) {
            return "Kinerja sangat baik";
        }else if (ipk >= 3) {
            return "Kinerja baik";
        }else if (ipk >= 2) {
            return "Kinerja cukup";
        }else{
            return "Kinerja kurang";
        }
    }
}

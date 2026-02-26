package PrakAlgoData26_1E_09.Jobsheet3;

public class mahasiswaDemo09 {
    public static void main(String[] args) {
        mahasiswa09[] arrayOfMahasiswa09 = new mahasiswa09[3];
        arrayOfMahasiswa09[0] = new mahasiswa09();
        arrayOfMahasiswa09[0].nim = "254107020100";
        arrayOfMahasiswa09[0].nama = "Geraldi Rama Nugraha";
        arrayOfMahasiswa09[0].kelas = "TI 1E";
        arrayOfMahasiswa09[0].ipk = 3.85f;
        
        arrayOfMahasiswa09[1] = new mahasiswa09();
        arrayOfMahasiswa09[1].nim = "254108030200";
        arrayOfMahasiswa09[1].nama = "Nini Trisnawati";
        arrayOfMahasiswa09[1].kelas = "TI 1G";
        arrayOfMahasiswa09[1].ipk = 3.7f;

        arrayOfMahasiswa09[2] = new mahasiswa09();
        arrayOfMahasiswa09[2].nim = "254107020153";
        arrayOfMahasiswa09[2].nama = "Alexander Andriyana";
        arrayOfMahasiswa09[2].kelas = "TI 1A";
        arrayOfMahasiswa09[2].ipk = 3.51f;

        System.out.println("NIM\t: " + arrayOfMahasiswa09[0].nim);
        System.out.println("Nama\t: " + arrayOfMahasiswa09[0].nama);
        System.out.println("Kelas\t: " + arrayOfMahasiswa09[0].kelas);
        System.out.println("IPK\t: " + arrayOfMahasiswa09[0].ipk);
        System.out.println("-----------------------------");
        System.out.println("NIM\t: " + arrayOfMahasiswa09[1].nim);
        System.out.println("Nama\t: " + arrayOfMahasiswa09[1].nama);
        System.out.println("Kelas\t: " + arrayOfMahasiswa09[1].kelas);
        System.out.println("IPK\t: " + arrayOfMahasiswa09[1].ipk);
        System.out.println("-----------------------------");
        System.out.println("NIM\t: " + arrayOfMahasiswa09[2].nim);
        System.out.println("Nama\t: " + arrayOfMahasiswa09[2].nama);
        System.out.println("Kelas\t: " + arrayOfMahasiswa09[2].kelas);
        System.out.println("IPK\t: " + arrayOfMahasiswa09[2].ipk);
        System.out.println("-----------------------------");
    }
}

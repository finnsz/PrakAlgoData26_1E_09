package PrakAlgoData26_1E_09.Jobsheet3;
import java.util.Scanner;
public class mahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        mahasiswa09[] arrayOfMahasiswa09 = new mahasiswa09[3];
        String dummy;

        for (int i = 0; i < arrayOfMahasiswa09.length; i++) {
            arrayOfMahasiswa09[i] = new mahasiswa09();

            System.out.println("Masukkan Data Mahasiswa ke " + (i+ 1));
            System.out.print("Nim\t: ");
            arrayOfMahasiswa09[i].nim = sc.nextLine();
            System.out.print("Nama\t: ");
            arrayOfMahasiswa09[i].nama = sc.nextLine();
            
            System.out.print("Kelas\t: ");
            arrayOfMahasiswa09[i].kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            dummy = sc.nextLine();
            arrayOfMahasiswa09[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------");
        }
        for (int i = 0; i < arrayOfMahasiswa09.length; i++) {
            System.out.println("Data Mahasiswa ke- " + (i+1));
            arrayOfMahasiswa09[i].cetakInfo();  
        }
    }
}

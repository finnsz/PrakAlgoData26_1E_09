package PrakAlgoData26_1E_09.Jobsheet3;

import java.util.Scanner;

public class dosendemo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();
        dosen09[] arrDosen09 = new dosen09[jmlDosen];
        System.out.println("------------------------");

        for (int i = 0; i < arrDosen09.length; i++) {
            arrDosen09[i] = new dosen09();
            System.out.println("Masukkan data dosen ke- " + (i + 1));
            System.out.print("kode\t\t: ");
            arrDosen09[i].kode = sc.nextLine();
            System.out.print("Nama\t\t: ");
            arrDosen09[i].nama = sc.nextLine();
            System.out.print("Jenis kelamin\t: ");
            arrDosen09[i].jenisKelamin = sc.nextLine();
            System.out.print("Usia\t\t: ");
            arrDosen09[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("------------------------");
            
        }
        System.out.println();
        datadosen09 data = new datadosen09();
        data.dataSemuaDosen(arrDosen09);
        System.out.println();
        data.jumlahDosenPerJenisKelamin(arrDosen09);
        System.out.println();
        data.rerataUsiaDosenPerJenisKelamin(arrDosen09);
        System.out.println();
        data.infoDosenPalingTua(arrDosen09);
        System.out.println();
        data.infoDosenPalingMuda(arrDosen09);
    }
}

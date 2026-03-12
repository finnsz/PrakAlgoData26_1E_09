package PrakAlgoData26_1E_09.Jobsheet4;
import java.util.Scanner;

public class mainsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        sum sm = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke- " + (i+1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan BruteFoce: " + sm.totalBF());
        System.out.println("Total keuntungan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}

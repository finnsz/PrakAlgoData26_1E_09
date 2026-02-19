

import java.util.Scanner;

public class Jobsheet1_TugasNo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char kode[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char kota[][] = {{'B', 'A', 'N', 'T', 'E', 'N'},
                         {'J','A','K','A','R','T','A'},
                         {'B','A','N','D','U','N','G'},
                         {'C','I','R','E','B','O','N'},
                         {'B','O','G','O','R'},
                         {'P','E','K','A','L','O','N','G','A','N'},
                         {'S','E','M','A','R','A','N','G'},
                         {'S','U','B','A','Y','A'},
                         {'M','A','L','A','N','G'},
                         {'T','E','G','A','L'}};

        System.out.print("Masukkan kode plat nomor: ");
        char key = input.next().toUpperCase().charAt(0);

        for (int i = 0; i < kode.length; i++) {
            if (key == kode[i]) {
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
            }
        }
    }
}
import java.util.Scanner;

public class Jobsheet1_TugasNo2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal: ");
        int jmlJadwal = sc.nextInt();

        String[][] jadwal = new String[jmlJadwal][4];

        inputdata(jadwal, jmlJadwal);
        tampilkanSemua(jadwal, jmlJadwal);

        System.out.print("Cari hari apa? ");
        String carihari = sc.next();
        cariHari(jadwal, jmlJadwal, carihari);

        System.out.print("Cari matkul apa? ");
        String carimatkul = sc.next();
        cariMatkul(jadwal, jmlJadwal, carimatkul);
    }

    public static void inputdata(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah: ");
            jadwal[i][0] = sc.next();
            System.out.print("Ruang: ");
            jadwal[i][1] = sc.next();
            System.out.print("Hari: ");
            jadwal[i][2] = sc.next();
            System.out.print("Jam: ");
            jadwal[i][3] = sc.next();
        }
    }

    public static void tampilkanSemua(String[][] jadwal, int n) {
    System.out.printf("%-5s %-20s %-15s %-12s %-10s%n", "No", "Mata Kuliah", "Ruang", "Hari", "Jam");        
    for (int i = 0; i < n; i++) {
            System.out.printf("%-5s %-20s %-15s %-12s %-10s%n", (i+1), jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, String h) {
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(h)) {
                System.out.println("Hasil: " + jadwal[i][0] + " di ruang " + jadwal[i][1]);
            }
        }
    }

    public static void cariMatkul(String[][] jadwal, int n, String m) {
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(m)) {
                System.out.println("Hasil: Hari " + jadwal[i][2] + " jam " + jadwal[i][3]);
            }
        }
    }
}
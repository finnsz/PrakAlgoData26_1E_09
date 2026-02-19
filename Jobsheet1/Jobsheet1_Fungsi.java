public class Jobsheet1_Fungsi {
    static int hargaBunga[] = {75000, 50000, 60000, 10000};
    public static void main(String[] args) {
        pendapatan();
    }

    public static void pendapatan(){
        String cabang[] = {"RoyalGarden1", "RoyalGarden2", "RoyalGarden3", "RoyalGarden4"};
        int jmlTerjual[][] = {
            {10, 5, 15, 7}, {6, 11, 9 ,12}, {2, 10, 10, 5}, {5, 7, 12, 9}
        };
        int total[] = new int[4];
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < jmlTerjual[i].length; j++) {
                total[i] += hargaBunga[j] * jmlTerjual[i][j];
            }
            String keterangan;
            if (total[i] > 1500000) {
                keterangan = "Sangat baik";
            }else{
                keterangan = "Perlu evaluasi";
            }
            System.out.println(cabang[i] + ": Rp " + total[i] + " " +keterangan);
        }
        
    }
}
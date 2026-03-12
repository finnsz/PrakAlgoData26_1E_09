package PrakAlgoData26_1E_09.Jobsheet4;

    public class mainmahasiswa {
    
    public static int maxUTS(mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = l + (r - l) / 2;
        int max1 = maxUTS(arr, l, mid);
        int max2 = maxUTS(arr, mid + 1, r);
        return Math.max(max1, max2);
    }

    public static int minUTS(mahasiswa[] arr, int l, int r) {
        if (l == r) {
            return arr[l].nilaiUTS;
        }
        int mid = l + (r - l) / 2;
        int min1 = minUTS(arr, l, mid);
        int min2 = minUTS(arr, mid + 1, r);
        return Math.min(min1, min2);
    }

    public static double rataRataUAS(mahasiswa[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].nilaiUAS;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        mahasiswa[] data = {
            new mahasiswa("Ahmad", "220101001", 2022, 78, 82),
            new mahasiswa("Budi", "220101002", 2022, 85, 88),
            new mahasiswa("Cindy", "220101003", 2021, 90, 87),
            new mahasiswa("Dian", "220101004", 2021, 76, 79),
            new mahasiswa("Eko", "220101005", 2023, 92, 95),
            new mahasiswa("Fajar", "220101006", 2020, 88, 85),
            new mahasiswa("Gina", "220101007", 2023, 80, 83),
            new mahasiswa("Hadi", "220101008", 2020, 82, 84)
        };

        int n = data.length;

        int tertinggiUTS = maxUTS(data, 0, n - 1);
        int terendahUTS = minUTS(data, 0, n - 1);
        double rataUAS = rataRataUAS(data);

        System.out.println("Nilai UTS tertinggi menggunakan Divide and Conquer: " + tertinggiUTS);
        System.out.println("Nilai UTS terendah menggunakan Divide and Conquer: " + terendahUTS);
        System.out.println("Rata-rata nilai UAS menggunakan Brute Force: " + rataUAS);
    }
}


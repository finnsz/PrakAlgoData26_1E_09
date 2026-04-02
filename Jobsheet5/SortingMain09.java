package Jobsheet5;

public class SortingMain09 {
    public static void main(String[] args) {
        int a[]  = {20, 10, 2, 7, 12};
        Sorting09 dataurut1 = new Sorting09(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBDE SORT (ASC)");
        dataurut1.tampil();
    }
}

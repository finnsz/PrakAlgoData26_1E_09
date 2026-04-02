public class DosenMain09 {
    public static void main(String[] args) {
        DataDosen09 listData = new DataDosen09();

        Dosen09 d1 = new Dosen09("D01", "Pak Budi", true, 45);
        Dosen09 d2 = new Dosen09("D02", "Bu Siti", false, 38);
        Dosen09 d3 = new Dosen09("D03", "Pak Andi", true, 30);
        Dosen09 d4 = new Dosen09("D04", "Bu Rina", false, 50);
        Dosen09 d5 = new Dosen09("D05", "Pak Edo", true, 35);

        listData.tambah(d1);
        listData.tambah(d2);
        listData.tambah(d3);
        listData.tambah(d4);
        listData.tambah(d5);

        System.out.println("DATA DOSEN SEBELUM SORTING");
        listData.tampil();
        System.out.println();

        System.out.println("DATA DOSEN SORTING ASC (Termuda ke Tertua)");
        listData.SortingASC();
        listData.tampil();
        System.out.println();

        System.out.println("DATA DOSEN SORTING DSC (Tertua ke Termuda)");
        listData.sortingDSC();
        listData.tampil();
    }
}
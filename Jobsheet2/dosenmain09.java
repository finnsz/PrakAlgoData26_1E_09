package PrakAlgoData26_1E_09.Jobsheet2;

public class dosenmain09 {
    public static void main(String[] args) {
        dosen09 dsn1 = new dosen09();
        dsn1.nama = "Ibu dosen 1";
        dsn1.idDosen = "254108070102";
        dsn1.bidangKeahlian = "Desain antarmuka";
        dsn1.statusAktif = true;
        dsn1.tahunBeragabung = 2011;
        dsn1.tampilinInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        System.out.println();

        dosen09 dsn2 = new dosen09("Bapak dosen 2", "254107020100", "PASD", true, 2013);
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Aljabar Linier");
        dsn1.tampilinInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        
    }
}

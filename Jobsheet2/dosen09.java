package PrakAlgoData26_1E_09.Jobsheet2;

public class dosen09 {
    String idDosen, nama, bidangKeahlian;
    boolean statusAktif;
    int tahunBeragabung;

    void tampilinInformasi(){
        System.out.println("Nama dosen: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBeragabung);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSekarang){
        int masaKerja;
        masaKerja = thnSekarang - tahunBeragabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }

    public dosen09(){

    }
    public dosen09(String nm, String id, String keahlian, boolean status, int thnMasuk){
        nama = nm;
        idDosen = id;
        bidangKeahlian = keahlian;
        statusAktif = status;
        tahunBeragabung = thnMasuk;
    }
}

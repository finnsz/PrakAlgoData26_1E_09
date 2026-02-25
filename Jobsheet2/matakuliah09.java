package PrakAlgoData26_1E_09.Jobsheet2;

public class matakuliah09 {
    String kodeMK, nama;
    int sks, jumlahJam;

    void tampilinInformasi(){
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("SKS\t\t : " + sks);
        System.out.println("jumlah Jam\t : " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        jumlahJam -= jam;
    }

    public matakuliah09(){

    }

    public matakuliah09(String nm, String kode, int sks, int jmlJam){
        nama = nm;
        kodeMK = kode;
        this.sks = sks;
        jumlahJam = jmlJam;
        
    }
}

package CM1;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    public Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilBuku(){
        System.out.println("Kode\t: " + kodeBuku);
        System.out.println("Judul\t: " + judul);
        System.out.println("Tahun\t: " + tahunTerbit);
    }
}

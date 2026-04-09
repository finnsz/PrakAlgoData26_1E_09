package CM1;

public class Pinjam {

    Mahasiswa mhs;
    Buku bk;
    int lamaPinjam, terlambat, denda, batasPinjam = 5;

    public Pinjam(Mahasiswa mhs, Buku bk, int lamaPinjam) {
        this.mhs = mhs;
        this.bk = bk;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    public void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    public void tampilPinjam() {
        System.out.println(mhs.nama + " \t| " + bk.judul + " \t| Lama: " + lamaPinjam + " | Terlambat: " + terlambat + " | Denda: " + denda);
    }
}

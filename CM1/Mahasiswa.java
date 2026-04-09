package CM1;
public class Mahasiswa {
    String nama, prodi;
    int nim; 

    public Mahasiswa(int nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa(){
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Prodi\t: " + prodi);
    }
}
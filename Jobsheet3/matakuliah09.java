    package PrakAlgoData26_1E_09.Jobsheet3;

    public class matakuliah09 {
        public String kode;
        public String nama;
        public int sks;
        public int jumlahJam;

        public matakuliah09(){
            
        }
        public matakuliah09(String kode, String nama, int sks, int jumlahJam){
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
            
        }
        public void tambahData(String kode, String nama, int sks, int jumlahJam) {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
            this.jumlahJam = jumlahJam;
        }

        public void cetakInfo() {
            System.out.println("Kode\t\t: " + kode);
            System.out.println("Nama\t\t: " + nama);
            System.out.println("SKS\t\t: " + sks);
            System.out.println("Jumlah jam\t: " + jumlahJam);
            System.out.println("-----------------------");
        }
    }

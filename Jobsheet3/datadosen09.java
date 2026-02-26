package PrakAlgoData26_1E_09.Jobsheet3;

public class datadosen09 {
        public void dataSemuaDosen(dosen09[] arrDosen09){
            System.out.println("---Menampilkan Semua Data Dosen---");
            for (dosen09 d : arrDosen09) {
            System.out.println("Kode\t\t: " + d.kode);
            System.out.println("Nama\t\t: " + d.nama);
            System.out.println("Jenis Kelamin\t: " + d.jenisKelamin);
            System.out.println("Usia\t\t: " + d.usia + " tahun");
            System.out.println("------------------------");
        }
        }
        public void jumlahDosenPerJenisKelamin(dosen09[] arrDosen09){
            int jumlahPria = 0, jumlahWanita = 0;
            for (int i = 0; i < arrDosen09.length; i++) {
                if (arrDosen09[i].jenisKelamin.equalsIgnoreCase("Pria")) {
                    jumlahPria++;
                }else if (arrDosen09[i].jenisKelamin.equals("Wanita")) {
                    jumlahWanita++;
                }
            }
            System.out.println("Jumlah Pria: " + jumlahPria);
            System.out.println("Jumah Wanita: " + jumlahWanita);
        }
        public void rerataUsiaDosenPerJenisKelamin(dosen09[] arrDosen09){
            double jmlUsia = 0;
            for (int i = 0; i < arrDosen09.length; i++) {
                jmlUsia += arrDosen09[i].usia;
            }
            System.out.println("Rata-rata usia dosen: " + (jmlUsia /= arrDosen09.length));
        }
        public void infoDosenPalingTua(dosen09[] arrDosen09){
            int tertua = 0;
            for (int i = 0; i < arrDosen09.length; i++) {
                if (arrDosen09[i].usia > arrDosen09[tertua].usia) {
                    tertua = i;
                }
            }
            System.out.println("---Info Dosen Tertua---");
            System.out.println("Kode\t\t: " + arrDosen09[tertua].kode);
            System.out.println("Nama\t\t: " + arrDosen09[tertua].nama);
            System.out.println("Jenis Kelamin\t: " + arrDosen09[tertua].jenisKelamin);
            System.out.println("Usia:\t\t" + arrDosen09[tertua].usia);
        }
        public void infoDosenPalingMuda(dosen09[] arrDosen09){
            int termuda = 0;
            for (int i = 0; i < arrDosen09.length; i++) {
                if (arrDosen09[i].usia < arrDosen09[termuda].usia) {
                    termuda = i;
                }
            }
            System.out.println("---Info Dosen Termuda---");
            System.out.println("Kode\t\t: " + arrDosen09[termuda].kode);
            System.out.println("Nama\t\t: " + arrDosen09[termuda].nama);
            System.out.println("Jenis Kelamin\t: " + arrDosen09[termuda].jenisKelamin);
            System.out.println("Usia:\t\t" + arrDosen09[termuda].usia);
        }
    }

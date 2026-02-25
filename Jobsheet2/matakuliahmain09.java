package PrakAlgoData26_1E_09.Jobsheet2;

public class matakuliahmain09 {
    public static void main(String[] args) {
        matakuliah09 mk1 = new matakuliah09();
        mk1.nama = "Geraldi Rama Nugraha";
        mk1.jumlahJam = 8;
        mk1.sks = 3;
        mk1.kodeMK = "PASD";
        mk1.kurangiJam(3);
        mk1.ubahSKS(4);
        mk1.tampilinInformasi();
        System.out.println();

        matakuliah09 mk2 = new matakuliah09("Geraldi Rama Nugraha", "SISOP", 4, 5);
        mk2.tambahJam(2);
        mk2.ubahSKS(5);
        mk2.tampilinInformasi();
        
    }
}

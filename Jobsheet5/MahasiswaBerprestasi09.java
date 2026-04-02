package Jobsheet5;

public class MahasiswaBerprestasi09 {
    Mahasiswa09 listMhs[] = new Mahasiswa09[5];
    int idx;

    public MahasiswaBerprestasi09(int kapasitas) {
    listMhs = new Mahasiswa09[kapasitas];
    idx = 0;
}
    void tambah (Mahasiswa09 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa09 m : listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------");
        }
    }

    void bubblesort(){
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk){
                    Mahasiswa09 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}

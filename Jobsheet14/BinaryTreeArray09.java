package Jobsheet14;

public class BinaryTreeArray09 {
    Mahasiswa09[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray09() {
        this.dataMahasiswa = new Mahasiswa09[20];
    }

    void populateData(Mahasiswa09 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Tugas 4
    void add(Mahasiswa09 data) {
        if (dataMahasiswa[0] == null) {
            dataMahasiswa[0] = data;
            idxLast = 0;
            return;
        }

        int currentIdx = 0;
        while (true) {
            if (data.ipk < dataMahasiswa[currentIdx].ipk) {
                int leftIdx = 2 * currentIdx + 1;
                if (leftIdx >= dataMahasiswa.length) {
                    System.out.println("Kapasitas array tree tidak cukup!");
                    return;
                }
                if (dataMahasiswa[leftIdx] == null) {
                    dataMahasiswa[leftIdx] = data;
                    if (leftIdx > idxLast) {
                        idxLast = leftIdx;
                    }
                    break;
                }
                currentIdx = leftIdx;
            } else {
                int rightIdx = 2 * currentIdx + 2;
                if (rightIdx >= dataMahasiswa.length) {
                    System.out.println("Kapasitas array tree tidak cukup!");
                    return;
                }
                if (dataMahasiswa[rightIdx] == null) {
                    dataMahasiswa[rightIdx] = data;
                    if (rightIdx > idxLast) {
                        idxLast = rightIdx;
                    }
                    break;
                }
                currentIdx = rightIdx;
            }
        }
    }
    // Tugas 4
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
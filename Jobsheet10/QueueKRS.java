package Jobsheet10;

public class QueueKRS {
Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;
    
    int totalMhsDPA = 30; 
    int jmlSudahKRS = 0;

    public QueueKRS(int max) {
        this.max = max;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian masih kosong.");
        }
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
        }
    }

    public void layaniKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang bisa diproses.");
        } else {
            System.out.println("\n--- Proses Persetujuan KRS ---");
            int dilayani = 0;
            while (!isEmpty() && dilayani < 2) { 
                Mahasiswa mhs = data[front];
                System.out.print("Memproses KRS untuk: ");
                System.out.println(mhs.nim + " - " + mhs.nama);
                size--;
                jmlSudahKRS++;
                dilayani++;

                if (isEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max - 1) {
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            System.out.println("Total mahasiswa yang diproses pada sesi ini: " + dilayani);
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            System.out.printf("%-3s %-10s %-15s %-10s %-10s\n", "No", "NIM", "NAMA", "PRODI", "KELAS");
            int i = front;
            int count = 1;
            while (i != rear) {
                System.out.print(count + ".  ");
                data[i].tampilkanData();
                i = (i + 1) % max;
                count++;
            }
            System.out.print(count + ".  ");
            data[i].tampilkanData();
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Mahasiswa Terdepan:");
            System.out.print("1. ");
            data[front].tampilkanData();
            
            if (size > 1) {
                int indexKedua = (front + 1) % max;
                System.out.print("2. ");
                data[indexKedua].tampilkanData();
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa Paling Akhir: ");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return jmlSudahKRS;
    }

    public int getJumlahBelumKRS() {
        return totalMhsDPA - jmlSudahKRS;
    }
}

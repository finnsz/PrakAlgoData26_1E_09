package Jobsheet11;

public class QueueAntrian09 {
    NodeAntrian09 head, tail;
    int size;
    int capacity = 100;

    public QueueAntrian09() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }

    public void enqueue(String nim, String nama, String keperluan) {
        if (isFull()) {
            System.out.println("Maaf, antrian penuh!");
            return;
        }
        NodeAntrian09 newNode = new NodeAntrian09(nim, nama, keperluan, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + nama + " berhasil masuk ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada mahasiswa yang dipanggil.");
        } else {
            System.out.println("MEMANGGIL ANTRIAN: " + head.nama + " (" + head.keperluan + ")");
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
        }
    }

    public void printFrontBack() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian Terdepan     : " + head.nama + " (NIM: " + head.nim + ")");
            System.out.println("Antrian Paling Akhir : " + tail.nama + " (NIM: " + tail.nim + ")");
        }
    }

    public void printQueueSize() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size + " orang.");
    }
}
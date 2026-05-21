package Jobsheet12;

public class DoubleLinkedList09 {

    Node09 head;
    Node09 tail;
    int size;

    public DoubleLinkedList09() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa09 data) {
        Node09 newNode = new Node09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa09 data) {
        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node09 newNode = new Node09(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node09 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data di awal berhasil dihapus.");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        System.out.println("Data yang berhasil dihapus (Akhir):");
        tail.data.tampil();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node09 current = tail;
        System.out.println("Mencetak Data dari Belakang ke Depan:");
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa09 data) {
        if (isEmpty()) {
            addFirst(data);
        } else if (index < 0 || index > size) {
            System.out.println("Gagal: Nilai indeks di luar batas!");
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node09 newNode = new Node09(data);
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
            System.out.println("Data berhasil disisipkan pada indeks ke-" + index);
        }
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node09 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
        } else if (current.next == null) {
            System.out.println("Tidak ada data setelah NIM " + keyNim + " (ini adalah node terakhir).");
        } else {
            Node09 toDelete = current.next;
            current.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = current;
            } else {
                tail = current;
            }
            size--;
            System.out.println("Data setelah NIM " + keyNim + " berhasil dihapus.");
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus.");
        } else if (index < 0 || index >= size) {
            System.out.println("Gagal: Nilai indeks di luar batas!");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            System.out.println("Data pada indeks ke-" + index + " berhasil dihapus.");
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("=== Data Node Pertama ===");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else {
            System.out.println("=== Data Node Terakhir ===");
            tail.data.tampil();
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else if (index < 0 || index >= size) {
            System.out.println("Gagal: Nilai indeks di luar batas.");
        } else {
            Node09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            System.out.println("=== Data pada Indeks ke-" + index + " ===");
            current.data.tampil();
        }
    }
}

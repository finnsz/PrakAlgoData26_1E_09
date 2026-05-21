package CM2;

public class DLLPembeli {

    NodePembeli head;
    NodePembeli tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Pembeli data) {
        NodePembeli newNode = new NodePembeli(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Pembeli dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pembeli p = head.data;
        if (head == tail) {
            head = tail = null;
            head.prev = null;
        }
        return p;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("\n==========================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==========================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        NodePembeli current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.data.noAntrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }
}

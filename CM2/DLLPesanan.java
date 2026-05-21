package CM2;

public class DLLPesanan {

    NodePesanan head;
    NodePesanan tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void addPesanan(Pesanan data) {
        NodePesanan newNode = new NodePesanan(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortByName() {
        if (isEmpty() || head == tail) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            NodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    Pesanan temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
    }

    public void printLaporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        System.out.println("\nLAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan current = head;
        int totalPendapatan = 0;

        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("------------------------------------------");
        System.out.println("TOTAL PENDAPATAN : Rp " + totalPendapatan);
    }
}

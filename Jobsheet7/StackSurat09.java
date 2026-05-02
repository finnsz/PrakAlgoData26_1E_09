package Jobsheet7;


public class StackSurat09 {
    Surat09[] stack;
    int size;
    int top;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat09 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            Surat09 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang perlu diproses.");
            return null;
        }
    }

    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang terkumpul.");
            return null;
        }
    }

    public void cariSurat(String namaMhs) {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
            return;
        }
        
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMhs)) {
                System.out.println("\n--- Surat Ditemukan ---");
                System.out.println("Posisi dari atas : " + (top - i + 1));
                System.out.println("ID Surat\t : " + stack[i].idSurat);
                System.out.println("Nama\t\t : " + stack[i].namaMahasiswa);
                System.out.println("Jenis Izin\t : " + (stack[i].jenisIzin == 'S' || stack[i].jenisIzin == 's' ? "Sakit" : "Izin Lain"));
                System.out.println("Durasi\t\t : " + stack[i].durasi + " hari");
                ditemukan = true;
                break; 
            }
        }
        
        if (!ditemukan) {
            System.out.println("Surat atas nama " + namaMhs + " tidak ditemukan di dalam tumpukan.");
        }
    }
}
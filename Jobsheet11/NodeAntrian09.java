package Jobsheet11;

public class NodeAntrian09 {
    String nim;
    String nama;
    String keperluan;
    NodeAntrian09 next;

    public NodeAntrian09(String nim, String nama, String keperluan, NodeAntrian09 next) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
        this.next = next;
    }
}
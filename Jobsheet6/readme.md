# 6.2. Searching/ Pencarian Menggunakan Algoritma Sequential Search

## Code Program
<img width="679" height="860" alt="image" src="https://github.com/user-attachments/assets/87fc4e64-08ac-4aea-b119-58c92d438213" />
<img width="519" height="946" alt="image" src="https://github.com/user-attachments/assets/e58513b1-126c-4294-a43c-bd8f62682870" />

## Hasil Running
<img width="458" height="853" alt="image" src="https://github.com/user-attachments/assets/aea6bdd4-d2b0-45a1-9485-d3b1720689ca" />

## Pertanyaan
1. tampilDataSearch vs tampilPosisi: tampilPosisi hanya mencetak di mana letak indeks data ditemukan, sedangkan tampilDataSearch mencetak informasi lengkap mahasiswanya (NIM, nama, kelas, IPK).
2.Fungsi break: Menghentikan proses pencarian seketika setelah data ditemukan, sehingga program lebih efisien (tidak perlu mengecek sisa data).
3.Fungsi pos: Menyimpan posisi indeks dari data yang dicari agar datanya bisa dipanggil kembali.
4. Jika ada data ganda: Akan menampilkan data kembar yang pertama kali ditemukan, karena proses langsung dihentikan oleh perintah break.
5. Jika break dihapus: Program akan terus mencari sampai data terakhir. Jika ada data ganda, yang ditampilkan adalah data kembar yang paling akhir (indeks terbesar), dan prosesnya menjadi tidak efisien.

# 6.3. Searching/ Pencarian Menggunakan Algoritma Binary Search

## Code Program
<img width="635" height="874" alt="image" src="https://github.com/user-attachments/assets/3e1c2237-0b23-4046-81fc-aa7906bb2d15" />
<img width="579" height="339" alt="image" src="https://github.com/user-attachments/assets/0fb8f241-e372-4a84-9d9d-e61ac002e1be" />

## Hasil Running
<img width="484" height="849" alt="image" src="https://github.com/user-attachments/assets/215e32bc-3f4b-4db2-a69e-2c2529fadb83" />

## Pertanyaan
1. Divide: Ditunjukkan oleh baris mid = (left + right) / 2; (membagi area pencarian).
2. Conquer: Ditunjukkan oleh blok if-else yang mengecek kondisi mid dan melakukan pemanggilan rekursif findBinarySearch.
3. Fungsi left, right, mid: left penanda batas kiri (awal), right batas kanan (akhir), dan mid adalah indeks tengah pencarian.
4. Jika data tidak urut: Program tidak akan error, tetapi hasilnya salah/tidak valid karena binary search mewajibkan data sudah terurut.
5. Jika data descending: Hasilnya tidak sesuai (data 3.2 tidak akan ditemukan). Solusi: Ubah tanda > menjadi < pada baris else if (listMhs[mid].ipk < cari).
6. Kondisi tidak ditemukan: Terjadi jika batas kiri (left) sudah melewati batas kanan (right). Perulangan terhenti dan program mengembalikan nilai -1.
7. Modifikasi input: Hapus angka 5 pada int jumMhs=5; dan ganti dengan input dari keyboard:
System.out.print("Jumlah mahasiswa: ");
int jumMhs = sc.nextInt();

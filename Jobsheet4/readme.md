# 5.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
## Code Program
<img width="879" height="578" alt="image" src="https://github.com/user-attachments/assets/69d080c6-2f90-46e0-911c-aed6e4ddf656" />
<img width="1311" height="424" alt="image" src="https://github.com/user-attachments/assets/5112cd8c-4188-47d9-bde1-fe45c85e0090" />

## Hasil Running
<img width="446" height="95" alt="image" src="https://github.com/user-attachments/assets/a36bc862-1898-43b8-be34-886efaa9d739" />

## Pertanyaan
### 1. Perbedaan if dan else (Divide Conquer):
if: Sebagai base case (kondisi berhenti) agar rekursi tidak berjalan tanpa henti (error).
else: Sebagai langkah rekursif tempat method memanggil dirinya sendiri secara berulang.

### 2. Perulangan selain for:
Bisa. Algoritma iteratif bisa memakai while atau do-while.
<img width="352" height="214" alt="image" src="https://github.com/user-attachments/assets/b412d794-04c0-46d1-a00c-116919e133a1" />

### 3. Beda fakto *= i dan int fakto = n * faktorialDC(n-1):
- fakto *= i: Menghitung nilai secara langsung dan berulang di dalam loop (Iteratif).
- n * faktorialDC(n-1): Menghitung dengan cara memanggil method-nya sendiri terus-menerus sampai mencapai base case (Rekursif).

### 4. Kesimpulan BF vs DC:
- faktorialBF (Brute Force): Menggunakan perulangan biasa (looping). Menghitung maju dari 1 sampai n. Lebih hemat memori komputer.
- faktorialDC (Divide Conquer): Menggunakan rekursi (memanggil diri sendiri). Memecah angka dari n turun ke 1. Kodenya lebih ringkas, tapi memakan lebih banyak memori.

# 5.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
## Code Program
<img width="639" height="584" alt="image" src="https://github.com/user-attachments/assets/2141e6bc-62be-478c-a868-c07714168c28" />
<img width="899" height="624" alt="image" src="https://github.com/user-attachments/assets/4d7b9d71-152e-4dc4-ad2c-8e28efcead8f" />

## Hasil Running
<img width="318" height="237" alt="image" src="https://github.com/user-attachments/assets/8a64b878-921e-4328-b7c8-ab51cea51ad8" />

## Pertanyaan
### 1. Perbedaan pangkatBF() dan pangkatDC()
- pangkatBF(): Menggunakan iterasi (perulangan for). Mengalikan basis secara berurutan satu per satu sebanyak nilai pangkatnya.
- pangkatDC(): Menggunakan rekursi (memanggil dirinya sendiri). Membagi nilai pangkat menjadi dua (divide) secara terus menerus, lalu hasil pecahannya dikalikan kembali. Jauh lebih cepat untuk pangkat besar.

### 2. Apakah tahap combine sudah termasuk? Tunjukkan!
Ya, sudah. Tahap combine (menggabungkan) terjadi pada baris kode return di mana hasil pemecahan (rekursi) dikalikan.
Tunjukkan bagian ini:

return(pangkatDC(a, n/2) * pangkatDC(a, n/2) * a); (Combine untuk pangkat ganjil)
return(pangkatDC(a, n/2) * pangkatDC(a, n/2)); (Combine untuk pangkat genap)

### 3. Relevansi parameter pada method pangkatBF()
Relevansi: Sebenarnya sudah tidak relevan/redundant. Karena saat objek dibuat lewat constructor, atribut nilai dan pangkat sudah terisi. Jadi tidak perlu dikirim ulang via parameter.
Bisa tanpa parameter? Sangat bisa.
int pangkatBF(){
    int hasil = 1;
    // Langsung gunakan atribut 'pangkat' dan 'nilai' milik class
    for (int i = 0; i < pangkat; i++) { 
        hasil = hasil * nilai; 
    }
    return hasil;
}

### 4. Kesimpulan cara kerjapangkatBF() (Brute Force): 
- Method pangkatBF() (Brute Force) bekerja secara linear. Jika disuruh menghitung 2 pangkat 10, program akan melakukan perkalian persis 10 kali secara berurutan (2 x 2 x 2 dan seterusnya). Cara ini lebih mudah dipahami secara logika dasar tetapi memakan waktu eksekusi yang lebih lama jika pangkatnya sangat besar.

- Method pangkatDC() (Divide & Conquer) bekerja dengan cara membelah masalah (rekursi). Untuk menghitung 2 pangkat 10, program tidak akan mengalikannya sebanyak 10 kali. Program akan membaginya menjadi perhitungan 2 pangkat 5 dikali 2 pangkat 5. Pendekatan ini membuat jumlah langkah perhitungan menjadi jauh lebih sedikit dan sangat menghemat waktu proses komputer.

## 5.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
### Code Program
<img width="726" height="782" alt="image" src="https://github.com/user-attachments/assets/4f3c4c75-b5fc-40d4-afa1-2c8e11818672" />
<img width="1312" height="627" alt="image" src="https://github.com/user-attachments/assets/b1a10fa3-3649-4381-97a2-db159249a7d3" />

### Hasil Running
<img width="501" height="202" alt="image" src="https://github.com/user-attachments/assets/13b5403b-36aa-4291-94fb-e8c0cb9f780f" />

## Pertanyaan
### 1. Fungsi mid: 
Untuk mencari titik tengah guna membelah array menjadi dua bagian (tahap Divide).

### 2. Fungsi lsum & rsum: 
Menghitung total nilai pada potongan array sebelah kiri (lsum) dan kanan (rsum) secara rekursif (tahap Conquer).

### 3. Fungsi lsum + rsum: 
Menggabungkan hasil hitungan dari bagian kiri dan kanan untuk mendapatkan total keseluruhan (tahap Combine).

### 4. Base case: 
if(l == r) { return arr[l]; }. Ini adalah kondisi berhenti saat array sudah terpecah hingga tersisa 1 elemen saja.

### 5. Kesimpulan: 
totalDC() bekerja dengan membelah array terus-menerus menjadi dua bagian hingga tersisa 1 elemen, lalu menjumlahkan pecahannya kembali ke atas secara bertahap untuk mendapatkan total akhir.

## Latihan
### Code Program
<img width="1213" height="552" alt="image" src="https://github.com/user-attachments/assets/a5d21846-5cce-447e-9100-9f09fb73a56a" />
<img width="760" height="983" alt="image" src="https://github.com/user-attachments/assets/b6494f39-8f30-4101-b616-2c1b8e68da92" />

### Hasil Running
<img width="441" height="91" alt="image" src="https://github.com/user-attachments/assets/25988d8c-7aa7-4cc7-ae64-5fd46d88d82b" />


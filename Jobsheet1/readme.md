# 2.2.1 Praktikum Pemilihan
Pertanyaan
1. Buatlah program untuk menghitung nilai akhir dari mahasiswa dengan ketentuan 20% nilai
tugas, 20% dari nilai kuis, 30% nilai UTS, dan 40% nilai UAS. Setiap nilai yang dimasukkan
mempunyai batas nilai 0 ‐ 100. Ketika pengguna memasukkan di luar rentang tersebut maka
akan keluar output “nilai tidak valid”. Ketika nilai akhir sudah didapatkan selanjutnya lakukan
konversi nilai dengan ketentuan sebagai berikut:
<img width="624" height="310" alt="image" src="https://github.com/user-attachments/assets/151e415b-d520-4868-a2ce-eed50fffdda2" />

Jika Nilai Huruf yang didapatkan adalah A, B+, B, C+, C maka LULUS, jika nilai huruf D dan E
maka TIDAK LULUS.
• Input dari program berupa komponen nilai tugas, kuis, UTS, UAS
• Otuput dari program “nilai tidak valid” jika nilai yang dimasukkan diluar ketentuan
• Output dari program berupa hasil nilai akhir, nilai huruf, dan keterangan LULUS/
TIDAK LULUS

# Jawaban
<img width="687" height="622" alt="image" src="https://github.com/user-attachments/assets/fd7194af-439c-46cc-8684-55da536502df" />
<img width="983" height="711" alt="image" src="https://github.com/user-attachments/assets/a2bf5c90-7f91-485c-af0e-9c888b3421b5" />


# Hasil Running
<img width="496" height="267" alt="image" src="https://github.com/user-attachments/assets/e520260a-e92c-439e-ad8a-be786a5e21ef" />


# 2.3.1 Praktikum Perulangan
Pertanyaan
1. Buatlah program yang dapat menampilkan deretan bilangan dari angka 1 sampai n, dengan
n = 2-digit terakhir NIM Anda. Berikut Adalah ketentuan untuk mencetak deretnya
a. Bilangan kelipatan 3 dicetak dengan simbol #
b. Bilangan genap selain kelipatan 3 dicetak sesuai angkanya
c. Bilangan ganjil dicetak dengan simbol *
d. Bilangan 10 dan 15 tidak dicetak
*bila n<10 maka tambahkan 10 (n+=10)
Contoh 1: Input NIM: 2541720102 maka n=12
Output: * 2 # 4 * # * 8 # * #
Contoh 2: Input NIM: 2541720120 maka n=20
Output: * 2 # 4 * # * 8 # * # * 14 16 * # * 20

# Jawaban
<img width="667" height="602" alt="image" src="https://github.com/user-attachments/assets/c64ef530-9311-4693-bcb6-bfc0417acfc2" />

# Hasil Running

<img width="191" height="43" alt="image" src="https://github.com/user-attachments/assets/aa283988-3db4-4a5f-988e-b5788e0059ca" />

# 2.4.1 Praktikum Array
Pertanyaan
1. Buatlah program untuk menghitung IP Semester dari mata kuliah yang Anda tempuh
semester lalu. Formula untuk menghitung IP semester sebagai berikut:
𝐼𝑃 𝑆𝑒𝑚𝑒𝑠𝑡𝑒𝑟 =
∑𝑖(𝑁𝑖𝑙𝑎𝑖 𝑆𝑒𝑡𝑎𝑟𝑎𝑖 ∗ 𝑏𝑜𝑏𝑜𝑡 𝑆𝐾𝑆𝑖)
∑ 𝑆𝐾𝑆
Nilai setara didapatkan dari tabel konversi berikut ini: 
<img width="612" height="310" alt="image" src="https://github.com/user-attachments/assets/12daaaf7-7858-4592-83e0-6ad4635cd661" />

Input dari program berupa nama mata kuliah, bobot SKS, serta nilai huruf dari mata kuliah
tersebut.

# Jawaban 
<img width="910" height="732" alt="Screenshot 2026-02-19 220427" src="https://github.com/user-attachments/assets/1fdf3c84-5750-476b-a3ac-3a071fb65c73" />
<img width="476" height="674" alt="Screenshot 2026-02-19 220438" src="https://github.com/user-attachments/assets/c48164db-139b-4cb3-8e2d-e83bb406c9fa" />
<img width="1349" height="552" alt="Screenshot 2026-02-19 220445" src="https://github.com/user-attachments/assets/dad3059e-a070-43b2-8819-8965cae3b4e2" />

# Hasil Running

<img width="486" height="270" alt="image" src="https://github.com/user-attachments/assets/8712be10-7ff8-40a1-803a-989f7f26c9f9" />

# Tugas
1. Susun program untuk membuat dua buah array berikut isinya sebagai berikut. Array pertama
adalah array satu dimensi char KODE[10], berisi kode plat mobil. Array kedua, array dua
dimensi char KOTA[10][12] berisi nama kota yang berpasangan dengan kode plat mobil.
Ilustrasi tampilan array tersebut adalah sebagai berikut:
<img width="738" height="384" alt="image" src="https://github.com/user-attachments/assets/226bfc12-77de-4d54-a37d-c3c5d1bf4350" />

Ketika pengguna memberikan input kode plat nomor maka program akan mengeluarkan
nama kota dari kode plat nomor tersebut.

# Jawaban
<img width="932" height="904" alt="Screenshot 2026-02-19 221739" src="https://github.com/user-attachments/assets/610f43d7-ddd3-4ba2-8a72-099c703c3fb8" />



# Hasil Running
<img width="282" height="58" alt="Screenshot 2026-02-19 221750" src="https://github.com/user-attachments/assets/b14a2d41-ab90-445b-9f65-2dbebd6fa617" />

2. Sebuah program digunakan untuk menyimpan dan mengelola jadwal kuliah mahasiswa.
Data jadwal disimpan dalam array 2 dimensi bertipe string, dengan ketentuan
• Baris menyatakan jadwal ke-i
• Kolom menyatakan informasi jadwal: Nama Mata Kuliah, Ruang, Hari Kuliah, , Jam
Kuliah. Contoh :
jadwal[0][0] = "Pemrograman Dasar"
jadwal[0][1] = "Lab Komputasi 1"
jadwal[0][2] = "Senin"
jadwal[0][3] = "08.00–10.00"
• Jumlah jadwal kuliah sebanyak n, diinputkan oleh pengguna.
Buatkan fungsi untuk
a. Menginput data jadwal kuliah ke dalam array 2 dimensi
b. Menampilkan seluruh jadwal kuliah dalam bentuk tabel
c. Menampilkan jadwal kuliah berdasarkan hari tertentu
d. Menampilkan jadwal kuliah berdasarkan nama mata kuliah tertentu

# Jawaban
<img width="539" height="724" alt="Screenshot 2026-02-19 221912" src="https://github.com/user-attachments/assets/7e2d3477-6918-4c01-92b7-17162faa6f57" />
<img width="1170" height="492" alt="Screenshot 2026-02-19 221922" src="https://github.com/user-attachments/assets/6fe2af86-920b-4c57-b621-744853b75f40" />


# Hasil Running
<img width="495" height="389" alt="Screenshot 2026-02-19 222009" src="https://github.com/user-attachments/assets/893d832e-71e4-43f7-9469-8b2476239362" />

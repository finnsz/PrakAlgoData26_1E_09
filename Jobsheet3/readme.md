# 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array of objects,
kemudian mengisi dan menampilkan array tersebut.

## Code Program
<img width="379" height="166" alt="image" src="https://github.com/user-attachments/assets/ceb6b9ef-2b3b-4f44-bd00-7ec43a8b4eeb" />
<img width="439" height="585" alt="image" src="https://github.com/user-attachments/assets/692d4a00-4226-4a0d-8d99-a0b3c7e68145" />

## Hasil Running
<img width="252" height="269" alt="image" src="https://github.com/user-attachments/assets/dd655421-be3a-4be2-85dc-a208c58d1cfc" />

### 1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
Tidak, Class di atas hanya berisi atribut saja dan sama sekali tidak memiliki method. Array hanya bertugas menyediakan ruang di memori untuk menyimpan sekumpulan referensi

### 2. Apa yang dilakukan oleh kode program berikut?
<img width="803" height="50" alt="image" src="https://github.com/user-attachments/assets/3b4789cb-e50c-4d19-ad32-90bf51fd717d" />
mendeklarasikan sekaligus mengalokasikan memori sebuah array of object

### 3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut
<img width="800" height="44" alt="image" src="https://github.com/user-attachments/assets/79c1767e-e94e-4f31-a8f0-4a0b8642bd83" />
Class untuk array of object tidak wajib memiliki method dan sudah valid jika hanya berisi atribut saja. Mendeklarasikan array hanya menyiapkan wadah kosong di memori, sedangkan objek aslinya belum tercipta. Objek tersebut tetap bisa diinisialisasi tanpa konstruktor buatan karena Java otomatis menyediakan default constructor.

### 4. Apa yang dilakukan oleh kode program berikut?
<img width="800" height="139" alt="image" src="https://github.com/user-attachments/assets/85d86f59-ae1f-49e5-8dc0-b9ef9556189a" />
kode ini adalah proses instansiasi sekaligus inisialisasi untuk satu data mahasiswa di dalam array

### 5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
Class Mahasiswa khusus bertugas sebagai cetakan atau struktur datanya saja.
Class MahasiswaDemo khusus bertugas mengeksekusi dan menguji programnya.

# Menerima Input Isian Array Menggunakan Looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat
menerima input dan menggunakan looping untuk mengisikan atribut dari semua objek Mahasiswa

## Code Program


## Hasil Running

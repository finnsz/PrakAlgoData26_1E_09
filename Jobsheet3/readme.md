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

# 3.3 Menerima Input Isian Array Menggunakan Looping
Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat
menerima input dan menggunakan looping untuk mengisikan atribut dari semua objek Mahasiswa

## Code Program
<img width="567" height="628" alt="image" src="https://github.com/user-attachments/assets/4b32b775-8b6e-4612-b290-7efd85d51b86" />

## Hasil Running
<img width="180" height="328" alt="image" src="https://github.com/user-attachments/assets/a31cb6a3-3186-417e-9fd1-5b254e66832c" />

## 1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.
mahasiswaDemo.java

<img width="658" height="79" alt="image" src="https://github.com/user-attachments/assets/98b744ca-9839-4792-95ef-63f91b9921e9" />

mahasiswa.java

<img width="547" height="205" alt="image" src="https://github.com/user-attachments/assets/33615a96-e494-4f12-b20f-d72bd0aa8392" />

## 2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
<img width="802" height="155" alt="image" src="https://github.com/user-attachments/assets/0a3cfa95-157c-40dd-b581-b9d22182d27d" />

Karena objek belum di instansiasi

# Constructor Berparameter
Pada praktikum ini kita akan melakukan instansiasi variable array of object dengan
menggunakan constructor berparameter.

## Code Program
<img width="577" height="280" alt="image" src="https://github.com/user-attachments/assets/e0ebbeb1-7e20-4f31-bcec-4932970c2878" />
<img width="618" height="658" alt="image" src="https://github.com/user-attachments/assets/c1a04b11-33f5-455d-b3f1-0537d56ac02f" />

## Hasil Running
<img width="274" height="444" alt="image" src="https://github.com/user-attachments/assets/c1f0c347-99ec-415e-bc9b-aedeeb6a7691" />

## 1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
Iya bisa,
`public matakuliah09() {
}
public matakuliah09(String kode, String nama, int sks, int jumlahJam) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
    this.jumlahJam = jumlahJam;
} `

## 2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah


## 3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan methodtersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar


## 4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari array of object Matakuliah ditentukan oleh user melalui input dengan Scanner







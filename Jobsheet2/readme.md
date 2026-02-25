# 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
Waktu Percobaan : 50 Menit
Pada Percobaan 1 ini dilakukan pembuatan class beserta atribut dan method yang dimilikinya.
Perhatikan Class Diagram berikut ini:

<img width="467" height="230" alt="image" src="https://github.com/user-attachments/assets/777c1096-1dc5-4f54-b937-07e3c2449519" />

Berdasarkan class diagram tersebut, akan dibuat program menggunakan bahasa Java.

## Code Program
<img width="525" height="901" alt="Screenshot 2026-02-20 143902" src="https://github.com/user-attachments/assets/6a7761d2-5782-4dc3-a279-3312c5c49eb4" />


## Hasil Running
<img width="928" height="77" alt="image" src="https://github.com/user-attachments/assets/4f94bc3b-bfa3-474a-a7b7-2d13b4ae397d" />

### 1. Sebutkan dua karakteristik class atau object!
Atribut (state/data) yang menyimpan karakteristik atau status objek, dan Method (behavior/perilaku) yang mendefinisikan tindakan atau fungsi yang dapat dilakukan objek tersebut.

### 2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Mahasiswa? Sebutkan apa saja atributnya!
4, nama, nim, kelas, ipk

### 3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
4, tampilkanInformasi, ubahKelas, updateIPK, nilaiKerja

### 4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".
<img width="675" height="410" alt="image" src="https://github.com/user-attachments/assets/6966af25-533f-438b-a80d-32e563ecf8aa" />


### 5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
Method ini mengevaluasi variabel ipk melalui nested if untuk menentukan kategori kinerja mahasiswa berdasarkan rentang nilai 0.0 hingga 4.0.
Hasil yang dikembalikan berupa teks yang menyatakan status kinerja atau pesan kesalahan jika nilai IPK tidak valid.

# 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
Waktu Percobaan: 50 Menit
Sampai tahap ini, class Mahasiswa telah berhasil dibuat pada Percobaan 1. Selanjutnya, apabila
class Mahasiswa tersebut ingin digunakan dan diakses atribut serta method-nya, maka perlu dibuat
object/instance dari class Mahasiswa terlebih dahulu melalui proses instansiasi.

## Code Program
<img width="613" height="519" alt="image" src="https://github.com/user-attachments/assets/647a8166-e200-44ab-a272-a9021954ac5d" />


## Hasil Running
<img width="456" height="205" alt="image" src="https://github.com/user-attachments/assets/bced7926-8bf2-4689-83ef-7d9dc417fa4f" />

### 1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
1. Baris Kode: mahasiswa09 mhs1 = new mahasiswa09();
Nama Objek: mhs1
2. Baris Kode: mahasiswa09 mhs2 = new mahasiswa09("Geraldi Rama Nugraha",  "254107020100", 3.67, "TI 1E");
Nama Objek: mhs2
3. Baris Kode: mahasiswa09 mhsGeraldi = new mahasiswa09("Geraldi Rama Nugraha", "254107020100", 3.90, "TI 1E");
Nama Objek: mhsGeraldi

### 2. Bagaimana cara mengakses atribut dan method dari suatu objek?
menggunakan format: namaObjek.namaAtribut

### 3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
karena data di dalam objek mhs1 telah diubah di antara kedua pemanggilan tersebut

# 2.3 Percobaan 3: Membuat Konstruktor
Waktu Percobaan: 60 Menit
Pada percobaan ini, dilakukan pembuatan kode program untuk mengimplementasikan berbagai
macam konstruktor berdasarkan parameternya

## Code Program
<img width="1267" height="679" alt="image" src="https://github.com/user-attachments/assets/e807532c-b9f5-41b1-afe0-b6535cbc3618" />

## Hasil Running
<img width="457" height="206" alt="image" src="https://github.com/user-attachments/assets/5e7a6d0e-81ec-4975-8608-d7726da1d208" />

### 1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk mendeklarasikan konstruktor berparameter!
#public mahasiswa09(String nm, String nim, double ipk, String kls){
   #nama = nm;
   #this.nim = nim;
    #this.ipk = ipk;
    #kelas = kls;
#}

### 2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 
<img width="824" height="22" alt="image" src="https://github.com/user-attachments/assets/ccf60203-ff80-4102-bd73-959eaaccab4c" />
Baris tersebut melakukan instansiasi sekaligus inisialisasi. Program membuat objek baru dari class mahasiswa09 dan langsung mengisi nilai atributnya (nama, nim, ipk, dan kelas) menggunakan konstruktor berparameter agar data tidak kosong saat objek tercipta.

### 3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
<img width="782" height="112" alt="image" src="https://github.com/user-attachments/assets/88a2d7ec-1cfd-4fa2-a403-d6739d668261" />
Karena saat kita membuat konstruktor berparameter, Java secara otomatis menghapus "konstruktor default" bawaannya. Jika kita tidak menuliskannya secara manual di dalam class, maka objek tidak bisa lagi dibuat tanpa parameter.

### 4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!
Tidak harus berurutan.Method bersifat independen. Urutan hanya penting jika ada logika program yang mengharuskan satu data diproses sebelum ditampilkan

### 5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!
#mahasiswa09 mhsGeraldi = new mahasiswa09("Geraldi Rama Nugraha", "254107020100", 3.90, "TI 1E");

# 2.4 Latihan Praktikum
Waktu : 150 Menit
1. Diberikan class diagram dari class MataKuliah sebagai berikut:
<img width="470" height="228" alt="image" src="https://github.com/user-attachments/assets/65444986-8041-4df3-a2a6-49aeadeb9fb1" />
Buat program untuk mengimplementasikan class MataKuliah berdasarkan class diagram di atas,
yang terdiri dari:
- Class MataKuliah (MataKuliah<NoAbsen>.java)
- Class MataKuliahMain (MataKuliahMain<NoAbsen>.java)
Pada class MataKuliahMain buatlah minimal 2 objek. Gunakan konstruktor default dan
konstruktor berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah
dibuat pada class MataKuliah.
Penjelasan dari atribut dan method pada class MataKuliah tersebut adalah sebagai berikut:
a. Atribut
• kodeMK (String): kode unik untuk mata kuliah.
• nama (String): nama lengkap dari mata kuliah
• sks (int): SKS (Satuan Kredit Semester)
• jumlahJam (int): jumlah total jam pertemuan per minggu untuk mata kuliah
b. Method
• tampilInformasi(): method ini digunakan untuk menampilkan semua informasi yang
berkaitan dengan mata kuliah.
• ubahSKS(int sksBaru): method ini memungkinkan pengubahan nilai SKS untuk mata
kuliah. Setelah mengubah nilai, method ini memberi tahu pengguna bahwa SKS telah
diubah.
• tambahJam(int jam): method ini menambahkan jumlah jam tambahan ke jumlah jam
yang sudah ada untuk mata kuliah.
• kurangiJam(int jam): method ini berfungsi untuk mengurangi jumlah jam dari mata
kuliah. Sebelum mengurangi, method ini melakukan pengecekan untuk memastikan
bahwa jumlah jam yang tersisa cukup untuk dikurangi. Jika jumlah jam tidak mencukupi
(jumlah jam awal lebih kecil dari jam pengurang), method ini akan memberi tahu
pengguna bahwa pengurangan tidak dapat dilakukan. Jika pengurangan berhasil, method
ini mengupdate jumlah jam dan mencetak nilai jumlah jam yang baru.

## Code Program
<img width="781" height="928" alt="image" src="https://github.com/user-attachments/assets/d0db2b61-e7bd-4ed6-9907-8cbec4823d02" />
<img width="1127" height="574" alt="image" src="https://github.com/user-attachments/assets/cd8a2699-d39d-42fd-9e6d-b55844fd3a46" />

## Hasil Running
<img width="430" height="195" alt="image" src="https://github.com/user-attachments/assets/a706dd97-fece-49e5-933d-9124e5e30712" />

# 2. Diberikan class diagram dari class Dosen sebagai berikut:
<img width="463" height="253" alt="image" src="https://github.com/user-attachments/assets/3b01664f-fefc-441c-bbb2-9fe96ebf9b7f" />
Buat program untuk mengimplementasikan class Dosen berdasarkan class diagram di atas, yang
terdiri dari:
- Class Dosen (Dosen<NoAbsen>.java)
- Class DosenMain (DosenMain<NoAbsen>.java)
Pada class DosenMain buatlah minimal 2 objek. Gunakan konstruktor default dan konstruktor
berparameter saat mengintansiasi objek. Lalu panggil semua method yang sudah dibuat pada
class Dosen
Penjelasan dari atribut dan method pada class Dosen tersebut adalah sebagai berikut:
a. Atribut
• idDosen (String): id unik untuk setiap dosen.
• nama (String): nama lengkap dari dosen.
• statusAktif (boolean): menunjukkan apakah dosen tersebut aktif (true) atau tidak aktif
(false) dalam menjalankan tugasnya.
• tahunBergabung (int): tahun ketika dosen mulai bergabung dengan perguruan tinggi
• bidangKeahlian (String): bidang keahlian dosen, yang menjelaskan spesialisasi atau fokus
akademik dosen
b. Method
• tampilInformasi(): method ini digunakan untuk menampilkan informasi lengkap tentang
dosen
• setStatusAktif(status: boolean): method ini digunakan untuk mengatur status aktif
dosen. Jika parameter status diatur ke true, berarti dosen tersebut menjadi aktif.
Sebaliknya, jika false, dosen tersebut dinyatakan tidak aktif.
• hitungMasaKerja(thnSkrg: int): method ini menghitung dan mengembalikan (me-returnkan) masa kerja dosen dalam tahun, berdasarkan tahun bergabung dan tahun saat ini
(thnSkrg) yang menjadi parameter input method ini. Hasil perhitungan memberikan
informasi tentang lamanya dosen bekerja di perguruan tinggi.
• ubahKeahlian(bidang: String): method ini digunakan untuk mengubah bidang keahlian
dosen.

## Code Program
<img width="676" height="700" alt="image" src="https://github.com/user-attachments/assets/740f0a5e-2b79-4ed7-9f59-4e0413000548" />
<img width="919" height="404" alt="image" src="https://github.com/user-attachments/assets/b60d73d9-f4b3-43c4-9625-b064908a92f1" />

## Hasil Running
<img width="416" height="262" alt="image" src="https://github.com/user-attachments/assets/f46a5a53-a45c-4499-b0eb-03780eca9176" />











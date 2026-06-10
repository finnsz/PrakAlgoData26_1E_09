<img width="523" height="212" alt="image" src="https://github.com/user-attachments/assets/92eb760f-263b-411f-9907-c3a456debc64" /># Praktikum 1
## Code Program
<img width="331" height="259" alt="image" src="https://github.com/user-attachments/assets/7c176f62-23ef-426b-9272-bdbd68bac834" />
<img width="881" height="384" alt="image" src="https://github.com/user-attachments/assets/e2b4e87a-e4e9-4436-acfa-2dd76c808523" />
<img width="360" height="853" alt="image" src="https://github.com/user-attachments/assets/67029e41-01c9-4236-88bc-0f57ed8ba6e2" />
<img width="408" height="890" alt="image" src="https://github.com/user-attachments/assets/1f7a1bd0-bb22-4eaa-83a2-35d5ad836111" />
<img width="361" height="896" alt="image" src="https://github.com/user-attachments/assets/99f32a19-d973-4306-9465-ac9947414970" />
<img width="570" height="610" alt="image" src="https://github.com/user-attachments/assets/3f0de091-21c3-4a04-a17b-48e36b0ccf70" />

## Hasil Running
<img width="469" height="928" alt="image" src="https://github.com/user-attachments/assets/e94de39f-aa4d-45b3-817f-0ca496613eb0" />

## Pertanyaan
1. Karena struktur datanya selalu diurutkan dengan aturan tertentu (nilai yang lebih kecil ditempatkan pada node left/kiri dan nilai yang lebih besar di node right/kanan). Hal ini mengeliminasi setengah bagian dari tree pada setiap iterasi, sehingga membuat pencariannya jauh lebih cepat (kompleksitas $O(\log n)$) dibandingkan dengan mengecek satu per satu.
2. Berfungsi sebagai pointer (penunjuk). Atribut left digunakan untuk menunjuk ke anak node di sebelah kiri, sedangkan right digunakan untuk menunjuk ke anak node di sebelah kanan.
3. a. Berfungsi sebagai akar atau penanda posisi paling atas (awal) dari sebuah tree.
   b. Nilainya adalah null, yang menandakan bahwa tree tersebut masih kosong.
4. Node baru tersebut akan langsung dialokasikan dan dideklarasikan sebagai root dari pohon tersebut.
5. Baris kode tersebut bertugas memposisikan node baru di struktur pohon. parent = current; digunakan untuk merekam posisi node saat ini. Kemudian ada percabangan: jika IPK mahasiswa lebih kecil, pointer bergerak ke anak kiri (current = current.left;). Jika ditemukan posisi yang kosong (null), node baru dihubungkan menjadi anak kiri dari parent (parent.left = newNode;), lalu program keluar dari loop (return;). Proses yang sama berlaku ke anak kanan (turun ke current.right lalu parent.right = newNode;) jika IPK mahasiswa lebih besar atau sama.
6. Jika node yang akan dihapus (current) memiliki dua anak, langkah pertama adalah mencari node penggantinya dengan memanggil getSuccessor(current). Setelah ditemukan (node successor), nilai root (atau anak dari parent yang menunjuk ke node lama) akan diganti dengan node successor. Terakhir, anak kiri dari node yang dihapus disambungkan kembali ke anak kiri dari node successor (successor.left = current.left;). Method getSuccessor() membantu proses ini dengan mencari node terkecil dari sub-pohon sebelah kanan sebagai pengganti yang paling tepat agar tree tetap terurut.

# Praktikum 2
## Code Program
<img width="785" height="686" alt="image" src="https://github.com/user-attachments/assets/167d6305-607f-4c48-be88-7a6fb1777134" />
<img width="416" height="950" alt="image" src="https://github.com/user-attachments/assets/46a6fd78-d80c-4ede-8ec9-54ed329c649d" />

## Hasil Running
<img width="450" height="324" alt="image" src="https://github.com/user-attachments/assets/41dbc5b2-c32a-4a84-85fe-38190620755e" />

## Pertanyaan
1. Atribut dataMahasiswa (array) digunakan untuk menyimpan data node atau struktur tree secara berdampingan dalam memori tanpa pointer, sedangkan idxLast berfungsi sebagai petunjuk atau indeks pembatas dari elemen node terakhir yang dimasukkan ke dalam array.
2. Digunakan untuk menginisialisasi atau memasukkan sekumpulan objek array beserta penunjuk elemen terakhir (idxLast) secara langsung ke dalam class tanpa perlu memasukkannya satu per satu.
3. Digunakan untuk menelusuri (melakukan traversal) lalu mencetak informasi mahasiswa dari posisi node paling kiri, lalu akar (saat ini), kemudian paling kanan secara rekursif menggunakan pendekatan penyesuaian indeks array.
4. Anak kiri berada di indeks ke-5 (dihitung dari rumus 2 x 2 + 1) dan anak kanan berada di indeks ke-6 (dihitung dari rumus 2 x 2 + 2).
5. Mendeklarasikan bahwa batas indeks elemen pohon yang berisi data sah yang perlu dikunjungi berada hingga array berindeks ke-6.
6. Rumus matematika tersebut merupakan struktur baku dari array dalam merepresentasikan pohon biner, di mana letak anak kiri selalu berindeks dua kali posisi dari ayah (parent) ditambah 1, dan anak kanannya ditambah 2. Hal ini menjaga keteraturan posisi pohon meskipun disimpan di memori sekuensial (array).

# Tugas Praktikum
## Code Program
<img width="643" height="318" alt="image" src="https://github.com/user-attachments/assets/0bdca596-4f1b-4759-9184-52a51afdd925" />
<img width="633" height="563" alt="image" src="https://github.com/user-attachments/assets/d3f7fac5-deb6-4ce6-b2d9-8cce865275b0" />
<img width="718" height="321" alt="image" src="https://github.com/user-attachments/assets/c6ed8bf8-13da-45a3-acb3-84022987acb5" />
<img width="725" height="854" alt="image" src="https://github.com/user-attachments/assets/354d43e9-e58a-4b4d-afe7-2b959dfdf77d" />
<img width="523" height="212" alt="image" src="https://github.com/user-attachments/assets/90752e23-84db-428c-8506-28b9ca31631f" />

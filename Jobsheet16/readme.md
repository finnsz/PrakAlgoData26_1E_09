# Percobaan 1
## Code Program 
<img width="828" height="876" alt="image" src="https://github.com/user-attachments/assets/984b51b1-bca3-47c1-9d21-b0a98617e94f" />

## Hasil Running
<img width="431" height="92" alt="image" src="https://github.com/user-attachments/assets/634d94d5-757a-4fac-92fd-0bb8f74f4039" />

## Pertanyaan
1. Karena objek ArrayList diinisialisasi tanpa menspesifikasikan tipe data generic atau disebut sebagai raw type. Tanpa definisi <TipeData>, tipe default dari setiap elemen yang masuk ke dalam list dianggap sebagai kelas Object, sehingga tipe turunan apa pun (seperti Integer dan String) bisa dimasukkan.
2. List<Integer> l = new ArrayList<>(); // 
l.add(1);
l.add(2);
l.add(3);
l.add(4);
3. Ketika Anda menggunakan LinkedList<String> names = new LinkedList<>(); dan memanggil names.push("Mei-mei");, data "Mei-mei" akan didorong (di-push) ke posisi teratas atau paling awal dari list (berlaku seperti Stack). Akibatnya, pada saat program memanggil names.getFirst(), elemen yang dicetak adalah "Mei-mei".
4. 
# Percobaan 2
## Code Program
<img width="647" height="948" alt="image" src="https://github.com/user-attachments/assets/5a7db6c8-7782-44d5-acaa-6a96670d5e4d" />

## Hasil Running
<img width="432" height="117" alt="image" src="https://github.com/user-attachments/assets/46007d68-13b6-4355-bf22-e942369b17af" />

## Pertanyaan
1. Fungsi push() adalah fungsi spesifik milik class Stack yang berguna untuk menumpuk elemen di posisi teratas/akhir (berkonsep LIFO: Last In, First Out). Sedangkan add() merupakan method standar bawaan dari interface Collection/List untuk memasukkan elemen ke akhir struktur data.
2. Jika kode fruits.push("Melon"); dan fruits.push("Durian"); dihilangkan, maka kode perulangan di bawahnya (seperti perulangan Iterator dan for-each) tidak akan mencetak buah apa-apa dan menjadi kosong. Hal ini dikarenakan tumpukan buah sudah habis dihapus satu per satu oleh method fruits.pop() di baris ke-39 pada saat perulangan while (!fruits.empty()) sebelumnya.
3. Baris kode tersebut digunakan untuk menampilkan elemen menggunakan objek Iterator. Method it.hasNext() berfungsi untuk mengecek apakah masih ada elemen yang tertinggal dalam Collection, dan method it.next() berfungsi untuk mengambil serta berpindah ke elemen selanjutnya.
4. Akan terjadi sintaks error. Interface List tidak mendefinisikan method push(), empty(), maupun pop(). Fungsi-fungsi tersebut hanya dimiliki secara spesifik oleh class Stack.
5. Mengganti elemen terakhir menjadi "Strawberry"
fruits.set(fruits.size() - 1, "Strawberry");
6. Menambahkan buah baru dan melakukan sorting
fruits.add("Mango");
fruits.add("guava");
fruits.add("avocado");

Collections.sort(fruits);
System.out.println("Setelah di-sort: " + fruits);
# Percobaan 3
## Code Program
<img width="637" height="857" alt="image" src="https://github.com/user-attachments/assets/2b44f0f6-9b91-4c59-8bfe-d45396fb8616" />

## Hasil Running
<img width="592" height="163" alt="image" src="https://github.com/user-attachments/assets/884cd7fa-5f32-4007-b3e5-6ab02a605c9b" />

## Pertanyaan
1. Fungsi yang memanfaatkan titik tiga (...) disebut dengan konsep Varargs (Variable Arguments). Kelebihannya adalah memungkinkan pengembang untuk mengoper argumen sebanyak apapun (fleksibel) tanpa perlu memaksakan inisialisasi struktur Array secara manual.
2. // Menambahkan method Sort menggunakan Comparator (Ascending berdasarkan NIM)
public void sortAsc() {
    Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim));
}

// Pencarian dengan method binarySearch
public int binarySearch(String nim) {
    sortAsc(); // Data harus diurutkan terlebih dahulu untuk binary search 
    Mahasiswa key = new Mahasiswa(nim, "", "");
    return Collections.binarySearch(mahasiswas, key, (m1, m2) -> m1.nim.compareTo(m2.nim));
}

# Tugas
## Code Program
<img width="472" height="878" alt="image" src="https://github.com/user-attachments/assets/f0b164ea-5374-4a69-96dc-3d31549f9d92" />
<img width="557" height="813" alt="image" src="https://github.com/user-attachments/assets/2a70fc9a-e1e7-4dd3-90d8-309f906cc7f0" />
<img width="568" height="88" alt="image" src="https://github.com/user-attachments/assets/99185f05-dc04-452d-872d-b13ab26e86d7" />

## Hasil Running
<img width="517" height="702" alt="image" src="https://github.com/user-attachments/assets/a9061343-4ec8-42a5-9469-9f3012bf22eb" />

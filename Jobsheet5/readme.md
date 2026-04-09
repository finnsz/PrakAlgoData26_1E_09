# 5.2 Praktikum 1 - Mengimplementasikan Sorting menggunakan object
## a. SORTING – BUBBLE SORT
## Code Program

<img width="574" height="810" alt="image" src="https://github.com/user-attachments/assets/a050c9cf-509d-4648-9f7a-62e8f365dfd3" />
<img width="865" height="380" alt="image" src="https://github.com/user-attachments/assets/f3fcb70d-12e5-448d-93ee-c0891d1518be" />

## Hasil Running
<img width="376" height="79" alt="image" src="https://github.com/user-attachments/assets/3fb9b459-085d-470a-a3d6-b370f8f332c0" />

## b. SORTING – SELECTION SORT
## Code Program
<img width="506" height="318" alt="image" src="https://github.com/user-attachments/assets/f4a1ef00-1326-4c74-bda7-42684e03f534" />
<img width="717" height="456" alt="image" src="https://github.com/user-attachments/assets/78baeb03-04f7-4c74-9e07-72ebc253384d" />

## Hasil Running
<img width="451" height="106" alt="image" src="https://github.com/user-attachments/assets/42e9e3ff-5352-49df-978c-0172d736c7ae" />

## c. SORTING – INSERTION SORT
## Code Program
<img width="598" height="372" alt="image" src="https://github.com/user-attachments/assets/b1edfe19-ff9a-421d-8b64-ca805e8368c7" />
<img width="609" height="561" alt="image" src="https://github.com/user-attachments/assets/295ce5a8-8154-49d8-b99b-c7391208a620" />


## Hasil Running
<img width="453" height="107" alt="image" src="https://github.com/user-attachments/assets/7e386f2e-73fb-4473-972c-a8b870c461c2" />

## 5.2.5 Pertanyaan!
### 1. Untuk menukar posisi dua buah data yang saling bersebelahan di dalam sebuah array
### 2. Code yang mencari nilai minimum
            int min = i;
            for (int j = i + 1; j < jumData; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
### 3. Maksud kondisi perulangan while (j>=0 && data[j]>temp) pada Insertion Sort 
j >= 0 agar pencarian tidak keluar dari batas awal array
data[j] > temp mengecek apakah nilai elemen yang sedang diperiksa (data[j]) lebih besar daripada nilai yang sedang ingin kita sisipkan

### 4. Tujuan dari perintah data[j+1] = data[j]; pada Insertion Sort
Untuk menggeser elemen array satu posisi ke kanan

# 5.3 Praktikum 2- (Sorting Menggunakan Array of Object) 
## Code Program
<img width="859" height="704" alt="image" src="https://github.com/user-attachments/assets/e57ce5b6-ed80-4cc0-8cff-b127e9825fa7" />
<img width="671" height="857" alt="image" src="https://github.com/user-attachments/assets/a34e1610-1267-4a3d-aba4-4b552a5d5c18" />
<img width="1035" height="684" alt="image" src="https://github.com/user-attachments/assets/a8fdb038-fc52-432e-aaa5-cce774eec6e4" />

## Hasil Running
<img width="426" height="939" alt="image" src="https://github.com/user-attachments/assets/9c0e0cda-4aaa-4195-ae25-1a3f9dc38c5f" />

## 5.3.4 Pertanyaan
### 1. Analisis Perulangan Bubble Sort 
a. Karena jika N-1 elemen sudah dipindah ke tempat yang benar, 1 elemen terakhir otomatis sudah pasti benar posisinya
b. Agar program tidak mengecek ulang elemen di sebelah kanan yang sudah terurut pada tahap sebelumnya (lebih efisien)
c. Perulangan i berjalan 49 kali, sehingga menempuh 49 Tahap pengurutan
### 2. Code Program
<img width="592" height="136" alt="image" src="https://github.com/user-attachments/assets/1ac46e73-94f2-4dcf-bba8-4d57b8d30d4d" />
<img width="658" height="751" alt="image" src="https://github.com/user-attachments/assets/9714e40e-e92b-4ba2-8e5b-6e9fb131186c" />


### Hasil Running
<img width="328" height="471" alt="image" src="https://github.com/user-attachments/assets/9dd7ea94-69c1-4cdb-a345-f0b31eae9ccb" />

## Latihan praktikum
## Code Program
<img width="1181" height="607" alt="image" src="https://github.com/user-attachments/assets/47d243a9-05b3-4e93-9e5b-35b40687a56a" />
<img width="649" height="927" alt="image" src="https://github.com/user-attachments/assets/a20fe18f-713d-4bec-9d85-09c18b289713" />
<img width="762" height="654" alt="image" src="https://github.com/user-attachments/assets/70db1d4d-e426-4498-8152-cab4592838ee" />

## Hasil Running
<img width="271" height="804" alt="image" src="https://github.com/user-attachments/assets/157bc1aa-c553-4304-bc68-3ab13ce7536e" />
<img width="277" height="394" alt="image" src="https://github.com/user-attachments/assets/5ae77e16-a210-456f-a106-e4ea65ab347f" />

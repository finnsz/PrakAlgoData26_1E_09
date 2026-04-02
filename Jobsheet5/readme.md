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


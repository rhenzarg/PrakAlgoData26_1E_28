# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 1
- Kode Program
  
<img width="726" height="624" alt="image" src="https://github.com/user-attachments/assets/e8bbe9d3-6a13-4acb-957b-fb17a02c6eca" />

- Output Program

<img width="301" height="54" alt="image" src="https://github.com/user-attachments/assets/fedbe721-27ba-4cb1-a42e-c32b00e5084d" />

## Pertanyaan

1. Pada method faktorialDC(), bagian if digunakan sebagai base case atau kondisi dasar untuk menghentikan proses rekursi. Jika nilai n == 1, maka method akan langsung mengembalikan nilai 1 karena faktorial dari 1 adalah 1.

    Sedangkan bagian else digunakan untuk melakukan proses rekursif, yaitu memanggil kembali method faktorialDC() dengan parameter n-1 sampai mencapai kondisi dasar. Dengan cara ini, perhitungan faktorial dilakukan secara bertahap hingga nilai terkecil.

2. Ya, perulangan pada method faktorialBF() dapat diganti menggunakan while atau do-while karena ketiganya merupakan struktur perulangan dalam Java.

3. Perintah fakto *= i; digunakan pada metode Brute Force yang menggunakan perulangan untuk mengalikan nilai faktorial secara bertahap dari 1 sampai n.

    Sedangkan int fakto = n * faktorialDC(n-1); digunakan pada metode Divide and Conquer yang menggunakan rekursi, yaitu method memanggil dirinya sendiri dengan parameter yang lebih kecil sampai mencapai kondisi dasar.

4. faktorialBF() menggunakan perulangan (iterasi) untuk menghitung faktorial, sedangkan faktorialDC() menggunakan rekursi dengan memanggil method yang sama hingga mencapai kondisi dasar.

## Percobaan 2

- Kode Program

<img width="505" height="540" alt="image" src="https://github.com/user-attachments/assets/97a75aa5-cb05-4851-9444-77a55090cfa7" />

<img width="669" height="550" alt="image" src="https://github.com/user-attachments/assets/17bc0e69-09a5-4be4-bde4-32142435f6b0" />

- Output Program

<img width="281" height="228" alt="image" src="https://github.com/user-attachments/assets/625336c2-c15a-4a00-912b-91f5c8a7fd12" />

## Pertanyaan

1. Method pangkatBF() menggunakan metode Brute Force, yaitu menghitung perpangkatan dengan melakukan perkalian berulang menggunakan perulangan sebanyak nilai pangkat. Sedangkan method pangkatDC() menggunakan metode Divide and Conquer dengan teknik rekursi, yaitu membagi masalah menjadi bagian yang lebih kecil (n/2) lalu menggabungkan hasilnya kembali. Metode pangkatDC() lebih efisien dibanding pangkatBF().
2. Ya, tahap combine sudah terdapat pada method pangkatDC(), yaitu pada bagian yang menggabungkan hasil rekursi:
  return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
  dan
  return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);
  Bagian tersebut menggabungkan hasil sub masalah menjadi hasil akhir.
3. masih relevan karena method menjadi lebih fleksibel. Namun method tersebut juga bisa dibuat tanpa parameter karena nilai sudah ada pada atribut nilai dan pangkat.
4. Method pangkatBF() bekerja dengan melakukan perkalian berulang dari nilai basis sebanyak nilai pangkat menggunakan perulangan.
  Sedangkan pangkatDC() bekerja dengan metode rekursi yang membagi nilai pangkat menjadi dua bagian (n/2) kemudian menggabungkan hasilnya untuk mendapatkan hasil perpangkatan.

## Percobaan 3

- Kode Program

<img width="567" height="584" alt="image" src="https://github.com/user-attachments/assets/b31420e1-50fc-4819-81db-0b8e3b850581" />

<img width="1061" height="476" alt="image" src="https://github.com/user-attachments/assets/58cfa10c-e802-40be-88a6-f19a8b9df893" />

- Output Program

<img width="462" height="146" alt="image" src="https://github.com/user-attachments/assets/78481cd1-fa67-4066-a43c-ad710d616569" />

## Pertanyaan

1. Variabel mid digunakan untuk membagi array menjadi dua bagian (kiri dan kanan) agar proses penjumlahan dapat dilakukan dengan metode Divide and Conquer.
2. Statement tersebut digunakan untuk menghitung jumlah elemen pada bagian kiri dan kanan array secara rekursif.
3. Penjumlahan tersebut digunakan untuk menggabungkan hasil penjumlahan bagian kiri dan kanan sehingga diperoleh total keseluruhan.
4. Base case terjadi ketika l == r, yang berarti hanya ada satu elemen sehingga langsung mengembalikan nilai elemen tersebut.
5. Method totalDC() bekerja dengan membagi array menjadi dua bagian, menghitung jumlah masing-masing bagian secara rekursif, lalu menggabungkan hasilnya untuk mendapatkan total keseluruhan.

## Tugas

- Kode Program

<img width="516" height="749" alt="image" src="https://github.com/user-attachments/assets/89217558-7403-4d82-b872-19c1a7934780" />

- Output Program

<img width="459" height="67" alt="image" src="https://github.com/user-attachments/assets/d21d083c-f3a9-4e7b-9a7e-639ef1d2054a" />

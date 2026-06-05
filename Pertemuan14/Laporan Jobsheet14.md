<img width="752" height="89" alt="image" src="https://github.com/user-attachments/assets/5410c332-76fc-4966-9b00-04c90ccee3aa" /># Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Praktikum 1
- Kode
<img width="820" height="343" alt="image" src="https://github.com/user-attachments/assets/9514361d-5f3d-45ba-a01c-7fd4bcfedc27" />
<img width="821" height="206" alt="image" src="https://github.com/user-attachments/assets/bdda37dd-4e79-420f-9b23-ee917310b5ff" />
<img width="819" height="417" alt="image" src="https://github.com/user-attachments/assets/8cd92432-2ad7-4f4d-ae2f-4f63f07f2b3c" />
<img width="861" height="391" alt="image" src="https://github.com/user-attachments/assets/7ffd4d06-a127-426e-a4d5-c5878d6e0f59" />
<img width="857" height="392" alt="image" src="https://github.com/user-attachments/assets/a82e4c63-c130-4c09-b18f-968bef1c7c72" />
<img width="856" height="363" alt="image" src="https://github.com/user-attachments/assets/b83e4dea-f31a-4616-b474-ff0087f57f29" />
<img width="861" height="362" alt="image" src="https://github.com/user-attachments/assets/ef0acef4-7e4e-4683-ab0a-5fb6c04f7320" />

- Output
<img width="835" height="373" alt="image" src="https://github.com/user-attachments/assets/44bd550b-11b1-42aa-a30e-b8c0f5ee5f66" />

## Pertanyaan
1. Karena pada Binary Search Tree (BST), data disusun secara terurut. Nilai yang lebih kecil dari parent berada di sebelah kiri, sedangkan nilai yang lebih besar berada di sebelah kanan.
Saat mencari data, program cukup memilih cabang kiri atau kanan sesuai nilai yang dicari sehingga tidak perlu memeriksa seluruh node.
Hal ini membuat proses pencarian lebih cepat dibandingkan Binary Tree biasa yang tidak memiliki aturan pengurutan data.

2. Atribut left digunakan untuk menyimpan referensi atau alamat node anak kiri, sedangkan atribut right digunakan untuk menyimpan referensi atau alamat node anak kanan. Kedua atribut tersebut berfungsi untuk menghubungkan node-node dalam struktur Binary Tree sehingga membentuk hubungan parent dan child.

3.  a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
Atribut root berfungsi sebagai penunjuk ke node akar (root node) dari Binary Tree. Semua operasi pada tree seperti penambahan, pencarian, traversal, dan penghapusan data selalu dimulai dari root.
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
Ketika objek BinaryTree pertama kali dibuat, nilai root adalah null karena tree masih kosong dan belum memiliki node.

4. Saat tree masih kosong (root == null), node baru yang ditambahkan akan langsung dijadikan sebagai root. Dengan kata lain, node tersebut menjadi node pertama sekaligus akar dari Binary Tree.

5. Baris program tersebut digunakan untuk menentukan posisi node baru yang akan dimasukkan ke dalam BST. Jika IPK mahasiswa yang akan ditambahkan lebih kecil daripada IPK node saat ini (current), maka pencarian posisi dilanjutkan ke subtree kiri. Sebaliknya, jika lebih besar atau sama, maka pencarian posisi dilanjutkan ke subtree kanan. Dengan cara ini, aturan BST tetap terjaga yaitu data yang lebih kecil berada di kiri dan data yang lebih besar berada di kanan.

6. Saat node memiliki dua anak:

Cari successor (nilai terkecil di subtree kanan).
Ganti node yang dihapus dengan successor.
Hubungkan kembali child kiri dan kanan.

getSuccessor() digunakan untuk mencari node pengganti tersebut agar struktur BST tetap benar.

## Praktikum 2
- kode
<img width="824" height="333" alt="image" src="https://github.com/user-attachments/assets/2829b3a1-a782-48b6-a52a-f458e7c49d0e" />
<img width="814" height="296" alt="image" src="https://github.com/user-attachments/assets/771bf794-894b-4188-8751-17c4ddd58da6" />

- Output
<img width="752" height="89" alt="image" src="https://github.com/user-attachments/assets/05ee018c-3d75-4804-99f9-be0392bdbd02" />

## Pertanyaan
1. data digunakan untuk menyimpan node-node Binary Tree dalam array.
idxLast digunakan untuk menyimpan indeks terakhir yang berisi data.

2. Method populateData() digunakan untuk mengisi data ke dalam array Binary Tree.

3. Method traverseInOrder() digunakan untuk menampilkan data tree dengan urutan Left → Root → Right.

4. Jika node berada pada indeks 2:
Left child = (2 × 2) + 1 = 5
Right child = (2 × 2) + 2 = 6

5. int idxLast = 6 menunjukkan bahwa data terakhir yang terisi berada pada indeks ke-6.

6. Karena pada representasi Binary Tree menggunakan array:
Anak kiri berada pada indeks 2 * idxStart + 1
Anak kanan berada pada indeks 2 * idxStart + 2
Rumus tersebut digunakan agar program dapat menemukan posisi child secara otomatis saat traversal rekursif.

## Tugas
1. 
<img width="631" height="200" alt="image" src="https://github.com/user-attachments/assets/91b34505-8710-4e51-9f39-9f580ea081ec" />

2. 
<img width="677" height="296" alt="image" src="https://github.com/user-attachments/assets/9f6b4447-fd23-4788-a2d9-803b7036047c" />

3.
<img width="674" height="175" alt="image" src="https://github.com/user-attachments/assets/27ab5372-9621-4afc-bca6-d21a9a628ed9" />

Output tugas 1-3
<img width="788" height="400" alt="image" src="https://github.com/user-attachments/assets/7c8b5f74-d196-4d55-94df-8f77ce63178b" />


4. 
<img width="769" height="391" alt="image" src="https://github.com/user-attachments/assets/ef1561c6-8dfa-4e5d-bf78-726dad3b2863" />
<img width="721" height="252" alt="image" src="https://github.com/user-attachments/assets/5b328a63-81e0-4cc1-94b2-329f27061a12" />

Output
<img width="706" height="193" alt="image" src="https://github.com/user-attachments/assets/b4e0c439-928f-4278-8a73-d7742a8373b1" />

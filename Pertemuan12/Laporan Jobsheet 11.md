# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Paktikum 1
- Kode Program
<img width="896" height="601" alt="image" src="https://github.com/user-attachments/assets/ff4e95fb-3540-4e54-938d-311e0325fc85" />
<img width="600" height="310" alt="image" src="https://github.com/user-attachments/assets/2fec4697-e14e-4eb3-b010-dc76797037e5" />
<img width="450" height="776" alt="image" src="https://github.com/user-attachments/assets/65242713-e670-4a48-b0a2-23170a5f78f8" />
<img width="442" height="588" alt="image" src="https://github.com/user-attachments/assets/bab0b777-7e6f-4abf-a5b8-ac3e81aace8c" />

- Output
<img width="622" height="307" alt="image" src="https://github.com/user-attachments/assets/d943545b-125e-413a-87ea-4fa0dee4ad79" />

## Pertanyaan
1. Penyebab Output "Linked list kosong": Karena pada baris pertama program, method print() dipanggil sesaat setelah objek linked list dibuat, di mana pointer head masih bernilai null dan belum ada data yang dimasukkan.
2. Kegunaan Variabel temp: Sebagai pointer bantu untuk menelusuri (traversal) setiap node dalam list, guna mencari posisi atau indeks tertentu tanpa mengubah posisi pointer utama (head).
3. Modifikasi program
<img width="695" height="460" alt="image" src="https://github.com/user-attachments/assets/7066eb67-5547-472d-a56d-e71797e5602a" />

## Praktikum 2
- Kode Program
<img width="450" height="783" alt="image" src="https://github.com/user-attachments/assets/991323c0-96bc-42f4-9487-0458c6568e97" />
<img width="945" height="289" alt="image" src="https://github.com/user-attachments/assets/1c46a3b6-f1f9-403c-bcde-533cef438167" />

- Output
<img width="576" height="256" alt="image" src="https://github.com/user-attachments/assets/e0638890-355e-4781-83f0-8ef232d6ba0b" />

## Pertanyaan
1. Kegunaan keyword break: Untuk menghentikan proses pencarian dan iterasi segera setelah data yang ingin dihapus ditemukan dan berhasil dikeluarkan dari list.
2. temp.next = temp.next.next: Digunakan untuk menghapus node target dengan cara menghubungkan node sebelumnya langsung ke node setelah target (melompati node target).
   if (temp.next == null) { tail = temp; }: Jika setelah penghapusan ternyata node yang dihapus adalah node terakhir, maka pointer tail harus diperbarui ke posisi temp (node yang sekarang menjadi paling akhir).

## Tugas
- Kode Program
<img width="589" height="318" alt="image" src="https://github.com/user-attachments/assets/c6ed7bbf-fa23-4fe2-a10a-433a28f4838b" />
<img width="478" height="253" alt="image" src="https://github.com/user-attachments/assets/61e01570-6480-4d7e-9a41-462826fc292e" />
<img width="500" height="799" alt="image" src="https://github.com/user-attachments/assets/2ae5ad29-2ef8-45be-b0d6-00054fadbdea" />
<img width="549" height="809" alt="image" src="https://github.com/user-attachments/assets/cff9c6ac-7428-4727-8cc6-dc52f1bf03dd" />

- Output
<img width="269" height="920" alt="image" src="https://github.com/user-attachments/assets/49dcea49-9db1-4d67-a5cd-5f6b4ae5d350" />

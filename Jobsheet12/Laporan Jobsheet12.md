# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Praktikum 1
- Kode Program
<img width="425" height="317" alt="image" src="https://github.com/user-attachments/assets/4b438550-1f7b-4c97-a5ca-4fe14bcdffcb" />
<img width="308" height="185" alt="image" src="https://github.com/user-attachments/assets/fcad5a2e-2566-4873-af78-d95897a9540e" />
<img width="325" height="387" alt="image" src="https://github.com/user-attachments/assets/1ecd3905-1c3b-4c21-8156-42db126dd66d" />
<img width="296" height="242" alt="image" src="https://github.com/user-attachments/assets/a8e1efb1-fb1c-4740-b7ba-1fae399aa406" />
<img width="245" height="412" alt="image" src="https://github.com/user-attachments/assets/09707bda-fd78-4f35-8547-4a97b65ba268" />

- Output
<img width="244" height="437" alt="image" src="https://github.com/user-attachments/assets/c9f39283-b0c0-4d8d-b619-dc5bc4c0ce2e" />

## Pertanyaan
1. SLL hanya memiliki 1 pointer (next), traversal hanya bisa satu arah (head → tail). DLL memiliki 2 pointer (next dan prev), sehingga traversal bisa dua arah (head ↔ tail).
2. next menunjuk node berikutnya, digunakan untuk traversal maju
prev menunjuk node sebelumnya, digunakan untuk traversal mundur dan mempermudah operasi hapus tanpa iterasi ulang dari head
3. Menginisialisasi head = null dan tail = null sebagai tanda bahwa list dalam kondisi kosong saat pertama kali dibuat.
4. Karena saat hanya ada 1 node, node itu sekaligus menjadi node pertama sekaligus terakhir. Jika salah satu tidak diset, operasi seperti addLast() atau removeLast() akan menyebabkan NullPointerException.
5. <img width="357" height="175" alt="image" src="https://github.com/user-attachments/assets/b96c6068-6903-496d-891e-61b61905652b" />
6. <img width="352" height="163" alt="image" src="https://github.com/user-attachments/assets/e027408d-2474-4cf2-a49a-5b0a7e08d3d7" />

## Praktikum 2
- Kode Program
<img width="271" height="272" alt="image" src="https://github.com/user-attachments/assets/a04d8910-1ced-4f83-9761-5691702d5429" />

- Output
<img width="356" height="452" alt="image" src="https://github.com/user-attachments/assets/2452d6d9-00a7-4697-8c70-69d27ff81c34" />

## Pertanyaan
1. head = head.next;
Memindahkan head ke node berikutnya, sehingga node pertama (lama) tidak lagi direferensikan oleh list dan dianggap terhapus.
head.prev = null;
Memutus pointer prev dari head baru agar tidak lagi menunjuk ke node lama yang sudah dihapus, menjaga node head baru sebagai benar-benar awal list.
2. <img width="226" height="316" alt="image" src="https://github.com/user-attachments/assets/d0e6fae7-cc65-42e7-9e05-511e373563d9" />

## Tugas
- Kode Program
<img width="592" height="407" alt="image" src="https://github.com/user-attachments/assets/4f8bd15f-c1d7-4991-aea0-6f5c9665ba9c" />
<img width="467" height="393" alt="image" src="https://github.com/user-attachments/assets/988cb3c0-d843-4e95-820c-1a19881bc9c5" />
<img width="439" height="401" alt="image" src="https://github.com/user-attachments/assets/99b1fb83-ab54-4ac9-b42a-222491009e3a" />
<img width="352" height="394" alt="image" src="https://github.com/user-attachments/assets/144ebf23-403f-4b01-8bf9-c604eb3cc597" />
<img width="362" height="212" alt="image" src="https://github.com/user-attachments/assets/5247c4d6-ba7f-45d3-a72f-6cfa48315ba1" />

<img width="383" height="405" alt="image" src="https://github.com/user-attachments/assets/a41a60d7-457c-4d21-a775-d06c18fa9f1d" />
<img width="391" height="393" alt="image" src="https://github.com/user-attachments/assets/63c5447d-5109-4b56-9d2d-85123ae4f538" />

- Output
<img width="263" height="314" alt="image" src="https://github.com/user-attachments/assets/828016a9-a7c1-4ecd-97f6-45457ecfe9c8" />
<img width="328" height="301" alt="image" src="https://github.com/user-attachments/assets/40cbc40b-c6ed-463e-85cc-12c13698bae0" />
<img width="306" height="256" alt="image" src="https://github.com/user-attachments/assets/bd426e7c-79e3-4301-a127-e4660ca7f6dc" />

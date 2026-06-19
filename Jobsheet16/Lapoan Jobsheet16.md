# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Praktikum 1
- Kode Program
<img width="778" height="400" alt="image" src="https://github.com/user-attachments/assets/cdaaafb8-b874-498f-84ce-7f4a6dbdbcf6" />

- Output Kode
<img width="529" height="55" alt="image" src="https://github.com/user-attachments/assets/6d52ef13-898a-4909-bca0-2920f9b28a83" />

## Pertanyaan
1. Semua jenis data dapat ditampung dalam ArrayList karena ArrayList dibuat tanpa generic (List l = new ArrayList();), sehingga tipe datanya dianggap sebagai Object. Karena semua class di Java merupakan turunan dari Object, berbagai jenis data dapat disimpan dalam satu ArrayList.
2. Agar ArrayList hanya menampung satu jenis data, gunakan generic, misalnya List<String> atau List<Integer>. Dengan generic, Java akan membatasi data yang dapat disimpan sehingga hanya tipe tertentu yang diperbolehkan.
3. Perubahan dari List<String> menjadi LinkedList<String> membuat objek names dapat langsung menggunakan method khusus milik LinkedList seperti push(), getFirst(), dan getLast(), selain method yang dimiliki interface List.
4. Penambahan names.push("Mei-mei") akan memasukkan data "Mei-mei" ke posisi paling depan LinkedList, sehingga elemen pertama berubah menjadi "Mei-mei" dan jumlah elemen bertambah satu.
5. Setelah program dijalankan, terlihat bahwa method push() menambahkan elemen di awal LinkedList, sedangkan getFirst() dan getLast() digunakan untuk mengambil elemen pertama dan terakhir. Hal ini menunjukkan bahwa LinkedList memiliki fitur tambahan yang memudahkan manipulasi data di bagian awal maupun akhir list.

## Praktikum 2
- kode program
<img width="788" height="417" alt="image" src="https://github.com/user-attachments/assets/19bd90ec-bf0d-495e-8479-92b014f7ee9d" />

- Output Program
<img width="578" height="65" alt="image" src="https://github.com/user-attachments/assets/4df47a85-a5f0-49fd-a085-ca3f40def188" />

## Pertanyaan
1. Method push() digunakan untuk menambahkan elemen pada bagian atas Stack (LIFO), sedangkan add() digunakan untuk menambahkan elemen ke akhir collection. Pada Stack, keduanya dapat menambah data, tetapi push() lebih menunjukkan konsep Stack secara khusus.
2. Jika baris 43 dan 44 dihapus, maka elemen pada Stack tidak akan habis dikeluarkan menggunakan pop(). Akibatnya, data masih tersimpan di dalam Stack sehingga dapat ditampilkan kembali pada proses berikutnya.
3. Baris 46–49 berfungsi untuk menampilkan seluruh elemen Stack menggunakan Iterator. Iterator digunakan untuk menelusuri setiap elemen satu per satu tanpa menggunakan indeks.
4. Jika Stack<String> diganti menjadi List<String>, program akan error pada method seperti push(), pop(), dan empty() karena method tersebut hanya dimiliki oleh class Stack dan tidak terdapat pada interface List
5. <img width="231" height="13" alt="image" src="https://github.com/user-attachments/assets/67990288-3a19-484f-bd40-1c8aa7896cf9" />
6. <img width="536" height="56" alt="image" src="https://github.com/user-attachments/assets/a00c7365-002d-450b-82ad-07b85deb9929" />


## Praktikum 3
- Kode Program
<img width="710" height="313" alt="image" src="https://github.com/user-attachments/assets/1290d863-d7ad-4a18-aa67-719d3ae00dfb" />
<img width="794" height="412" alt="image" src="https://github.com/user-attachments/assets/5b9f7a99-1a7a-41ab-9861-4d3b59d1732e" />

- Output Program
<img width="303" height="78" alt="image" src="https://github.com/user-attachments/assets/33e4804c-8c91-4b19-b15d-c1cbaeef3ccb" />

## Pertanyaan
1. Fungsi tambah() menggunakan konsep Varargs (Variable Arguments) yang ditandai dengan penulisan Mahasiswa28... mahasiswa. Kelebihannya adalah method dapat menerima jumlah objek yang berbeda-beda dalam satu pemanggilan tanpa harus membuat method overload, sehingga kode menjadi lebih ringkas dan fleksibel.
2. Method linearSearch() dapat diganti dengan Collections.binarySearch(), tetapi data harus diurutkan terlebih dahulu berdasarkan NIM. Binary Search lebih cepat dibandingkan Linear Search karena tidak memeriksa data satu per satu, melainkan membagi ruang pencarian menjadi dua bagian secara berulang.
3. <img width="601" height="98" alt="image" src="https://github.com/user-attachments/assets/a9c39e72-58e2-4b97-af10-6cfb0129da08" />


## Tugas 
- Kode Program
<img width="607" height="178" alt="image" src="https://github.com/user-attachments/assets/42bd13f7-f992-4b7e-a2e1-f908d18b757f" />
<img width="731" height="182" alt="image" src="https://github.com/user-attachments/assets/59e8d223-b346-451d-9447-2918815bbdb9" />
<img width="581" height="178" alt="image" src="https://github.com/user-attachments/assets/3c1b6593-de53-48c6-827c-9c770465dcfc" />
<img width="818" height="412" alt="image" src="https://github.com/user-attachments/assets/27d2b2a8-4727-458a-a77e-610db590037d" />
<img width="814" height="409" alt="image" src="https://github.com/user-attachments/assets/d6af6284-c246-4789-9c79-e944cc2e7891" />
<img width="811" height="407" alt="image" src="https://github.com/user-attachments/assets/001943e4-def4-4612-9506-645517f3ce1c" />
<img width="802" height="329" alt="image" src="https://github.com/user-attachments/assets/6d408128-ad3d-4feb-a6c3-3c304ef13a84" />

- Output Program
<img width="668" height="362" alt="image" src="https://github.com/user-attachments/assets/476455bb-a485-435a-bc49-7603e81220c1" />
<img width="352" height="122" alt="image" src="https://github.com/user-attachments/assets/9ced5d2f-7a15-4864-be04-e4572d267e55" />
<img width="471" height="121" alt="image" src="https://github.com/user-attachments/assets/888dc296-7ba2-4fec-8721-1c2ffdbe1cbd" />

- Tambahkan prosedur hapus data mahasiswa 
<img width="627" height="325" alt="image" src="https://github.com/user-attachments/assets/8e77442c-4e21-45e6-a4be-18bcfe1e75d6" />




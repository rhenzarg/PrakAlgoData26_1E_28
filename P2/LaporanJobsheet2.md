# Laporan Praktikum Algoritma dan Struktur Data

<h4>Nama : Rhenza Rendragraha<h4>
<h4>NIM : 254107020049<h4>
<h4>Kelas : TI-1E<h4>

## Percobaan 1: Deklarasi Class, Atribut dan Method
<img width="1137" height="826" alt="image" src="https://github.com/user-attachments/assets/98055a74-bec6-4bc7-b3d6-d614f325f43f" />

## Pertanyaan

1. Sebutkan dua karakteristik class atau object!
  - Dua karakteristik utamanya adalah
     - Atribut = data atau ciri yang dimiliki oleh sebuah class atau object
     - Method = aksi atau kemampuan yang dapat dilakukan oleh object

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class
Mahasiswa? Sebutkan apa saja atributnya!
  - Ada 4 atribut yaitu String nama28, String nim28, String kelas28, double ipk28.

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
  - Ada 4 method yaitu
    - void tampilkanInformasi()
    - void ubahKelas(String kelasBaru28)
    - void updateIpk(double ipkBaru28)
    - String nilaiKinerja()

4. Perhatikan method updateIpk() yang terdapat di dalam class Mahasiswa. Modifikasi isi method
tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah
IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak
pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

   <img width="887" height="202" alt="image" src="https://github.com/user-attachments/assets/38f47cfb-095f-4677-9f14-7816fcc245ad" />

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa,
kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang
dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?

  - Method ini membaca nilai ipk28 milik mahasiswa, nilai IPK tersebut dicek mengginakan if-else if-else, method nilaiKinerja() menhgembalikan sebuah nilai
    bertipe String.

## Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
- Kode Program
  <img width="700" height="509" alt="image" src="https://github.com/user-attachments/assets/fca130b6-c37a-4290-81e3-fbad8ec623ea" />
- Output Program
  <img width="322" height="202" alt="image" src="https://github.com/user-attachments/assets/53eb05a7-ad31-458f-b32f-9f6804d34422" />

## Pertanyaan
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses
instansiasi! Apa nama object yang dihasilkan?

  - Proses instansiasi terjadi pada baris kode
    - Mahasiswa28 mhsl = new Mahasiswa28();
    - nama objek yang yang dihasilkan adlah mhsl

2. Bagaimana cara mengakses atribut dan method dari suatu objek?
   - dengan menggunakan operator titik(.)
   - Atribut diakses dengan objek.atribut
   - Method diakses dengan objek.method()

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?
   - Karena nilai atribut pada object mhsl telah mengalami perubahan sebelum pemanggilan kedua

## Percobaan 3: Membuat Konstruktor
- Modifikasi program
  <img width="932" height="330" alt="image" src="https://github.com/user-attachments/assets/34eb3c78-1494-4595-910c-5ba956600624" />
- Modifikasi program main
  <img width="1115" height="137" alt="image" src="https://github.com/user-attachments/assets/45614e0b-8b8b-4eff-b48f-68de7f3f23ae" />
- Output Program
  <img width="338" height="309" alt="image" src="https://github.com/user-attachments/assets/ce1342b8-173f-4b57-ba86-beab8d29ae20" />

## Pertanyaan
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
-   public Mahasiswa28(String nm28, String nim28, double ipk28, String kls28) {

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?
- Baris kode tersebut membuat object mhs2 dari class Mahasiswa dan langsung menginisialisasi nilai atributnya melalui konstruktor berparameter
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
- Akan terjadi eror karena pemanggilan konstruktor tidak sesuai dengan konstruktor yang di class, sehingga program gagal di compile

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
- Tidak, setiap method didalam class adalah fungsi yang berdiri sendiri, method dapat dipanggil kapa saja selama object sudah diinstansiasi

5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!
- Kode Program
  <img width="1112" height="127" alt="image" src="https://github.com/user-attachments/assets/c9d1bad9-4e47-4124-b18b-b0a483b4a785" />

## Tugas 1
- Berikut kode class

  <img width="895" height="734" alt="image" src="https://github.com/user-attachments/assets/78edbad1-f74d-4835-8854-966de4d314e3" />

- Berikut Kode Main

  <img width="1353" height="474" alt="image" src="https://github.com/user-attachments/assets/b1544f51-3549-48ca-97c2-ae1dd52589e4" />

- Berikut Output Program

  <img width="412" height="264" alt="image" src="https://github.com/user-attachments/assets/33c24aa1-3c09-4c32-987f-a5e20b377961" />

## Tugas 2
- Berikut Kode Class

 <img width="798" height="679" alt="image" src="https://github.com/user-attachments/assets/79aedefd-0600-4f7e-b42d-350b230b8d58" />

- Berikut Kode Main

  <img width="1070" height="349" alt="image" src="https://github.com/user-attachments/assets/8d6f9b4a-1245-4b4b-b059-d7acbd403647" />

- Berikut Output Program

  <img width="285" height="214" alt="image" src="https://github.com/user-attachments/assets/bb8027cc-f873-45a2-90fa-77304d4426fd" />

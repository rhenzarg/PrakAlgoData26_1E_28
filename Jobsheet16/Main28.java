package Jobsheet16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main28 {

    static ArrayList<Mhs28> daftarMhs = new ArrayList<>();
    static ArrayList<MataKuliah28> daftarMK = new ArrayList<>();
    static ArrayList<Nilai28> daftarNilai = new ArrayList<>();

    static Queue<Mhs28> antreanHapus = new LinkedList<>();

    static void isiDataMahasiswa() {
        daftarMhs.add(new Mhs28("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mhs28("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mhs28("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mhs28("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mhs28("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mhs28("20006", "Ubaidah", "021xxx"));
    }

    static void isiDataMK() {
        daftarMK.add(new MataKuliah28("0001", "Internet Of Things", 3));
        daftarMK.add(new MataKuliah28("0002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah28("0003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah28("0004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah28("0005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    static Mhs28 cariMahasiswa(String nim) {
        for (Mhs28 m : daftarMhs) {
            if (m.nim.equals(nim)) {
                return m;
            }
        }
        return null;
    }

    static MataKuliah28 cariMK(String kodeMK) {
        for (MataKuliah28 mk : daftarMK) {
            if (mk.kodeMK.equals(kodeMK)) {
                return mk;
            }
        }
        return null;
    }

    static void inputNilai(Scanner sc) {

        System.out.println("\nMasukkan Data");

        System.out.print("Kode     : ");
        String kodeMK = sc.nextLine();

        System.out.print("Nilai    : ");
        double nilai = sc.nextDouble();
        sc.nextLine();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*******************************************************");
        System.out.printf("%-10s %-20s %-15s\n", "NIM", "Nama", "No Telp");

        for (Mhs28 m : daftarMhs) {
            System.out.printf("%-10s %-20s %-15s\n",
                    m.nim, m.nama, m.notelp);
        }

        System.out.print("\nPilih mahasiswa by NIM : ");
        String nim = sc.nextLine();

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*******************************************************");
        System.out.printf("%-10s %-40s %-5s\n",
                "Kode", "Mata Kuliah", "SKS");

        for (MataKuliah28 mk : daftarMK) {
            System.out.printf("%-10s %-40s %-5d\n",
                    mk.kodeMK, mk.namaMK, mk.sks);
        }

        System.out.print("\nPilih MK by kode : ");
        String kodePilihan = sc.nextLine();

        Mhs28 mhs = cariMahasiswa(nim);
        MataKuliah28 mk = cariMK(kodePilihan);

        if (mhs != null && mk != null) {
            daftarNilai.add(new Nilai28(mhs, mk, nilai));
            System.out.println("\nData nilai berhasil ditambahkan!");
        } else {
            System.out.println("\nData tidak ditemukan!");
        }
    }

    static void tampilNilai() {

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("==========================================================================");

        System.out.printf("%-8s %-15s %-35s %-5s %-8s\n",
                "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (Nilai28 n : daftarNilai) {
            System.out.printf("%-8s %-15s %-35s %-5d %-8.2f\n",
                    n.mahasiswa.nim,
                    n.mahasiswa.nama,
                    n.mataKuliah.namaMK,
                    n.mataKuliah.sks,
                    n.nilai);
        }
    }

    static void cariNilaiMahasiswa(Scanner sc) {

        System.out.print("Masukkan NIM Mahasiswa : ");
        String nim = sc.nextLine();

        int totalSKS = 0;
        boolean ditemukan = false;

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("==========================================================================");

        System.out.printf("%-8s %-15s %-35s %-5s %-8s\n",
                "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");

        for (Nilai28 n : daftarNilai) {

            if (n.mahasiswa.nim.equals(nim)) {

                ditemukan = true;

                System.out.printf("%-8s %-15s %-35s %-5d %-8.2f\n",
                        n.mahasiswa.nim,
                        n.mahasiswa.nama,
                        n.mataKuliah.namaMK,
                        n.mataKuliah.sks,
                        n.nilai);

                totalSKS += n.mataKuliah.sks;
            }
        }

        if (ditemukan) {
            System.out.println("\nTotal SKS : " + totalSKS + " telah diambil");
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }

    static void urutNilai() {

        Collections.sort(
                daftarNilai,
                Comparator.comparingDouble(n -> n.nilai));

        Collections.reverse(daftarNilai);

        System.out.println("\nData berhasil diurutkan.");
        tampilNilai();
    }

    static void hapusMahasiswa(Scanner sc) {

    System.out.println("\nDAFTAR MAHASISWA");
    System.out.println("===================================");

    for (Mhs28 m : daftarMhs) {
        System.out.println(m.nim + " - " + m.nama);
    }

    System.out.print("\nMasukkan NIM mahasiswa yang akan dihapus : ");
    String nim = sc.nextLine();

    Mhs28 mhsHapus = cariMahasiswa(nim);

    if (mhsHapus == null) {
        System.out.println("Mahasiswa tidak ditemukan!");
        return;
    }

    antreanHapus.offer(mhsHapus);

    System.out.println("Mahasiswa masuk antrean penghapusan.");

    Mhs28 proses = antreanHapus.poll();

    daftarMhs.remove(proses);

    daftarNilai.removeIf(
            n -> n.mahasiswa.nim.equals(proses.nim)
    );

    System.out.println("Data mahasiswa berhasil dihapus.");
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        isiDataMahasiswa();
        isiDataMK();

        int pilih;

        do {

            System.out.println("\n==============================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("==============================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa (Queue)");
            System.out.println("5. Keluar");
            System.out.println("==============================================");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    inputNilai(sc);
                    break;

                case 2:
                    tampilNilai();
                    break;

                case 3:
                    cariNilaiMahasiswa(sc);
                    break;

                case 4:
                    urutNilai();
                    break;

                case 5:
                    hapusMahasiswa(sc);
                    break;

                case 6:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 6);

        sc.close();
    }
}
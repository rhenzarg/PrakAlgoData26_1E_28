package CM1;

import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        Mahasiswa28[] mhs = {
                new Mahasiswa28("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa28("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa28("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku28[] buku = {
                new Buku28("B001", "Algoritma", 2020),
                new Buku28("B002", "Basis Data", 2019),
                new Buku28("B003", "Pemrograman", 2021),
                new Buku28("B004", "Fisika", 2024)
        };

        Peminjaman28[] pinjam = {
                new Peminjaman28(mhs[0], buku[0], 7),
                new Peminjaman28(mhs[1], buku[1], 3),
                new Peminjaman28(mhs[2], buku[2], 10),
                new Peminjaman28(mhs[2], buku[3], 6),
                new Peminjaman28(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = rhenza.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nData Mahasiswa:");
                    for (int i = 0; i < mhs.length; i++) {
                        mhs[i].tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nData Buku:");
                    for (int i = 0; i < buku.length; i++) {
                        buku[i].tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampil();
                    }
                    break;

                case 4:
                    for (int i = 1; i < pinjam.length; i++) {
                        Peminjaman28 temp = pinjam[i];
                        int j = i;

                        while (j > 0 && pinjam[j - 1].denda < temp.denda) {
                            pinjam[j] = pinjam[j - 1];
                            j--;
                        }
                        pinjam[j] = temp;
                    }

                    System.out.println("\nData setelah diurutkan (denda terbesar):");
                    for (int i = 0; i < pinjam.length; i++) {
                        pinjam[i].tampil();
                    }
                    break;

                case 5:
                    rhenza.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String cari = rhenza.nextLine();

                    boolean ketemu = false;
                    for (int i = 0; i < pinjam.length; i++) {
                        if (pinjam[i].mhs.nim.equals(cari)) {
                            pinjam[i].tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Menu tidak valid!");
            }

        } while (pilih != 0);

        rhenza.close();
    }
}
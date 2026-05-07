package P1Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan28 antrian = new AntrianLayanan28(5);

        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN AKADEMIK ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Depan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa28 mhs = new Mahasiswa28(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa28 dilayani = antrian.layaniMahasiswa();

                    if (dilayani != null) {
                        System.out.println("Mahasiswa dipanggil:");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 0:
                    System.out.println("Terimakasih");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);
        sc.close();
    }
}
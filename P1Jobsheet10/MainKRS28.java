package P1Jobsheet10;

import java.util.Scanner;

public class MainKRS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS28 antrian = new AntrianKRS28();
        int pilihan;

        do {
            System.out.println("\n=== Antrian Persetujuan KRS ===");
            System.out.println("1.  Daftar Antrian KRS");
            System.out.println("2.  Panggil Antrian (2 mahasiswa)");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Antrian Terdepan");
            System.out.println("5.  Tampilkan Antrian Paling Akhir");
            System.out.println("6.  Jumlah Antrian Saat Ini");
            System.out.println("7.  Jumlah Sudah Proses KRS");
            System.out.println("8.  Jumlah Belum Proses KRS");
            System.out.println("9.  Kosongkan Antrian");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.sudahKRS >= antrian.maxDPA) {
                        System.out.println("Kuota DPA sudah penuh, tidak dapat mendaftar.");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mhs28 mhs = new Mhs28(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;

                case 5:
                    antrian.lihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian saat ini : " +
                                       antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah sudah proses KRS : " +
                                       antrian.getJumlahSudahKRS() +
                                       " mahasiswa");
                    break;

                case 8:
                    System.out.println("Jumlah belum proses KRS : " +
                                       antrian.getJumlahBelumKRS() +
                                       " mahasiswa");
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
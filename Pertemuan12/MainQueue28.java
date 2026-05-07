package Pertemuan12;

import java.util.Scanner;

public class MainQueue28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue28 antrian = new Queue28();
        int pilih;

        do {
            System.out.println("\n=== LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Cek Jumlah Antrian");
            System.out.println("5. Cek Antrian Kosong/Penuh");
            System.out.println("6. Kosongkan Semua Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: "); String nim = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    antrian.enqueue(new Mhs28(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peekFrontRear();
                    break;
                case 4:
                    antrian.printSize();
                    break;
                case 5:
                    System.out.println("Apakah antrian kosong? " + antrian.isEmpty());
                    System.out.println("Apakah antrian penuh? " + antrian.isFull());
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Pilihan salah!");
            }
        } while (pilih != 7);
        
        sc.close();
    }
}

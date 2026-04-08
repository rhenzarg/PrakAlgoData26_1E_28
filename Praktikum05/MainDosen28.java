package Praktikum05;

import java.util.Scanner;

public class MainDosen28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen28 list = new DataDosen28();

        int pilih;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen28");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Usia)");
            System.out.println("4. Sorting DSC (Usia)");
            System.out.println("5. Insertion Sort (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("Kode  : ");
                    String kd = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L / false=P): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia  : ");
                    int us = sc.nextInt();
                    sc.nextLine();

                    Dosen28 d = new Dosen28(kd, nm, jk, us);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC (termuda → tertua)");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DSC (tertua → termuda)");
                    list.tampil();
                    break;

                case 5:
                    list.insertionSort();
                    System.out.println("Data diurutkan dengan Insertion Sort");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan salah!");
            }

        } while (pilih != 0);

        sc.close();
    }
}

package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
       
        System.out.print("Masukan jumlah mahsiswa: ");
        int n = rhenza.nextInt();
        rhenza.nextLine();

        MahasiswaBerprestasi28 list = new MahasiswaBerprestasi28(n);

        for (int i = 0; i < n; i++) {
            System.out.println("Masukan jumlah mahasiswa ke-" + (i+1));

            System.out.print("NIM: ");
            String nim = rhenza.nextLine();

            System.out.print("Nama: ");
            String nama = rhenza.nextLine();

            System.out.print("Kelas: ");
            String kelas = rhenza.nextLine();

            System.out.print("IPK: ");
            double ipk = rhenza.nextDouble();
            rhenza.nextLine();

            Mahasiswa28 m = new Mahasiswa28(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\nData sebelum sorting: ");
        list.tampil();

        list.bubbleSort();

        System.out.println("\nData setelah sorting (DESC): ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.slectionSort();
        list.tampil();

        rhenza.close();
    }
}

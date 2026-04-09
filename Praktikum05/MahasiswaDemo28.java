package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        System.out.print("Masukan jumlah mahasiswa: ");
        int jumlahMhs = rhenza.nextInt();
        rhenza.nextLine();

        MahasiswaBerprestasi28 list = new MahasiswaBerprestasi28(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = rhenza.nextLine();
            System.out.print("Nama : ");
            String nama = rhenza.nextLine();
            System.out.print("Kelas : ");
            String kelas = rhenza.nextLine();
            System.out.print("IPK : ");
            String ip = rhenza.nextLine();

            double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------------------------");

            list.tambah(new Mahasiswa28(nim, nama, kelas, ipk));
        }

        list.tampil();

        System.out.println("--------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------");
        System.out.print("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = rhenza.nextDouble();

        System.out.println("--------------------------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("--------------------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMhs - 1);
        int pss2 = (int) posisi2;

        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
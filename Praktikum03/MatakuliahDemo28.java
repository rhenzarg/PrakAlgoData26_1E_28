package Praktikum03;

import java.util.Scanner;

public class MatakuliahDemo28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);

        Matakuliah28[] arrayMatakuliah28 = new Matakuliah28[3];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            arrayMatakuliah28[i] = new Matakuliah28();
            System.out.println("Masukan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = rhenza.nextLine();
            System.out.print("Nama        : ");
            nama = rhenza.nextLine();
            System.out.print("Sks         : ");
            dummy = rhenza.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = rhenza.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------");

            arrayMatakuliah28[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayMatakuliah28[i].cetakInfo();
            System.out.println("-------------------------------");
        }
        rhenza.close();
    }
}

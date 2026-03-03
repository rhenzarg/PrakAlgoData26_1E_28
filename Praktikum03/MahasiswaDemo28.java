package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
        Mahasiswa28[] arrayOfMahasiswa28 = new Mahasiswa28[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa28[i] = new Mahasiswa28();

            System.out.println("Masukan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   :");
            arrayOfMahasiswa28[i].nim = rhenza.nextLine();
            System.out.print("Nama  :");
            arrayOfMahasiswa28[i].nama = rhenza.nextLine();
            System.out.print("Kelas :");
            arrayOfMahasiswa28[i].kelas = rhenza.nextLine();
            System.out.print("IPK :");
            dummy = rhenza.nextLine();
            arrayOfMahasiswa28[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa28[i].cetakInfo();
        }
        rhenza.close();
        ;
    }
}
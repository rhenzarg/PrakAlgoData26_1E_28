package minggu5;

import java.util.Scanner;

public class MainPangkat28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = rhenza.nextInt();

        Pangkat28[] png = new Pangkat28[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai baris elemen ke-"+(i+1)+": ");
            int basis = rhenza.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = rhenza.nextInt();
            png[i] = new Pangkat28(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (Pangkat28 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (Pangkat28 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
        rhenza.close();
    }
}

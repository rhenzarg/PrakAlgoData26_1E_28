package minggu5;

import java.util.Scanner;

public class MainSum28 {
    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = rhenza.nextInt();

        Sum28 sm = new Sum28(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = rhenza.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
        
    }
}

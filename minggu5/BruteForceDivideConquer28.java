package minggu5;

import java.util.Scanner;

public class BruteForceDivideConquer28 {

    public static class Faktorial {
        int faktorialBF(int n) {
            int fakto = 1;
            for (int i = 1; i <= n; i++) {
                fakto = fakto * i;
            }
            return fakto;
        }

        int faktorialDC(int n) {
            if (n == 1) {
                return 1;
            } else {
                int fakto = n * faktorialDC(n - 1);
                return fakto;
            }
        }

    }

    public static void main(String[] args) {
        Scanner rhenza = new Scanner(System.in);
        System.out.print("Masukan niali: ");
        int nilai = rhenza.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}

package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain28 {

    public static Mahasiswa28 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa28(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList28 list = new DoubleLinkedList28();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik");
            System.out.println("8.  Tambah data pada indeks");
            System.out.println("9.  Hapus data setelah NIM");
            System.out.println("10. Hapus data pada indeks");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa28 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa28 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa28 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                case 8:
                    System.out.print("Masukkan indeks : ");
                    int idxAdd = scan.nextInt();
                    scan.nextLine();
                    list.add(idxAdd, inputMahasiswa(scan));
                    break;
                case 9:
                    System.out.print("Masukkan NIM : ");
                    String nimAfter = scan.nextLine();
                    list.removeAfter(nimAfter);
                    break;
                case 10:
                    System.out.print("Masukkan indeks : ");
                    int idxDel = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxDel);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks : ");
                    int idxGet = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 14:
                    list.printSize();
                    break;
                default:
                    System.out.println("Menu tidak Valid.");
            }
        } while (pilihan != 0);
        scan.close();
    }
}

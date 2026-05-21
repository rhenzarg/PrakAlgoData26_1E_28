package CM2;
public class Antrean28 {
    Pembeli28 head, tail;
    int counter;
 
    Antrean28() {
        head = tail = null;
        counter = 0;
    }
 
    public void tambahAntrian(String nama, String noHp) {
        counter++;
        Pembeli28 baru = new Pembeli28(counter, nama, noHp);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + counter);
    }
 
    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-12s %-15s %s%n", "No Antrian", "Nama", "No HP");
        Pembeli28 curr = head;
        while (curr != null) {
            System.out.printf("%-12d %-15s %s%n", curr.noAntrian, curr.namaPembeli, curr.noHp);
            curr = curr.next;
        }
    }
 
    public Pembeli28 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pembeli28 dihapus = head;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        dihapus.next = null;
        return dihapus;
    }
 
    public boolean isEmpty() {
        return head == null;
    }
}

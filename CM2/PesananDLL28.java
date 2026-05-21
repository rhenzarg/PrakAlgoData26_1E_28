package CM2;
public class PesananDLL28 {
    Pesanan28 head, tail;
 
public PesananDLL28() {
    head = tail = null;
}
 
    public void tambahPesanan(int kode, String nama, int harga, String namaPembeli) {
        Pesanan28 baru = new Pesanan28(kode, nama, harga, namaPembeli);
        if (head == null) {
            head = tail = baru;
        } else {
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
        }
    }
 
public void sortByNama() {
    if (head == null || head == tail) return;
    boolean swapped;
    do {
        swapped = false;
        Pesanan28 curr = head;
        
        while (curr.next != null) {
            
        if (curr.namaPesanan.compareToIgnoreCase(curr.next.namaPesanan) > 0) {
                int tmpKode = curr.kodePesanan;
                String tmpNama = curr.namaPesanan;
                int tmpHarga = curr.harga;
                String tmpPembeli = curr.namaPembeli;
 
                curr.kodePesanan = curr.next.kodePesanan;
                curr.namaPesanan = curr.next.namaPesanan;
                curr.harga = curr.next.harga;
                curr.namaPembeli = curr.next.namaPembeli;
 
                curr.next.kodePesanan = tmpKode;
                curr.next.namaPesanan = tmpNama;
                curr.next.harga = tmpHarga;
                curr.next.namaPembeli = tmpPembeli;
 
                swapped = true;

            }
                curr = curr.next;
        }
    } while (swapped);
}
 
public void laporanPesanan() {
    if (head == null) {
        System.out.println("Belum ada pesanan.");
        return;
    }
    sortByNama();
    System.out.println("======================================");
    System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
    System.out.println("======================================");
    System.out.printf("%-14s %-20s %s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
 
    int total = 0;
    Pesanan28 curr = head;
    while (curr != null) {
        System.out.printf("%-14d %-20s %d%n", curr.kodePesanan, curr.namaPesanan, curr.harga);
        total += curr.harga;
        curr = curr.next;
    }
    System.out.println("--------------------------------------");
    System.out.println("Total Pendapatan : Rp " + total);
}
 
public boolean isEmpty() {
return head == null;
    
    }
}
     

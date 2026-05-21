package CM2;

class Pesanan28 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;
    Pesanan28 prev, next;

    Pesanan28(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
        this.prev = null;
        this.next = null;
    }
}
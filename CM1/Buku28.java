package CM1;

public class Buku28 {
    String kode, judul;
    int tahun;

    Buku28(String kode, String judul, int tahun) {
        this.kode = kode;
        this.judul = judul;
        this.tahun = tahun;
    }

    void tampil() {
        System.out.println("Kode: " + kode + " | " + "Judul: " + judul + " | " + "Tahun: " + tahun);
    }
}

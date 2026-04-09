package CM1;

public class Peminjaman28 {
    Mahasiswa28 mhs;
    Buku28 buku;
    int lamaPinjam;
    int denda;

    Peminjaman28(Mahasiswa28 mhs, Buku28 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int perHari = 2000;

        if (lamaPinjam > batas) {
            denda = (lamaPinjam - batas) * perHari;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        int telat = 0;

        if (lamaPinjam > 5) {
            telat = lamaPinjam - 5;
        }

        System.out.println(
            mhs.nama + " | " +
            buku.judul + " | " + "Lama: " + lamaPinjam +
            " | " + "Terlambat: " + telat + " | " + "Denda: " + denda
        );
    }
}

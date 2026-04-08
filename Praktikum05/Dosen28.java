package Praktikum05;

public class Dosen28 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen28(String kd, String nm, boolean jk, int us){
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil(){
        System.out.println("Kode  : " + kode);
        System.out.println("Nama  : " + nama);
        System.out.println("JK    : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia  : " + usia);
    }
}

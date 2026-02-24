package P2;

public class MataKuliahMain28 {
    
    public static void main(String[] args) {
        MataKuliah28 matkul1 = new MataKuliah28("PASD", "Praktikum Algoritma dan Struktur Data", 2, 4);
        matkul1.ubahSKS(3);
        matkul1.tambahJam28(2);
        matkul1.kurangiJam28(0);
        matkul1.tampilInformasi28();

        MataKuliah28 matkul2 = new MataKuliah28("BD", "Basis Data", 1, 5);
        matkul2.ubahSKS(2);
        matkul2.tambahJam28(0);
        matkul2.kurangiJam28(1);
        matkul2.tampilInformasi28();
    }
}

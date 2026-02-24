package P2;

public class MataKuliah28 {
    
    String kodeMK28;
    String nama28;
    int sks28;
    int jumlahJam28;

    public MataKuliah28(String kode28, String nm28, int sks28,int jam28){
        kodeMK28 = kode28;
        nama28 = nm28;
        this.sks28 = sks28;
        jumlahJam28 = jam28;
    }

    void tampilInformasi28() {
        System.out.println("Kode MK: " + kodeMK28);
        System.out.println("Nama: " + nama28);
        System.out.println("Jumlah SKS: " + sks28);
        System.out.println("Jumlah jam: " + jumlahJam28);
    }
    
    void ubahSKS(int sksBaru28) {
        sks28 = sksBaru28;
        System.out.println("SKS berhasil diubah menjadi " + sks28);
    }

    void tambahJam28(int jam28){
        jumlahJam28 += jam28;
        System.out.println("Jumlah jam sekarang: " + jumlahJam28);
    }

    void kurangiJam28(int jam) {
        if (jumlahJam28 >= jam) {
            jumlahJam28 -= jam;
        }else {
            System.out.println("Pengurangan jam tidak bisa dilakukan, jam tidak mencukupi");
        }
    }
}

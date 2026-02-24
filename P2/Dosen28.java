package P2;

public class Dosen28 {
    
    String idDosen28;
    String nama28;
    boolean statusAktif28;
    int tahunBergabung28;
    String bidangKeahlian28;
    
    public Dosen28(String id, String nm, boolean statusbaru, int tahunBergabung,String bidangKeahlian){
        this.idDosen28 = id;
        this.nama28 = nm;
        this.statusAktif28 = statusbaru;
        this.tahunBergabung28 = tahunBergabung;
        this.bidangKeahlian28 = bidangKeahlian;
    }

    void tampilInformasi28() {
        System.out.println("ID Dosen: " + idDosen28);
        System.out.println("Nama Dosen: " + nama28);
        System.out.println("Status Aktif: " + (statusAktif28?"aktif":"tidak aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung28);
        System.out.println("Bidang Keahlian: " + bidangKeahlian28);
    }

    void setStatusAktif28(boolean status) {
        statusAktif28 = status;
    }

    int hitungMasaKerja28(int thnSkrg){
        return thnSkrg - tahunBergabung28;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian28 = bidang;
    }
}

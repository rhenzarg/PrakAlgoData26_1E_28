package P2;

public class DoenMain28 {
    public static void main(String[] args) {
    Dosen28 dosen1 = new Dosen28("1234567", "LG Adama Vito", true, 2015, "Matematika");
    dosen1.setStatusAktif28(false);
    dosen1.hitungMasaKerja28(2026);
    dosen1.ubahKeahlian("Aljabar Linear");
    dosen1.tampilInformasi28();

    Dosen28 dosen2  = new Dosen28("7654321", "Naufal Aryandito", false, 2017, "Aljabar Linear");
    dosen2.setStatusAktif28(true);
    dosen2.hitungMasaKerja28(2026);
    dosen2.ubahKeahlian("Agama");
    dosen2.tampilInformasi28();
   }
}

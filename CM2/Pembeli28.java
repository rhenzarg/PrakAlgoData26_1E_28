package CM2;

class Pembeli28 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli28 prev, next;

Pembeli28(int noAntrian, String namaPembeli, String noHp) {
    this.noAntrian = noAntrian;
    this.namaPembeli = namaPembeli;
    this.noHp = noHp;
    this.prev = null;
    this.next = null;
  }
}
package Pertemuan12;

public class SLLMain28 {
    public static void main(String[] args) {
        SingleLinkedList28 sll = new SingleLinkedList28();
        
        Mahasiswa28 mhs1 = new Mahasiswa28("21212203", "Dirga", "4D", 3.6);
        Mahasiswa28 mhs2 = new Mahasiswa28("22212202", "Cintia", "3C", 3.5);
        Mahasiswa28 mhs3 = new Mahasiswa28("23212201", "Bimon", "2B", 3.8);
        Mahasiswa28 mhs4 = new Mahasiswa28("24212200", "Alvaro", "1A", 4.0);

        sll.print(); 
        sll.addFirst(mhs1);
        sll.print();
        sll.addLast(mhs4);
        sll.print();
        sll.insertAfter("Dirga", mhs2);
        sll.insertAt(2, mhs3);
        sll.print();
    }
}

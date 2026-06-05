package Pertemuan14;

public class BinaryTreeArrayMain28 {
    public static void main(String[] args) {
        BinaryTreeArray28 bta = new BinaryTreeArray28();
        Mahasiswa28 mhs1 = new Mahasiswa28("244160121", "Ali", "A", 3.57);
        Mahasiswa28 mhs2 = new Mahasiswa28("244160185", "Candra", "C", 3.41);
        Mahasiswa28 mhs3 = new Mahasiswa28("244160221", "Badar", "B", 3.75);
        Mahasiswa28 mhs4 = new Mahasiswa28("244160220", "Dewi", "B", 3.35);

        Mahasiswa28 mhs5 = new Mahasiswa28("244160131", "Devi", "A", 3.48);
        Mahasiswa28 mhs6 = new Mahasiswa28("244160205", "Ehsan", "D", 3.61);
        Mahasiswa28 mhs7 = new Mahasiswa28("244160170", "Fizi", "B", 3.86);

        Mahasiswa28[] datMahasiswa28 = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta.populateData(datMahasiswa28, idxLast);
        System.out.println("\nInOrder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\nPreOrder Traversal Mahasiswa:");
        bta.traversePreOrder(0);

    }

}

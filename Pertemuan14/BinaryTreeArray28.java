package Pertemuan14;

public class BinaryTreeArray28 {
    Mahasiswa28[] dataMahasiswa28;
    int idxLast;

    public BinaryTreeArray28() {
        this.dataMahasiswa28 = new Mahasiswa28[10];
    }

    void populateData (Mahasiswa28 dataMhs[], int idxLast) {
        this.dataMahasiswa28 = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder (int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa28[idxStart] != null) {
                traverseInOrder(2*idxStart+1);
                dataMahasiswa28[idxStart].tampilInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}

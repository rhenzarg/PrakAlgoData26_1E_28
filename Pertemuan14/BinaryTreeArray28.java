package Pertemuan14;

public class BinaryTreeArray28 {
    Mahasiswa28[] dataMahasiswa28;
    int idxLast;

    public BinaryTreeArray28() {
        this.dataMahasiswa28 = new Mahasiswa28[10];
        idxLast = -1;
    }

    void populateData(Mahasiswa28 dataMhs[], int idxLast) {
        this.dataMahasiswa28 = dataMhs;
        this.idxLast = idxLast;
    }

    void add(Mahasiswa28 data) {
        if (idxLast < dataMahasiswa28.length - 1) {
            idxLast++;
            dataMahasiswa28[idxLast] = data;
        } else {
            System.out.println("Array penuh");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa28[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa28[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa28[idxStart] != null) {
                dataMahasiswa28[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
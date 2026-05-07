package P1Jobsheet10;

public class AntrianKRS28 {
    Mhs28[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudahKRS;
    int maxDPA;

    public AntrianKRS28() {
        this.max = 10;
        this.maxDPA = 30;
        this.data = new Mhs28[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.sudahKRS = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void tambahAntrian(Mhs28 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh! Maksimal " + max + " mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian. " +
                           "Nomor antrian: " + size);
    }

    public void panggilAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa.");
            return;
        }
        System.out.println("Memanggil 2 mahasiswa untuk proses KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int dipanggil = 0;
        while (dipanggil < 2 && !IsEmpty()) {
            if (sudahKRS >= maxDPA) {
                System.out.println("Kuota DPA sudah penuh! (" + maxDPA + " mahasiswa)");
                break;
            }
            Mhs28 mhs = data[front];
            front = (front + 1) % max;
            size--;
            sudahKRS++;
            dipanggil++;
            System.out.print(dipanggil + ". ");
            mhs.tampilkanData();
        }
        if (dipanggil == 0) {
            System.out.println("Tidak ada mahasiswa yang dipanggil.");
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahKRS() {
        return sudahKRS;
    }

    public int getJumlahBelumKRS() {
        return maxDPA - sudahKRS;
    }

    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan.");
        } else {
            System.out.println("Antrian sudah kosong.");
        }
    }
}
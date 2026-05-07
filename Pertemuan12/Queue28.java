package Pertemuan12;

public class Queue28 {
    NodeMhs28 front, rear;
    int size = 0;

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan!");
    }

    public void enqueue(Mhs28 data) {
        NodeMhs28 newNode = new NodeMhs28(data, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Antrian berhasil ditambahkan.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Memanggil antrian: " + front.data.nama);
        front = front.next;
        if (front == null) rear = null;
        size--;
    }

    public void peekFrontRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Antrian Terdepan: "); front.data.tampil();
            System.out.print("Antrian Paling Akhir: "); rear.data.tampil();
        }
    }

    public void printSize() {
        System.out.println("Jumlah mahasiswa yang masih mengantre: " + size);
    }
}

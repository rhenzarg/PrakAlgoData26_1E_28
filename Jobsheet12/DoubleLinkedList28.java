package Jobsheet12;

public class DoubleLinkedList28 {
    Node28 head;
    Node28 tail;

    int size = 0;

    public DoubleLinkedList28() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa28 data) {
        Node28 newNode = new Node28(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa28 data) {
        Node28 newNode28 = new Node28(data);
        if (isEmpty()) {
            head = tail = newNode28;
        } else {
            tail.next = newNode28;
            newNode28.prev = tail;
            tail = newNode28;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa28 data) {
        Node28 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node28 newNode = new Node28(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            newNode.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node28 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Mahasiswa28 deleted = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data berhasil dihapus:");
        deleted.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Mahasiswa28 deleted = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus:");
        deleted.tampil();
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        Node28 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void add(int index, Mahasiswa28 data) {
        if (index < 0) {
            System.out.println("Indeks tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node28 current = head;
        int i = 0;
        while (current != null && i < index - 1) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }
        if (current == tail) {
            addLast(data);
            return;
        }
        Node28 newNode = new Node28(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void removeAfter(String keyNim) {
        Node28 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }
        Node28 deleted = current.next;
        if (deleted == tail) {
            tail = current;
            current.next = null;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }
        size--;
        System.out.println("Data berhasil dihapus:");
        deleted.data.tampil();
    }

    public void remove(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node28 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }
        if (current == tail) {
            removeLast();
            return;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data berhasil dihapus:");
        current.data.tampil();
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("Indeks tidak valid atau list kosong.");
            return;
        }
        Node28 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Indeks melebihi ukuran list.");
            return;
        }
        System.out.println("Data pada indeks " + index + ":");
        current.data.tampil();
    }

    public void printSize() {
        System.out.println("Jumlah data : " + size);
    }

}

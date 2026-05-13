package Jobsheet12;

public class DoubleLinkedList28 {
    Node28 head;
    Node28 tail;

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
            System.out.println("Linked List Kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
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
}

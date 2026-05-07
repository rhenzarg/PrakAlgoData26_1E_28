package Pertemuan12;

public class SingleLinkedList28 {
    Node28 head;
    Node28 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node28 tmp = head;
            System.out.println("Isi Linked list:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa28 input) {
        Node28 ndInput = new Node28(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa28 input) {
        Node28 ndInput = new Node28(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa28 input) {
        Node28 ndInput = new Node28(input, null);
        Node28 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa28 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        }else if (index == 0) {
            addFirst(input);
        }else {
            Node28 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp =temp.next;
            }
            temp.next = new Node28(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }


}

package eu.vlad.digitalstack.dsa;


class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList {
    Node head = null;

    public void add(int data) {
        Node dummy = new Node(0, head);
        Node node = dummy;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(data);
        this.head = dummy.next;
    }

    public void remove(int data) {
        Node dummy = new Node(0, head);
        Node node = dummy;
        while (node.next != null && node.next.data != data) {
            node = node.next;
        }
        if (node.next != null) {
            node.next = node.next.next;
        }
        this.head = dummy.next;
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data+ " ");
            node = node.next;
        }
        System.out.println();
    }

    public int count() {
        int count = 0;
        Node node = head;
        while (node != null) {
            count++;
            node = node.next;
        }
        return count;
    }

    public Node middleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.add(1);
        numbers.add(2);
        numbers.display();

        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.display();

//        numbers.delete(4);
//        numbers.display();

        Node middle = numbers.middleNode();
        System.out.println(middle.data);

        numbers.add(6);
        numbers.display();

        numbers.middleNode();
        System.out.println(middle.data);
    }
}

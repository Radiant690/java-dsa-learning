public class LinkedListRecursiveTraversal {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        Node temp1 = new Node(30);
        Node temp2 = new Node(40);
        Node temp3 = new Node(50);

        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;

        printlist(head);
    }

    public static void printlist(Node head) {
        if (head == null)
            return;
        System.out.println(head.data);
        printlist(head.next);
    }
}

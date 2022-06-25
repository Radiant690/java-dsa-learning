public class InsertAtBegin {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node head = null;
        head = InsertAtBegining(head, 30);
        head = InsertAtBegining(head, 20);
        printlist(head);
    }

    public static Node InsertAtBegining(Node head, int x) {

        // temp is the node that stores the current node that needs to be inserted at
        // the begining
        Node temp = new Node(x);
        temp.next = head;
        return temp;

    }

    public static void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}

public class InsertAtEnd {
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
        head = InsertAtlast(head, 30);
        head = InsertAtlast(head, 20);
        printlist(head);
    }

    public static Node InsertAtlast(Node head, int x) {

        // temp is the node that stores the current node that needs to be inserted at
        // the End
        Node temp = new Node(x);
        if (head == null)
            return temp;
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = temp;
        return head;

    }

    public static void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

}

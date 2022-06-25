
public class DeleteAtBegin {
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
        head.next = new Node(30);
        head.next.next = new Node(40);
        printlist(head);
        head = deleteAtStart(head);
        printlist(head);

    }

    public static Node deleteAtStart(Node head) {
        if (head == null) {
            return null;
        } else {
            return head.next;
        }
    }

    public static void printlist(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }
}

public class linkedlist_doubly {
    // Node class for doubly linked list
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;

    // Insert at beginning
    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    // Insert at end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    // Display list forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display list backward
    public void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        // Go to last node
        while (temp.next != null) {
            temp = temp.next;
        }
        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        linkedlist_doubly list = new linkedlist_doubly();
        list.insertAtBegin(10);
        list.insertAtBegin(20);
        list.insertAtBegin(30);
        list.insertAtBegin(40);
        list.insertAtBegin(50);
        list.insertAtEnd(70);
        list.insertAtEnd(100);
        list.insertAtEnd(150);

        list.deleteAtBeginning();
        list.deleteAtBeginning();

        list.deleteAtEnd();
        list.deleteAtEnd();

        System.out.println("Display forward:");
        list.displayForward();

        System.out.println("Display backward:");
        list.displayBackward();
    }
}
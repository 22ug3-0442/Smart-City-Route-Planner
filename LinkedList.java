public class LinkedList {
    private Node head;

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insert(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Added to LinkedList: " + data);
    }

    public void display() {
        System.out.println("\n--- Locations in Linked List ---");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
        head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
        System.out.println(data + " inserted successfully");
    }

    void delete(int data) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == data) {
                found = true;
                if (temp.prev == null && temp.next == null) {
                    head = null;
                } else if (temp.prev == null) {
                    head = temp.next;
                    head.prev = null;
                } else if (temp.next == null) {
                    temp.prev.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println(data + " deleted successfully");
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println(data + " not found");
        }
    }

    void search(int data) {
        Node temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.data == data) {
                found = true;
                System.out.println(data + " found");
                break;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println(data + " not found");
        }
    }

    void display() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    int data = sc.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    data = sc.nextInt();
                    list.delete(data);
                    break;
                case 3:
                    System.out.print("Enter data to search: ");
                    data = sc.nextInt();
                    list.search(data);
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

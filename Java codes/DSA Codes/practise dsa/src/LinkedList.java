
public class LinkedList {
    class Node {
        public int value;
        public Node next;
    }
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void append(int value)
    {
        insertInLinkedList(value,size);
    }

    // SinglyLinkedList Traversal
    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("List is Empty.");
        } else {
            Node tempNode = head;
            for (int i = 0; i<size; i++) {
                System.out.println(tempNode.value);
                tempNode = tempNode.next;
            }
        }
    }

    // Search for a node

    public int searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    return i;
                }
                tempNode = tempNode.next;
            }
        }
        return -1;
    }

    //Deleting a node from SinglyLinkedList
//    public void deletionOfNode(int location) {
//        if (head == null) {
//            System.out.println("List is Empty.");
//            return;
//        } else if (location == 0) {
//            head = head.next;
//            size--;
//            if (size == 0) {
//                tail = null;
//            }
//        } else if (location >= size) {
//            Node tempNode = head;
//            for (int i = 0; i < size - 1; i++) {
//                tempNode = tempNode.next;
//            }
//            if (tempNode == head) {
//                tail = head = null;
//                size--;
//                return;
//            }
//            tempNode.next = null;
//            tail = tempNode;
//            size--;
//        } else {
//            Node tempNode = head;
//            for (int i = 0; i <location-1; i++) {
//                tempNode = tempNode.next;
//            }
//            tempNode.next = tempNode.next.next;
//            size--;
//        }
//    }

    public int deletionOfNode(int value) {
        if (head == null) {
            return -1;
        } else {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                if (tempNode.value == value) {
                    tempNode = tempNode.next;
                    if (i==0)
                    {
                        head=tempNode;
                    }
                    size--;
                    return i ;
                }
                tempNode = tempNode.next;
            }
        }
        return -1;
    }

    //  Delete Entire SinglyLinkedList
    public void deleteSLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");
    }

}

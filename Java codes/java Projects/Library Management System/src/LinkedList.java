class Node<E> {
    E data;
    Node1<E> next;

    public Node(E data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<E> {
    private Node1<E> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void add(E data) {
        Node1<E> newNode = new Node1<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node1<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(E data) {
        if (head == null) {
            return; // Empty list, nothing to remove
        }

        if (head.data.equals(data)) {
            head = head.next; // Remove the head node
            size--;
            return;
        }

        Node1<E> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next; // Remove the next node
                size--;
                return;
            }
            current = current.next;
        }
    }

    public E get(int index){
        int count=1;
        Node1<E> current = head;
        while (current.next != null) {
            if (count==index){
                return current.next.data;
            }
            current=current.next;
            count++;
        }
        return head.data;
    }

    public boolean isEmpty()
    {
        return head==null;
    }

    public void clear()
    {
        head=null;
        size=0;
    }
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node1<E> current = head;
        while (current != null) {
            sb.append(current.data).append(" -> ");
            current = current.next;
        }
        sb.append("null");
        return sb.toString();
    }

}



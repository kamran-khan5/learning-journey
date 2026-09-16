import java.util.NoSuchElementException;

class Node1<E> {
    E data;
    Node1<E> next;

    public Node1(E data) {
        this.data = data;
        this.next = null;
    }
}

 class Queue<E> {
    private Node1<E> front;
    private Node1<E> rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(E element) {
        Node1<E> newNode = new Node1<>(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty.");
        }
        E data = front.data;
        front = front.next;
        size--;
        return data;
    }

    public E get(int index){
        int count=1;
        Node1<E> current=front;
        while (current.next != null) {
            if (index==count){
                return current.next.data;
            }
            current=current.next;
            count++;
        }
        return front.data;
    }

    public void clear(){
        front=null;
        rear=null;
        size=0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node1<E> current = front;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

}

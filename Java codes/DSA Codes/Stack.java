import java.util.LinkedList;

public class Stack<E> {
    private LinkedList<E> list;

    public Stack() {
        list = new LinkedList<>();
    }

    public void push(E element) {
        list.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.removeFirst();
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.getFirst();
    }

    public E get(int index){
        return list.get(index);
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear(){
        list.clear();
    }

    public int StackSize(){
        return list.size();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
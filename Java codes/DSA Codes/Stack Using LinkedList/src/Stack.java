public class Stack {
    LinkedList linkedList;
    private int size;

    public Stack() {
        linkedList = new LinkedList();
    }

    // Push method
    public void push(int value) {
        linkedList.insertInLinkedList(value,size);
        System.out.println("Inserted " + value + " in Stack.\n\n");
        size++;
    }

    // isEmpty
    public boolean isEmpty() {
        if (linkedList.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Pop method
    public void pop() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
        } else {
            linkedList.deletionOfNode(size);
            size--;
        }
        return;
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {
            System.out.println("The Stack is Empty!");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }

    // Delete Method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }

    public String toString()
    {
        StringBuilder str=new StringBuilder();
        LinkedList.Node temp= linkedList.head;
        while (temp!=null)
        {
            str.append(temp.value);
            str.append("  ");
            temp=temp.next;
        }
        return str.toString();
    }

}

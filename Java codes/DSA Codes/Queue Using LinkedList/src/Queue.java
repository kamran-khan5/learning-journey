public class Queue {
    LinkedList list;
    private int size;
    public Queue()
    {
        list=new LinkedList();
        size=0;
    }

    public void enQueue(int value)
    {
        list.insertInLinkedList(value,size);
        size++;
    }

    public void deQueue()
    {
        list.deletionOfNode(0);
        size--;
    }

    public String toString()
    {
        StringBuilder str=new StringBuilder();
        LinkedList.Node temp= list.head;
        while (temp!=null)
        {
            str.append(temp.value);
            str.append(" ");
            temp=temp.next;
        }
        return str.toString();
    }

}

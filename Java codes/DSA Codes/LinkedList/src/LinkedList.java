import java.util.NoSuchElementException;

public class LinkedList {
    private class Node{
        private int value;
        private Node next;

        public Node (int data)
        {
            this.value=data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    private boolean isEmpty()
    {
        return head==null;
    }

    public void print()
    {
        Node current=head;
        while (current!=null)
        {
            System.out.println(current.value);
            current=current.next;
        }
    }


    public void addFirst(int item)
    {
        Node node=new Node(item);
        if (isEmpty())
        {
            head = tail = node;
        }
        else
        {
            node.next=head;
            head = node;
        }
        size++;
    }

    public void addLast(int item)
    {
        Node node=new Node(item);
        if (isEmpty())
        {
            head = tail = node;
        }
        else
        {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void deleteFirst()
    {

        if (isEmpty())
        {
            throw new NoSuchElementException();
        }

        if (head==tail)
        {
            head=tail=null;
            return;
        }

        Node tempHead = head.next;
        head.next=null;
        head=tempHead;
        size--;
    }

    public void deleteLast()
    {

        if (isEmpty())
        {
            throw new NoSuchElementException();
        }

        if (head==tail)
        {
            head=tail=null;
            return;
        }

        Node current=head;
        while (current!=null)
        {
            if (current.next==tail)
            {
                tail=current;
                tail.next=null;
            }
            current=current.next;
        }
        size--;
    }

    public int indexOf(int item)
    {
        int index=0;
        Node current=head;
        while(current!=null)
        {
            if (current.value==item)
                return index;

            current=current.next;
            index++;
        }
        return -1;
    }

    public boolean contain(int item)
    {
        Node node=head;
        if (indexOf(item)!=-1)
        {
            return true;
        }
        return false;
    }

    public int [] toArray()
    {
        int[] array=new int[size];
        Node current=head;
        int index=0;
        while (current!=null)
        {
            array[index++] = current.value;
            current=current.next;
        }
        return array;
    }

    public void reverse()
    {
        if (isEmpty())
            return;

        Node previous=head;
        Node current=head.next;

        while (current!=null)
        {
            Node next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        tail=head;
        tail.next=null;
        head=previous;
    }

    public int size()
    {
        return size;
    }
}

// logic for reverse Linked list.
//    private void swap (Node prenode ,Node postnode)
//    {
//        int temp=prenode.value;
//        prenode.value=postnode.value;
//        postnode.value=temp;
//
//    }
//
//    private Node previous(Node node)
//    {
//        Node current=head;
//        while (current.next!=node)
//        {
//            current=current.next;
//        }
//        return current;
//    }
//
//    public void reverse()
//    {
//        Node prenode=head;
//        Node postnode=tail;
//        for(int i=0; i<size/2; i++)
//        {
//            swap( prenode , postnode);
//            prenode=prenode.next;
//            postnode=previous(postnode);
//        }
//    }

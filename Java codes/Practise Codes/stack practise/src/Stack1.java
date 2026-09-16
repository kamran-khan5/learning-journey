import java.util.Arrays;

public class Stack1 {
    private int[] items;
    private int size;

    public int getSize() {
        return size;
    }

    public Stack1(int capacity)
    {
        items=new int[capacity];
    }


    public void push(int number) {
        if (size== items.length)
        {
            throw new StackOverflowError();
        }
        items[size++] = number;
    }

    public int pop() {
        if (isEmpty())
        {
            throw new IllegalStateException();
        }
        return items[size--];
    }

    public int peek() {
        if (isEmpty())
        {
            throw new IllegalStateException();
        }
        return items[size-1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString()
    {
        var content=Arrays.copyOfRange(items,0,size);
        return Arrays.toString(content);
    }

}

import java.util.Arrays;

public class twoStack {
    private int[] items;
    private int leftSize;
    private int rightSize;


    public twoStack(int capacity) {
        items = new int[capacity];
        rightSize = capacity - 1;
    }


    public void pushToLeft(int number) {
        if (leftSize == items.length || leftSize == rightSize) {
            throw new StackOverflowError();
        }
        items[leftSize++] = number;
    }

    public void pushToRight(int number) {
        if (rightSize == 0 || leftSize == rightSize) {
            throw new StackOverflowError();
        }
        items[rightSize--] = number;
    }

    public int popToLeft() {
        if (leftSize == 0) {
            throw new IllegalStateException();
        }
        return items[leftSize--];
    }

    public int popToRight() {
        if (leftSize == rightSize || rightSize == items.length) {
            throw new IllegalStateException();
        }
        return items[rightSize++];
    }

    public void printLeftStack() {
        for (int i = 0; i < leftSize; i++) {
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }

    public void printRightStack() {
        for (int i = items.length - 1; i > rightSize; i--) {
            System.out.print(items[i] + "  ");
        }
        System.out.println();
    }
}


//    public int peek() {
//        if (isEmpty())
//        {
//            throw new IllegalStateException();
//        }
//        return items[size-1];
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
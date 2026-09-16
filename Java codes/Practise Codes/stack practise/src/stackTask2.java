public class stackTask2 {
     int[] array;
     int leftSize;
     int rightSize;


    public stackTask2(int capacity) {
        array = new int[capacity];
        rightSize = capacity - 1;
    }


    public void pushToLeft(int number) {
        if (leftSize == array.length || leftSize == rightSize) {
            throw new StackOverflowError();
        }
        array[leftSize++] = number;
    }

    public void pushToRight(int number) {
        if (rightSize == 0 || leftSize == rightSize) {
            throw new StackOverflowError();
        }
        array[rightSize--] = number;
    }

    public int popToLeft() {
        if (leftSize == 0) {
            throw new IllegalStateException();
        }
        return array[leftSize--];
    }

    public int popToRight() {
        if (leftSize == rightSize || rightSize == array.length) {
            throw new IllegalStateException();
        }
        return array[rightSize++];
    }

    public void printLeftStack() {
        for (int i = 0; i < leftSize; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    public void printRightStack() {
        for (int i = array.length - 1; i > rightSize; i--) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }
}

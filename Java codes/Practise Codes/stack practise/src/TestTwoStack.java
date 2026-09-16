public class TestTwoStack {
    public static void main(String[] args) {
        stackTask2 stack2=new stackTask2(10);
        stack2.pushToLeft(5);
        stack2.pushToLeft(3);
        stack2.pushToLeft(4);
        stack2.pushToLeft(100);
        stack2.printLeftStack();
        stack2.popToLeft();
        stack2.popToLeft();
        stack2.printLeftStack();

        stack2.pushToRight(10);
        stack2.pushToRight(9);
        stack2.pushToRight(8);
        stack2.pushToRight(7);
        stack2.printRightStack();
        stack2.popToRight();
        stack2.popToRight();
        stack2.printRightStack();
    }
}

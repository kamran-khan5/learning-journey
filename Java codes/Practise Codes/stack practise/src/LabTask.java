public class LabTask {
    public static void main(String[] args) {
        Stack1 stack=new Stack1(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.pop();
        stack.push(2);
        stack.push(4);
        System.out.println(stack);
        stack.push(6);
        stack.pop();
    }
}

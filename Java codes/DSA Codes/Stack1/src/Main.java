public class Main {
    public static void main(String[] args) {
        Stack1 stack=new Stack1();
        String str="(1+2(2-3(2-7)))";
        System.out.println(stack.isBalanced(str));

    }
}
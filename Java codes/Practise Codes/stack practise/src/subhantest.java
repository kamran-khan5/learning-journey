public class subhantest {
    public static void main(String[] args) {
        subhan sub=new subhan(5);
        sub.push(1);
        sub.push(2);
        sub.pop();
        sub.print();
        sub.push(3);
        sub.push(4);
        System.out.println(sub.peek());
        System.out.println(sub.isempty());
    }
}

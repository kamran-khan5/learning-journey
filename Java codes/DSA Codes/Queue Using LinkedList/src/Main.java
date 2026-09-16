public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        System.out.println(queue.toString());
        queue.deQueue();
        queue.deQueue();
        System.out.println(queue.toString());
        queue.enQueue(4);
        System.out.println(queue.toString());
    }
}
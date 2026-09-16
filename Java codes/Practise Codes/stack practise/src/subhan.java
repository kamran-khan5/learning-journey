public class subhan {
    private int[]arr;
    private int size;
    public subhan(int capacity){
        arr=new int[capacity];
    }
    public  void push(int number){
        if(size==arr.length){
            System.out.println("stack is empty ");
            return;
        }
        arr[size++]=number;
    }
    public  int pop(){
        if(isempty()){
            System.out.println("stack is empty ");
            return -1;
        }
       return arr[size--];
    }
    public int peek(){
        if(isempty()){
            System.out.println("stack is empty ");
            return -1;
        }
        return arr[size-1];
    }

    public boolean isempty(){
        return size==0;
    }

    public void print(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+"   ");


            System.out.println();
        }
    }
}

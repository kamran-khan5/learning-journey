// 4.19 Assume that i = 2, j = 3, k = 2 and m = 2. What does each of the following statements print?
public class Chap_4_19 {
    public static void main(String[] args) {
        int i = 2, j = 3, k = 2 , m = 2;

        System.out.println(i == 2);//print true because i value is 2.
        System.out.println(j == 5); //print false because j value is 3 which is not equal to 5.
        System.out.println((i >= 0) && (j <= 3)); //print true because i value is 2 & j value is 3.
        System.out.println((m <= 100) & (k <= m)); //print true because m value is 2 & k value is 2.
        System.out.println((j >= i) || (k != m)); //print true because j value is 3 & k value is 2.
        System.out.println((k + i < j) | (4 - j >= k)); //print false because 2+2 is not smaller than 3 & 4-3 is not smaller or equal to 2.
        System.out.println(!(k > j)); //print true because 2 is not smaller than 3 which is false with help of ! it becomes true.
    }
}

/*(The Sum of a Series) Find the summation of the sequence of numbers 1, 2, 3 … n, where n
ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the corresponding sum.
If this were a product instead of a sum, what difficulty might you encounter with the
variable that accumulates the product? */
public class Chap_4_13 {
    public static void main(String[] args)
    {
        long sum=0,product=1;
        for (int i=1;i<=100;i++)
        {
            sum+=i;
            product=product*i;
        }
        System.out.println("Sum of series of 1 - 100 = "+sum+"\nProduct of series of 1 - 100 = "+product);

    }
}

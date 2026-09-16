import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        int no_of_guesses=0, random_no, guess_no;
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
        random_no=random.nextInt(101);

        do
        {
            System.out.print("Guess the Number : ");
            guess_no=sc.nextInt();
            no_of_guesses++;

            if (random_no == guess_no )
            {
                System.out.println("Game Win. \nYour Score is ="+no_of_guesses);
            }
            else if (random_no - guess_no <= 5 && random_no - guess_no >= -5)
            {
                System.out.println("You Almost There. ");
            }
            else if (random_no - guess_no <= 30 && random_no - guess_no >= -30)
            {
                System.out.println("Getting close.");
            }
            else if (random_no - guess_no <= 50 && random_no - guess_no >= -50)
            {
                System.out.println("Try Again YOu are too far.");
            }
            else
            {
                System.out.println("Try Again.");
            }
        }while(random_no!=guess_no);

        System.out.println("Random Number is = "+ random_no);

    }

}


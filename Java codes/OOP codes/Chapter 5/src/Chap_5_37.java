import java.util.Random;
import java.util.Scanner;

public class Chap_5_37 {
    public static boolean askQuestion( ) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean x=false;

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = scanner.nextInt();

        int ansIterator=random.nextInt(4);
        if(guess!=answer)
        {
            switch(ansIterator) {
                case 0:
                    System.out.println("No. Please try again.");
                    x=false;
                    break;
                case 1:
                    System.out.println("Wrong. Try once more.");
                    x=false;
                    break;
                case 2:
                    System.out.println("Don't give up! Try again");
                    x=false;
                    break;
                case 3:
                    System.out.println("No. Keep trying.");
                    x=false;
                    break;
            }
        }

        else {
            ansIterator=random.nextInt(4);
            switch(ansIterator) {
                case 0:
                    System.out.println("Very good!");
                    x=true;
                    break;
                case 1:
                    System.out.println("Excellent!");
                    x=true;
                    break;
                case 2:
                    System.out.println("Nice Work!");
                    x=true;
                    break;
                case 3:
                    System.out.println("Keep up the good work!");
                    x=true;
                    break;
            }

        }
        return x;
    }

    public static void main(String[] args) {

        boolean[] record=new boolean[10];
        boolean x = false;
        double score=0;
        for (int i = 0; i < 10; i++) {

            record[i]=askQuestion();
            if (record[i]){
                score+=1;

            }
        }
        System.out.println("You got "+ ((score/10)*100) +"% Marks");
        if (score < 7.5) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }


    }
}

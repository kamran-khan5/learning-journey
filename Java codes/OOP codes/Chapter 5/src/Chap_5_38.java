import java.util.Random;
import java.util.Scanner;

public class Chap_5_38 {
    public static Random random = new Random();
    public static Scanner input = new Scanner(System.in);
    public static boolean difficultyLevel1( ) {

        boolean x=false;

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = input.nextInt();

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

    public static boolean difficultyLevel2( ) {

        boolean x=false;

        int num1 = random.nextInt(90)+10;
        int num2 = random.nextInt(90)+10;
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = input.nextInt();

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

    public static boolean difficultyLevel3( ) {

        boolean x=false;

        int num1 = random.nextInt(900)+100;
        int num2 = random.nextInt(900)+100;
        int answer = num1 * num2;
        System.out.printf("How much is %d times %d?%n", num1, num2);
        int guess = input.nextInt();

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

    public static void chooseLevel()
    {



    }


    public static void main(String[] args) {

        boolean[] record=new boolean[10];
        boolean x = false;
        double score=0;
        int choice;
        do {
            System.out.println("Press 1 for Easy Practice of Multiplication.");
            System.out.println("Press 2 for Medium Practice of Multiplication.");
            System.out.println("Press 3 for Hard Practice of Multiplication.");
            choice=input.nextInt();
            switch (choice)
            {
                case 1:
                    for (int i = 0; i < 10; i++) {

                        record[i]=difficultyLevel1();
                        if (record[i]){
                            score+=1;

                        }
                    }
                    break;

                case 2:
                    for (int i = 0; i < 10; i++) {

                        record[i]=difficultyLevel2();
                        if (record[i]){
                            score+=1;

                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < 10; i++) {

                        record[i]=difficultyLevel3();
                        if (record[i]){
                            score+=1;

                        }
                    }
                    break;

                default:
                    System.out.println("Invalid input... ");
                    break;
            }
        }while (choice<0 || choice>3);
        System.out.println("You got "+ ((score/10)*100) +"% Marks");
        if (score < 7.5) {
            System.out.println("Please ask your teacher for extra help.");
        } else {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
    }
}


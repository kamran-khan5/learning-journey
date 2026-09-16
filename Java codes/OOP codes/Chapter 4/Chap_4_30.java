import java.util.Scanner;

public class Chap_4_30 {
    public static void quizQuestion()
    {
        Scanner sc=new Scanner(System.in);
        int rightAnswer=0;
        System.out.println("Welcome to Quick quiz about Global warming.");

        System.out.println("\n\nQuestion 1: \nWhich of the following is a greenhouse gas that is released by human" +
                "\n activities and speeds up global warming?");
        System.out.println("A): Petroleum   \nB): Natural gas  \nC): Carbon dioxide  \nD): Nuclear power");
        System.out.print("Enter option : ");
        String option=sc.next();
        if (option.charAt(0)=='c' || option.charAt(0)=='C')
        {
            System.out.println("Correct Answer.");
            rightAnswer++;
        }
        else
        {
            System.out.println("Wrong Answer.\nCorrect Answer: Carbon dioxide.");
        }

        System.out.println("\n\nQuestion 2: \nWhich of the following human activities does NOT release carbon " +
                "dioxide into the atmosphere?");
        System.out.println("A): Burning fossil fuels   \nB): Fishing  \nC): Deforestation  \nD): Driving");
        System.out.print("Enter option : ");
        option=sc.next();
        if (option.charAt(0)=='b' ||option.charAt(0)=='B')
        {
            System.out.println("Correct Answer.");
            rightAnswer++;
        }
        else
        {
            System.out.println("Wrong Answer.\nCorrect Answer: Fishing.");
        }

        System.out.println("\n\nQuestion 3: \nWhich of the following is NOT a negative effect of global warming?");
        System.out.println("A): Larger fish population   \nB): New infectious diseases  \nC): Species extinction" +
                "  \nD): Loss of coastal areas");
        System.out.print("Enter option : ");
        option=sc.next();
        if (option.charAt(0)=='a' ||option.charAt(0)=='A')
        {
            System.out.println("Correct Answer.");
            rightAnswer++;
        }
        else
        {
            System.out.println("Wrong Answer.\nCorrect Answer: Larger fish population");
        }

        System.out.println("\n\nQuestion 4: \nWhat country emits the most carbon dioxide?");
        System.out.println("A): China   \nB): United State  \nC): Russia  \nD): India");
        System.out.print("Enter option : ");
        option=sc.next();
        if (option.charAt(0)=='a' ||option.charAt(0)=='A')
        {
            System.out.println("Correct Answer.");
            rightAnswer++;
        }
        else
        {
            System.out.println("Wrong Answer.\nCorrect Answer: China.");
        }

        System.out.println("\n\nQuestion 5: \nWhat percentage of carbon dioxide that is emitted into the " +
                "atmosphere is absorbed by the ocean?");
        System.out.println("A): 40   \nB): 35  \nC): 70  \nD): 50");
        System.out.print("Enter option : ");
        option=sc.next();
        if (option.charAt(0)=='d' ||option.charAt(0)=='D')
        {
            System.out.println("Correct Answer.");
            rightAnswer++;
        }
        else
        {
            System.out.println("Wrong Answer.\nCorrect Answer: 50.");
        }

        checkResult(rightAnswer);
    }

    public static void checkResult(int rightAnswer)
    {
        switch (rightAnswer)
        {
            case 5:
                System.out.println("\n\nCorrect Answers: " +rightAnswer + "\nExcellent.");
                break;

            case 4:
                System.out.println("\n\nCorrect Answers: " +rightAnswer + "\nVery Good.");
                break;

            default:
                System.out.println("\n\nCorrect Answers: " +rightAnswer + "\nTime to brush up on your knowledge of global warming.");
                break;
        }
    }

    public static void main(String[] args) {
        quizQuestion();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BombChance game=new BombChance();
        char choice;
        do {
            int[][] grid=new int[4][4];
            game.gridShow(grid);
            game.placeNumber(grid);
            game.findScore(grid);

            System.out.println("Do you want to play again (Y/N).");
            choice=sc.next().charAt(0);

        }while (choice=='Y'|| choice=='y');

        System.out.println("\n\nThanks For Playing!");

    }
}
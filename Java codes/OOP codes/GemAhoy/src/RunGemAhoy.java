import java.util.Scanner;
public class RunGemAhoy {
    public static void main(String[] args) {
        System.out.println("\t Welcome GemAhoy Game! \n");
        System.out.println("GuideLines: ");
        System.out.println("1. 'B' represent Bomb Slot.");
        System.out.println("2. 'E' represent Bomb Affected Gem Slot.");
        System.out.println("3. '*' represent Bomb Affected Slot.");
        System.out.println("4. '-' represent cover Slot.");
        System.out.println("5. 'x' represent Uncover Slot.\n");

        GemAhoy game = new GemAhoy(6, 5, 5);
        game.displayBoard();
        Scanner scanner = new Scanner(System.in);
        while (game.getGemCount() - game.getExplodedGem() > 0 && game.getMoves() < game.size * game.size) {
            System.out.print("Enter row to uncover cell between (1-6): ");
            int row = scanner.nextInt();
            System.out.print("Enter column to uncover cell between (1-6): ");
            int col = scanner.nextInt();
            game.uncoverCell(row-1, col-1);
        }
        if (game.getGemCount() == 0) {
            System.out.println("Congratulations! You Win. \nYou collected all the 5 gems.");
            System.out.println("\n Thanks For Playing. Hope See You Again.");
        }
        else
        {
            System.out.println("Game over. Total Collected Gem: " + (5 - game.getGemCount()));
            System.out.println("Exploded Gem: " + game.getExplodedGem());
            System.out.println("Thanks For Playing. Hope See You Again.");
        }

        scanner.close();
    }
}


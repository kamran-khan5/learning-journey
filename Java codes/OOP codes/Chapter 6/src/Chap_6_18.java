import java.util.Random;

public class Chap_6_18 {
    public static Random randomNumbers = new Random();
    public enum Status { CONTINUE, WON, LOST }

    public static void main(String[] args) {
        int[] winCount = new int[22];
        int[] loseCount = new int[22];// to store counts at index 21
        int totalRolls = 0;
        int totalRolls1 = 0;
        int winSum = 0;

        for (int i = 0; i < 1000000; i++) {
            int sumOfDice = rollDice();
            totalRolls++;
            totalRolls1++;


            Status gameStatus;
            switch (sumOfDice) {
                case 7:
                case 11:
                    gameStatus = Status.WON;
                    break;
                case 2:
                case 3:
                case 12:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    int point = sumOfDice;
                    while (gameStatus == Status.CONTINUE) {
                        sumOfDice = rollDice();
                        totalRolls++;
                        if (sumOfDice == point) {
                            gameStatus = Status.WON;
                        } else if (sumOfDice == 7) {
                            gameStatus = Status.LOST;
                        }
                    }
                    break;
            }

            if (gameStatus == Status.WON) {
                if (totalRolls <= 20) {
                    winCount[totalRolls]++;
                } else {
                    winCount[21]++;
                }
                winSum++;
            } else {
                if (totalRolls <= 20) {
                    loseCount[totalRolls]++;
                } else {
                    loseCount[21]++;
                }
            }
            totalRolls = 0;
        }

        System.out.printf("%10s%10s%10s\n", "Roll", "Wins", "Losses");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%10d%10d%10d\n", i, winCount[i], loseCount[i]);
        }
        System.out.printf("%10s%10d%10d\n", "20+", winCount[21], loseCount[21]);

        double winningChances = (double)winSum / 1000000;
        System.out.printf("Chances of winning: %.2f%%\n", winningChances * 100);

        double averageRolls = (double)totalRolls1 / 1000000;
        System.out.printf("Average length of a game: %.2f\n", averageRolls);

        double chancesOfWinningAfter20Rolls = (double)winCount[21] / (double)(winCount[21] + loseCount[21]);
        double chancesOfWinningBefore20Rolls = (double)winSum / (double)(1000000 - winCount[21] - loseCount[21]);
        System.out.printf("Chances of winning after 20 rolls: %.2f%%\n", chancesOfWinningAfter20Rolls * 100);
        System.out.printf("Chances of winning before 20 rolls: %.2f%%\n", chancesOfWinningBefore20Rolls * 100);
    }

    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        return die1 + die2;
    }
}

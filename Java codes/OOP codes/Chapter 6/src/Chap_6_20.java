import java.security.SecureRandom;

public class Chap_6_20 {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[][] scores = new int[4][3];
        int[] totalScores = new int[4];



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(11);
            }
            totalScores[i] = scores[i][0] + scores[i][1] + scores[i][2];
        }


        System.out.println("Player\tChance 1\tChance 2\tChance 3\tTotal Score");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%3d\t%8d\t%8d\t%8d\t%11d\n", i+1, scores[i][0], scores[i][1], scores[i][2], totalScores[i]);
        }

        int maxScore = 0;
        int winner = 0;
        for (int i = 0; i < 4; i++) {
            if (totalScores[i] > maxScore) {
                maxScore = totalScores[i];
                winner = i + 1;
            }
        }
        System.out.printf("Player %d is the winner with a score of %d.\n", winner, maxScore);
    }
}

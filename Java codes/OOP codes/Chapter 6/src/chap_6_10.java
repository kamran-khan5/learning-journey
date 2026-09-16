import java.util.Random;

public class chap_6_10 {
    public static void main(String[] args) {
        Random r=new Random();
        int[] pixelArray = new int[20];//{15, 25, 35, 45, 55, 65, 75, 85, 95, 105, 115, 125, 135, 145, 155, 165, 175, 185, 195};
        for (int i = 0; i < pixelArray.length; i++) {
            pixelArray[i]= r.nextInt(210);

        }
        for (int i = 0; i < pixelArray.length; i++) {
            if (pixelArray[i] >= 0 && pixelArray[i] <= 20) {
                pixelArray[i] = 10;
            } else if (pixelArray[i] >= 21 && pixelArray[i] <= 40) {
                pixelArray[i] = 30;
            } else if (pixelArray[i] >= 41 && pixelArray[i] <= 60) {
                pixelArray[i] = 50;
            } else if (pixelArray[i] >= 61 && pixelArray[i] <= 80) {
                pixelArray[i] = 70;
            } else if (pixelArray[i] >= 81 && pixelArray[i] <= 100) {
                pixelArray[i] = 90;
            } else if (pixelArray[i] >= 101 && pixelArray[i] <= 120) {
                pixelArray[i] = 110;
            } else if (pixelArray[i] >= 121 && pixelArray[i] <= 140) {
                pixelArray[i] = 130;
            } else if (pixelArray[i] >= 141 && pixelArray[i] <= 160) {
                pixelArray[i] = 150;
            } else if (pixelArray[i] >= 161 && pixelArray[i] <= 180) {
                pixelArray[i] = 170;
            } else {
                pixelArray[i] = 190;
            }
        }

// Print the array with the new quantized values
        for (int i = 0; i < pixelArray.length; i++) {
            System.out.print(pixelArray[i] + " ");
        }


    }
}

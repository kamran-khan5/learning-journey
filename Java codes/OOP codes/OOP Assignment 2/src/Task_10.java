/*
Task 10: String Encryption Develop a program that prompts the user to enter a sentence.
Implement a function to encrypt the sentence by shifting each letter by a certain number of
positions in the alphabet (e.g., shifting each letter by 3 positions). Display the encrypted
sentence.
 */
import java.util.Scanner;
public class Task_10 {
    private static String encryption(String str, int encryptNumber)
    {
        char[] charArray=str.toCharArray();
        StringBuilder tempStr=new StringBuilder();
        for (char ch : charArray) {
            if (ch >= 'A' && ch <= 'Z') {
                int temp = (int) ch + encryptNumber;
                if (temp > 90) {
                    temp = (temp - 90) + 64;
                    tempStr.append((char) temp);
                } else if (temp < 65) {
                    temp += 26;
                    tempStr.append((char) temp);
                } else {
                    tempStr.append((char) temp);
                }
            } else if ((ch >= 'a' && ch <= 'z')) {
                int temp = (int) ch + encryptNumber;
                if (temp > 122) {
                    temp = (temp - 122) + 96;
                    tempStr.append((char) temp);
                } else if (temp < 97) {
                    temp += 26;
                    tempStr.append((char) temp);
                } else {
                    tempStr.append((char) temp);
                }
            } else {
                tempStr.append(ch);
            }
        }
        return tempStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String str=sc.nextLine();
        System.out.print("Enter number for Encryption : ");
        int encryptNumber=sc.nextInt();
        System.out.println("Encrypted string : " + encryption(str,encryptNumber));
    }
}

import java.util.Scanner;

public class Chap_5_21 {
    public static String addFullStop(String str)
    {
        if (str.charAt(str.length()-1)!='.')
        {
            return str+".";
        }
        return str;
    }

    public static String capatalizeFirstLetter(String str)
    {
        if (Character.isLowerCase(str.charAt(0)))
        {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static void beautifyString() {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter String to make it beautiful: ");
        String str=sc.nextLine();

        str=addFullStop(str);
        str=capatalizeFirstLetter(str);

        System.out.println("After Updating: \n"+str);
    }


    public static void main(String[] args) {
        beautifyString();
    }

}

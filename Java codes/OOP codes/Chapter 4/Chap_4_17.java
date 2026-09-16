import java.util.Scanner;

public class Chap_4_17 {
    public static void main(String[] args) {
        System.out.println("Counts student grades");
        int[] count_grades={0,0,0,0};
        String grade;
        String students_name;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.print("Enter "+(i+1)+" Student name:");
            students_name=input.nextLine();
            System.out.print("Enter Grade:  ");
            grade=input.next();
            switch (grade) {
                case "a" -> count_grades[0]++;
                case "b" -> count_grades[1]++;
                case "c" -> count_grades[2]++;
                case "d" -> count_grades[3]++;
            }


        }
        System.out.println("Grades: ");
        if(count_grades[0]>0)
        {
            System.out.println("Students With Grade A= "+count_grades[0]);
        }
        if(count_grades[1]>0)
        {
            System.out.println("Students With Grade B= "+count_grades[1]);
        }
        if(count_grades[2]>0)
        {
            System.out.println("Students With Grade C= "+count_grades[2]);
        }
        if(count_grades[3]>0)
        {
            System.out.println("Students With Grade D= "+count_grades[3]);
        }
    }
}

import java.util.Scanner;

class GradeBook{
    private String courseName;

    public void setGrades(int[][] grades) {
        this.grades = grades;
    }

    private int[][] grades;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GradeBook(String courseName, int student, int test)
    {
        this.courseName=courseName;
        if (student>0 && test>0)
        {
            this.grades=new int[student][test];
        }

    }

    public void processGrades()
    {
        outputGrades();

        System.out.println("Lowest grade in the grade book is: " + getMinimum());
        System.out.println("Highest grade in the grade book is: " + getMaximum());

        outputBarChart();
    }

    public int getMinimum()
    {
//        int lowGrade=grades[0][0];
//        for (int[] studentGrade: grades)
//        {
//            for (int grade: studentGrade)
//            {
//                if (grade<lowGrade)
//                {
//                    lowGrade=grade;
//                }
//            }
//        }
        int lowGrade=grades[0][0];
        for (int i=0;i<grades.length;i++)
        {
            for (int j=0;j<grades[i].length;j++)
            {
                if (grades[i][j]<lowGrade)
                {
                    lowGrade=grades[i][j];
                }
            }
        }
        return lowGrade;
    }

    public int getMaximum()
    {
        int highGrade=grades[0][0];
        for (int[] studentGrade: grades)
        {
            for (int grade: studentGrade)
            {
                if (grade>highGrade)
                {
                    highGrade=grade;
                }
            }
        }
        return highGrade;
    }

    public double getAverage(int[] setOfGrades)
    {
        int total=0;
        for (int grade: setOfGrades)
        {
            total+=grade;
        }
        return (double) total/setOfGrades.length;
    }

    public void outputBarChart()
    {
        System.out.println("Overall grade distribution:");

        int[] frequency=new int[11];

        for (int[] studentGrade: grades)
        {
            for (int grade: studentGrade)
            {
                ++frequency[grade/10];
            }
        }

        for (int count=0;count<frequency.length;count++)
        {
            if (count==10)
            {
                System.out.printf("%5d",100);
            }
            else
            {
                System.out.printf("%02d-%02d",count*10,count*10+9);
            }
            for (int star=0;star<frequency[count];star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void outputGrades()
    {
        System.out.println("The grades are:\n");
        System.out.print("              ");
        for (int test=0;test<grades[0].length;test++)
        {
            System.out.print("Test " + (test+1) + "\t");
        }

        System.out.println("Average");

        for (int student=0;student<grades.length;student++)
        {
            System.out.printf("Student %2d", student + 1);
            for (int test : grades[student]) {
                System.out.printf("%9d", test);
            }
            double average=getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
class Chap_7_15 {
    public static Scanner sc=new Scanner(System.in);
    public static void setGradeArray (int[][] gradeArray)
    {
        for (int i=0;i<gradeArray.length;i++)
        {
            System.out.println("Student "+ (i+1) + " data:");
            for (int j=0;j<gradeArray[i].length;j++)
            {
                System.out.print("Test " + (j+1) + " Marks: ");
                gradeArray[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Course Name: ");
        String courseName=sc.nextLine();
        System.out.println("Enter how many Student Grades do you want to enter: ");
        int student=sc.nextInt();
        System.out.println("Enter how many test Grades do you want to enter:");
        int test=sc.nextInt();
        int [][] gradeArray=new int[student][test];
        setGradeArray(gradeArray);
        GradeBook myGradeBook=new GradeBook(courseName,student,test);
        myGradeBook.setGrades(gradeArray);
        System.out.println("Welcome to grade Book for "+myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}


package task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int totalSubjects = scanner.nextInt();

        int totalMarks = 0;

        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / totalSubjects * 100;

        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
            
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage * 100 + "%");
        System.out.println("Grade: " + grade);
    }
    
}

    
    


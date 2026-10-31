import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("         STUDENT GRADE CALCULATOR       ");
        System.out.println("========================================");

        // Input: Number of subjects
        System.out.print("Enter the total number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int maxMarksPerSubject = 100;

        // Loop to take marks for each subject with validation
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
            int marks = scanner.nextInt();

            // Input validation ensuring marks are between 0 and 100
            while (marks < 0 || marks > maxMarksPerSubject) {
                System.out.print("Invalid input! Please enter marks between 0 and 100: ");
                marks = scanner.nextInt();
            }

            totalMarks += marks; // Accumulate total marks
        }

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Determine grade using conditional statements
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display results clearly
        System.out.println("\n----------------------------------------");
        System.out.println("              STUDENT RESULT            ");
        System.out.println("----------------------------------------");
        System.out.println("Total Marks Scored : " + totalMarks + " / " + (numSubjects * maxMarksPerSubject));
        System.out.printf("Average Percentage : %.2f%%\n", averagePercentage);
        System.out.println("Final Grade Assigned: " + grade);
        System.out.println("========================================");

        scanner.close();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Get the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Create arrays to store student names and marks
        String[] studentNames = new String[numStudents];
        int[][] studentMarks = new int[numStudents][numSubjects];

        // Input student names and marks
        for (int i = 0; i < numStudents; i++) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            studentNames[i] = scanner.nextLine();
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter " + studentNames[i] + "'s mark for subject " + (j + 1) + ": ");
                studentMarks[i][j] = scanner.nextInt();
            }
        }

        // Calculate average, highest, and lowest grade for each student
        double[] averageGrades = new double[numStudents];
        int[] highestGrades = new int[numStudents];
        int[] lowestGrades = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < numSubjects; j++) {
                sum += studentMarks[i][j];
                max = Math.max(max, studentMarks[i][j]);
                min = Math.min(min, studentMarks[i][j]);
            }
            averageGrades[i] = (double) sum / numSubjects;
            highestGrades[i] = max;
            lowestGrades[i] = min;
        }
//output results
        System.out.println("\nGrade Summary:");
        for (int i=0;i<numStudents;i++){
            System.out.println("Student:"+studentNames[i]);
            System.out.println("Average Grade:"+averageGrades[i]);
            System.out.println("Highest Grade:"+highestGrades[i]);
            System.out.println("Lowest Grade:"+lowestGrades[i]);
            System.out.println();


        }
        scanner.close();
}
}
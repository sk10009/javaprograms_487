//Write a program to create a Student result analyser where it asks the students name, marks in 3 subjects and then calculates the total marks, average marks, check if the student has passed or failed (pass mark is 40 in each subject) check whether the student got distinction check whether the student deserves a special award and display the final results.
public class StudentResult {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter marks for subject 1: ");
        int mark1 = scanner.nextInt();
        System.out.print("Enter marks for subject 2: ");
        int mark2 = scanner.nextInt();
        System.out.print("Enter marks for subject 3: ");
        int mark3 = scanner.nextInt();

        int totalMarks = mark1 + mark2 + mark3;
        double averageMarks = totalMarks / 3.0;

        boolean hasPassed = (mark1 >= 40) && (mark2 >= 40) && (mark3 >= 40);

        boolean hasDistinction = (averageMarks >= 75);

        boolean deservesSpecialAward = hasPassed && hasDistinction;

        System.out.println("\nStudent Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Has Passed: " + hasPassed);
        System.out.println("Has Distinction: " + hasDistinction);
        System.out.println("Deserves Special Award: " + deservesSpecialAward);

        scanner.close();
    }
    
}

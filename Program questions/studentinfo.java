//Write a program to collect info from student like, name, age, roll number and mark
import java.util.Scanner;

public class studentinfo {
    String name;
    int age;
    int rollnumber;
    double mark;
    
    void input() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter name:");
        name = s1.nextLine();
        System.out.println("Enter age:");
        age = s1.nextInt();
        System.out.println("Enter roll number:");
        rollnumber = s1.nextInt();
        System.out.println("Enter mark:");
        mark = s1.nextDouble();
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Mark: " + mark);
    }
    
    public static void main(String[] args) {
        studentinfo s1 = new studentinfo();
        s1.input();
        s1.display();
    }
}

//Write a program to take your name and age as input from the user and print them

import java.util.Scanner;

public class multinames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names:");
        String names[] = new String[5];
        for (int i = 0; i < 5; i++) 
            names[i] = sc.nextLine();
        for (int i = 0; i < 5; i++)
            System.out.println("Name " + (i + 1) + ": " + names[i]);
        
    }
}

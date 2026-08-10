//write a program to print your name 

import java.util.Scanner;

public class test {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello, " + name + "!");
    }
}

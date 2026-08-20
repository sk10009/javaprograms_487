//Write a java program to reverse a number
import java.util.Scanner;
public class revnum {
    public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter your number:");
    int num = sc.nextInt();
    int rev = 0;
    while(num!=0){
        int digit = num % 10;
        rev = rev*10 + digit;
        num = num/10;
    }
    System.out.println("The reversed number is: " + rev);
}
}

#Write a program to check the largest of three numbers
public class Main {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 15;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the largest number.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println(num3 + " is the largest number.");
        }
    }
    
}

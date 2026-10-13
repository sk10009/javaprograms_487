#write a program to print the multiplication table of a given number
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i = 1; i<= 10; i++){
            System.out.println(i + " X " + num + " = " + (i*num));
        }
        system.out.println("End");
    }
    
}

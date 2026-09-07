//write a program to remove duplicates from an integer array in Java
public class DelDupes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};
        System.out.println("Original Array: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
        int[] uniqueArr = removeDuplicates(arr);
        
        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}

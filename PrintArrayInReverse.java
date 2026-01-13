import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int arraySize = scan.nextInt();
        int array[] = new int[arraySize];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        
        System.out.print("The array in reverse order is: ");
        
        for(int i = arraySize - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        
        
    }
}

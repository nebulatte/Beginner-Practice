import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int arraySize = scan.nextInt();
        int array[] = new int[arraySize];
        int minNum = 0;
        
        System.out.println("Enter elements of array:");
        for(int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
            if(arraySize == 1) {
                minNum = array[i];
                break;
            }
            if(array[i] < minNum) {
                minNum = array[i];
            }
        }
        
        
        
        System.out.printf("Minimum element in array is: %d", minNum);
        
    }
}

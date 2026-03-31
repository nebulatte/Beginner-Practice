import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("======== Largest in an Array ========");
        System.out.println();
        
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }
        
        int largestInArray = largestInArray(size, array);
        System.out.print("The largest number in the array is " + largestInArray);
        
        scan.close();
        
    }
    
    public static int largestInArray(int parSize, int[] parArray) {
        
        int largest = parArray[0];
        
        for(int i = 1; i < parSize; i++) {
            if(parArray[i] > largest) {
                largest = parArray[i];
            }
        }
        
        return largest;
        
    }
    
}

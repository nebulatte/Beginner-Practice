import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("===== ARRAY SORTING =====");

        System.out.print("Enter the size of the 1-D array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
        }

        // Sorting the array

        int temp;
        boolean sorted = false;
        while(!sorted) {
            int arranged = 0;
            for(int i = 0; i < size - 1; i++) {
                if(array[i] > array[i+1]) {

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    arranged++;

                }
            }
            if(arranged == 0) {
                sorted = true;
            }
        }

        // Printing the sorted array
        System.out.print("The sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }

        scan.close();

    }

}

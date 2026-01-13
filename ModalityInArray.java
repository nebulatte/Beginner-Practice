import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int numOfValues;
        
        do {
            System.out.print("Enter number of values (3 to 15): ");
            numOfValues = scan.nextInt();
        } while(numOfValues < 3 || numOfValues > 15);
        
        int array[] = new int[numOfValues];
        
        System.out.printf("Enter %d integer values:\n", numOfValues);
        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        
        System.out.println();
        
        boolean modeFound = false;
        int modeCount = 0;
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < i; j++) {
                
                if(array[j] == array[i]) {
                    
                    if(modeFound == false) {
                        System.out.print("Mode value(s): ");
                        modeFound = true;
                    }
                    
                    System.out.printf("%d ", array[j]);
                    modeCount++;
                    
                }
                
            }
        }
        
        if(modeCount == 0) {
            System.out.print("NO MODE. All values appear once.");
        } else if (modeCount == 1) {
            System.out.print("\nUnimodal");
        } else {
            System.out.print("\nBimodal or Multimodal");
        }
        
        
        
    }
}

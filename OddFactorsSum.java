import java.util.*;

public class OddFactorsSum {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("SUM OF ALL ODD FACTORS\n\n");
        
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        int sum = 0;
        
        System.out.print("The factors of " + num + " are: ");
        
        for (int i = 1; i <= num; i++) { //loop to get the factors of num from 1 to num
            
            if (num % i == 0) { //isolate the factors of num
                
                System.out.print(i + " "); //printing the factors of num
                
                if (i % 2 == 1) { //determines an odd factor
                    
                    sum += i; //adds the odd factors together
                    
                }
                
            }
            
        }
        
        System.out.print("\nThe sum of the odd factors of " + num + " is " + sum); //prints the sum of odd factors
        
    }
}

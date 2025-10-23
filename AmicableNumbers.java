import java.util.Scanner; 

public class AmicableNumbers { 
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("AMICABLE NUMBERS\n\n"); 
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        
        int sum1 = 0, sum2 = 0;
        
        System.out.print("\nFactors of " + num1 + ": ");
        for (int i = 1; i < num1; i++) {
            
            if (num1 % i == 0) {
                System.out.print(i + " ");
                sum1 += i;
            }
            
        }
        
        System.out.print("\nThe sum of these factors is: " + sum1 + '\n');
        
        System.out.print("\nFactors of " + num2 + ": ");
        for (int i = 1; i < num2; i++) {
            
            if(num2 % i == 0) {
                System.out.print(i + " ");
                sum2 += i;
            }
            
        }
        
        System.out.print("\nThe sum of these factors is: " + sum2 + '\n');
        
        System.out.println();
        
        if (num1 == sum2 && num2 == sum1) {
            System.out.print(num1 + " and " + num2 + " are amicable numbers!");
        } else {
            System.out.print(num1 + " and " + num2 + " are not amicable numbers!");
        }
        
    }
}

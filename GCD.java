import java.util.Scanner; 

public class GCD { 
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("GREATEST COMMON DIVISOR\n\n"); 
        System.out.print("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scan.nextInt();
        
        int limit, gcd = 1;
        
        if (num1 > num2) {
            limit = num1;
        } else {
            limit = num2;
        }
        
        for (int i = 1; i <= limit; i++) {
            
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            
        }
        
        System.out.print("The greatest common divisor is " + gcd);
        
    }
}

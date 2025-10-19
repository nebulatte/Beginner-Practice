import java.util.*;

class StrongNumber {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int num, sum = 0;
        
        System.out.println("STRONG NUMBER CHECKER\n");
        System.out.print("Enter a number: ");
        
        num = scan.nextInt();
        int temp = num, numDupe = num;
        
        while (numDupe != 0) {
            
            temp = numDupe % 10;
            int product = 1;
            
            for (int i = 0; i < temp; i++) {
                
                product = product * (temp - i);
                
            }
            
            sum += product;
            numDupe /= 10;
            
        }
        
        if (num == sum) {
            System.out.print(num + " is a strong number!");
        } else {
            System.out.print(num + " is not a strong number.");
        }
        
    }
}

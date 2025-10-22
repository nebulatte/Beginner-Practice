import java.util.Scanner; 

public class FibonacciSeries { 
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("DISPLAYING FIBONACCI SERIES UP TO N TERMS\n\n"); 
        System.out.print("Enter a number: ");
        
        int n = scan.nextInt();
        int a = 0, b = 1, temp;
        
        for (int i = 1; i <= n; i++) {
            
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
            
        }
        
    }
}

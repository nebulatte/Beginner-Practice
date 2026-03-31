import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("======== MULTIPLICATION TABLE ========");
        System.out.print("Enter a number(1-10): ");
        int num;
        
        while(true) {
            
            num = scan.nextInt();
            
            if(num >= 1 && num <= 10) {
                break;
            }
            System.out.print("Invalid number. Enter a number from 1 to 10: ");
            
        }
        
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        
    }
}

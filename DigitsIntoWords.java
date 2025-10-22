import java.util.Scanner; 

public class DigitsIntoWords { 
    public static void main(String[] args) { 
        
        Scanner scan = new Scanner(System.in); 
        
        System.out.print("DISPLAYING DIGITS INTO WORDS\n\n"); 
        System.out.print("Enter a number: "); 
        
        int num = scan.nextInt(); String words = ""; 
        
        while (num != 0) { 
            int i = num % 10; 
            
            switch (i) { 
                case 0: words = " Zero" + words; break; 
                case 1: words = " One" + words; break; 
                case 2: words = " Two" + words; break; 
                case 3: words = " Three" + words; break; 
                case 4: words = " Four" + words; break; 
                case 5: words = " Five" + words; break; 
                case 6: words = " Six" + words; break; 
                case 7: words = " Seven" + words; break; 
                case 8: words = " Eight" + words; break; 
                case 9: words = " Nine" + words; break; 
                
            } 
            
        num /= 10; 
            
        } 
        
        System.out.print(words); 
        
        }
}

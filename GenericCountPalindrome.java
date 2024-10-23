import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericCountPalindrome {
    
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }
        
        int palindromeCount = 0;

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromeCount++;
            }
        }
        
        System.out.println("Number of palindromes: " + palindromeCount);
        
        scanner.close();
    }
}

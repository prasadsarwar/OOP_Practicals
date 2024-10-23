import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenericCountPrime {
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        int primeCount = 0;

        for (int number : numbers) {
            if (isPrime(number)) {
                primeCount++;
            }
        }
        
        System.out.println("Number of prime numbers: " + primeCount);
        
        scanner.close();
    }
}

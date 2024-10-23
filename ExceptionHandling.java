import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Num1: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter Num2: ");
            int num2 = scanner.nextInt();

            int[] numbers = {num1, num2};

            System.out.print("Enter index to access (0 or 1): ");
            int index = scanner.nextInt();
            System.out.println("Accessed value: " + numbers[index]);

            int result = num1 / num2;
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
            
        } catch (Exception e) {
            System.out.println("Error: Invalid input.");
            
        } finally {
            scanner.close();
        }
    }
}

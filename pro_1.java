import java.util.Scanner;

public class pro_1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("You entered: " + number);
        
        scanner.close();
    }
}
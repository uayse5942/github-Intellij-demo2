import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = kb.nextInt();
        if (isPrime(number))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;  // numbers <= 1 are not prime
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;  // divisible by another number
        }
        return true;  // no divisors found → prime
    }
}

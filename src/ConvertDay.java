import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object
        Scanner kb = new Scanner(System.in);
        // Step 2: Ask the user for input
        System.out.print("Enter a number between 1 and 7: ");
        int num = kb.nextInt();
// Step 3: Use if-else structure to determine the day // ca use case also
        if (num == 1)
            System.out.println("Day: Monday");
        else if (num == 2)
            System.out.println("Day: Tuesday");
        else if (num == 3)
            System.out.println("Day: Wednesday");
        else if (num == 4)
            System.out.println("Day: Thursday");
        else if (num == 5)
            System.out.println("Day: Friday");
        else if (num == 6)
            System.out.println("Day: Saturday");
        else if (num == 7)
            System.out.println("Day: Sunday");
        else
            System.out.println("Invalid value! Please enter 1–7.");
    }
}

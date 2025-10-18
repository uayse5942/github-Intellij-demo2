import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
       // Step 1: Create Scanner object
          Scanner kb = new Scanner(System.in);
       // Step 2: Display the menu
         System.out.println("Coffee Shop Menu:");
         System.out.println("Enter A for Americano");
         System.out.println("Enter C for Cappuccino");
         System.out.println("Enter L for Latte");
         System.out.println("Enter E for Espresso");
         System.out.print("Enter your choice: ");

        // Step 3: Read first character of user input
        char tempStr = kb.next().charAt(0);
        //char choice = tempStr.charAt(0);
        // Step 4: Use switch-case to determine the cost
        switch (tempStr) {
            case 'A':   System.out.println("Cost of Americano: $3.00");break;
            case 'C':   System.out.println("Cost of Cappuccino: $3.75");break;
            case 'L':   System.out.println("Cost of Latte: $4.00");break;
            case 'E':   System.out.println("Cost of Espresso: $2.50");break;
            default :   System.out.println("Invalid choice. Please select a valid menu item.");
        }
    }
}

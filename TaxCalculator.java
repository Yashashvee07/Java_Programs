import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = 0.0;

        if (income < 10000) {
            tax = 0.0;
        } else if (income >= 10000 && income < 20000) {

            tax = 0.10 * (income - 10000);
        } else if (income >= 20000 && income < 30000) {

            tax = (0.10 * 10000) + 0.15 * (income - 20000);
        } else {

            tax = (0.10 * 10000) + (0.15 * 10000) + 0.25 * (income - 30000);
        }

        System.out.println("Your income: $" + income);
        System.out.println("Income tax: $" + tax);
        
        scanner.close();
    }
}

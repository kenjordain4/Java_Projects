package mortgage_calculator;

import java.util.Scanner;

public class mortgage_console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){
        System.out.println(prompt);
        return scanner.nextDouble();
    }
    // 📥 Input validation
    public static double readNumber(String prompt, double min, double max) {
        double value;
        while (true) {
            System.out.print(prompt);

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input, enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }

            value = scanner.nextDouble();

            if (value >= min && value <= max)
                break;

            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}

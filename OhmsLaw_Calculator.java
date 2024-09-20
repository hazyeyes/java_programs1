import java.util.*;

public class OhmsLaw_Calculator {

    public static void main(String[] args) {
        Calculator();
    }

    static Scanner scan() {
        return new Scanner(System.in);
    }

    public static void Calculator() {
        Scanner scan = scan();
        String userString = userInp();
        double result;
        double voltage;
        double current;
        double resistance;

        System.out.println("Ohm's Law Calculator");
        System.out.println("     / \\     ");
        System.out.println("    / V \\    ");
        System.out.println("   /-----\\   ");
        System.out.println("  / I | R \\  ");
        System.out.println(" ----------- ");

        if (userString.equals("V")) {
            System.out.println("Enter the necessary values:");
            System.out.print("Current: ");
            current = scan.nextDouble();
            System.out.print("Resistance: ");
            resistance = scan.nextDouble();
            result = multiply(current, resistance);
            System.out.println("--------------------------");
            System.out.printf("The Voltage is " + result + " Volts. \n(Current: " + current + " Amperes | Resistance: " + resistance + " Ohms)\n");
            additional();
        } else if (userString.equals("I")) {
            System.out.println("Enter the necessary values:");
            System.out.print("Voltage: ");
            voltage = scan.nextDouble();
            System.out.print("Resistance: ");
            resistance = scan.nextDouble();
            result = divide(voltage, resistance);
            System.out.println("--------------------------");
            System.out.printf("The Current is " + result + " Amperes. \n(Voltage: " + voltage + " Volts | Resistance: " + resistance + " Ohms)\n");
            additional();
        } else if (userString.equals("R")) {
            System.out.println("Enter the necessary values:");
            System.out.print("Voltage: ");
            voltage = scan.nextDouble();
            System.out.print("Current: ");
            current = scan.nextDouble();
            result = divide(voltage, current);
            System.out.println("--------------------------");
            System.out.printf("The Resistance is " + result + " Ohms \n(Voltage: " + voltage + " Volts | Current: " + current + " Amperes)\n");
            additional();
        }
    }

    static String userInp() {
        Scanner scanner = scan();
        String userInput;

        HashSet<String> comp = new HashSet<>();
        comp.add("V");
        comp.add("I");
        comp.add("R");

        System.out.print("What do you want to solve?\n(\"V\" for Voltage | \"I\" for Current | \"R\" for Resistance): ");
        userInput = scanner.nextLine().toUpperCase();

        if (!comp.contains(userInput)) {
            System.out.println("Please enter a valid value.");
            System.out.println("--------------------------");
            System.out.println("");
            return userInp();
        }
        return userInput;
    }

    static double multiply (double x, double y) {
        while (true) { 
            try {
                return x * y;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric value.");
            }
        }
    }

    static double divide (double x, double y) {
        while (true) { 
            try {
                if (y == 0) {
                    System.out.println("Invalid input. Division by zero is not allowed.");
                    return Double.NaN; 
                }
                return x / y;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a numeric value.");
            }
        }
    }

    static void additional() {
        Scanner scan = scan();
        String ask_user;

        System.out.print("Do you want to calculate again? (y/n): ");
        ask_user = scan.nextLine().toLowerCase();

        if (ask_user.equals("y")) {
            System.out.println("--------------------");
            System.out.println("");
            Calculator();
        } else if (ask_user.equals("n")) {
            System.out.println("Exiting the program. Goodbye!");
            scan.close(); 
            System.exit(0); 
        } else {
            System.out.println("Enter \"y\" or \"n\".");
            additional(); 
        }
    }
}
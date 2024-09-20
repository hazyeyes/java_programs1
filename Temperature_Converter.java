import java.util.*;

public class Temperature_Converter {
    public static void main(String[] args) {
        Conversion();
    }

    static Scanner scan() {
        return new Scanner(System.in);
    }

    public static void Conversion() {
        Scanner user_choice = scan();
        String conv_input;
        double temperature_input = temp_input();
        double temperature_result;

        System.out.print("Conversion Method: A. Celsius to Fahrenheit | B. Fahreheit to Celcius: ");
        user_choice = scan();

        conv_input = user_choice.nextLine().toUpperCase();

        if (conv_input.equals("A")) {
            temperature_result = (temperature_input * (9/5)) + 32;
            System.out.println("The temperature is " + temperature_result + " Fahrenheit.");
            additional();
        } else if (conv_input.equals("B")) {
            temperature_result = (temperature_input - 32) * (5/9);
            System.out.println("The temperature is " + temperature_result + " Celsius.");
            additional();
        } else {
            System.out.println("--------------------");
            System.out.println("");
            System.out.println("Enter a valid input.");
            Conversion();
        }

        user_choice.close();
    }

    static double temp_input() {
        double temperature;
        Scanner user_temp = scan();

        user_temp = scan();

        while (true) { 
            try {
                System.out.print("Enter the temperature: ");
                temperature = Double.parseDouble(user_temp.nextLine());
                return temperature;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                System.out.println("--------------------");
                System.out.println("");
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
            Conversion();
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

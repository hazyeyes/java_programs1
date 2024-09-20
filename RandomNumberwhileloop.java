import java.util.*;

public class RandomNumberwhileloop {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        int random = random(); // Generate a random number
        int guess;
        int guessCount = 0; // Initialize guess counter

        // Start the guessing loop
        do {
            guess = user_num(); // Get user input
            guessCount++; // Increment guess count
            checker(random, guess, guessCount); // Check the guess
        } while (guess != random); // Continue until the guess is correct
    }

    static int random() {
        Random rand = new Random();
        return rand.nextInt(100); // Generate a random integer between 0 and 99
    }

    static int user_num() {
        Scanner scan = new Scanner(System.in);
        int userInp;

        System.out.print("Enter a random integer from 1 - 100: ");
        userInp = scan.nextInt();

        // Validate input
        while (userInp > 100 || userInp < 1) {
            System.out.print("Please enter an integer from 1 - 100: ");
            userInp = scan.nextInt();
        }

        return userInp; // Return the valid input
    }

    static void checker(int number, int guess, int guessCount) {
        if (number == guess) {
            System.out.println("------------------");
            System.out.println("Congratulations! You win.");
            System.out.println("The correct number was: " + number);
            System.out.println("Total guesses: " + guessCount);
            System.out.println("------------------");
        } else {
            System.out.println("------------------");
            System.out.println("Try again.");
            System.out.println("Your guess: " + guess);
            System.out.println("Total guesses so far: " + guessCount);
            System.out.println("------------------");
        }
    }
}


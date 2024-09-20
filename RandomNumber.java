import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        start();
    }

    static void start() {
        int random = random();
        int user_num = user_num();

        checker(random,user_num,1);
    }
    static int random() {
        Random rand = new Random();
        int randInt = rand.nextInt(0,100);
        return randInt;
    }

    static int user_num() {
        Scanner scan = new Scanner(System.in);
        int user_inp; 

        System.out.print("Enter a random integer from 1 - 100: ");
        user_inp = scan.nextInt();

        if (user_inp > 100 || user_inp < 1) {
            System.out.print("Please enter an integer from 1 - 1000");
            return user_num();
        } else {
            return user_inp;
        }
    }

    static void checker(int number, int guess, int guessCount) {
        if (number == guess) {
            System.out.println("------------------");
            System.out.println("Congratulations! You win.");
            System.out.println(number);
            System.out.println("Total guesses: " + guessCount);
            System.out.println("------------------");

        } else{
            System.out.println("------------------");
            System.out.println("Try again.");            
            System.out.println(number);
            System.out.println("Total guesses: " + guessCount);
            System.out.println("------------------");
            guessCount ++;
            guess = user_num();
            checker(number,guess,guessCount);
        }
    }
}

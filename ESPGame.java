import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int correct = 0;
        int mistake = 0;
        String user_color;
        int user_number;
        for (int i = 1; i <= 10; i++) { 

            String randomColor = color_rand();
            int randomNumber = rand_num();
            Pair pair = pair_dic(randomColor, randomNumber);
            
            System.out.print("Enter your color guess (\"Red\", \"Greem\", \"Blue\", \"Orange\", \"Yellow\"): ");
            user_color = scan.nextLine();
            
            System.out.print("Enter you number guess: ");
            user_number = scan.nextInt();

            System.out.println("----------------------------------------------------------------------------");

            Pair user_pair = pair_dic(user_color, user_number);

            if (user_pair.getColor().equals(pair.getColor()) && user_pair.getNumber() == pair.getNumber()) {
                System.out.println("Correct!");
                correct++;
                System.out.println("----------------------------------------------------------------------------");
            } else {
                System.out.println("Wrong! The correct answer was: " + pair);
                mistake++;
                System.out.println("----------------------------------------------------------------------------");
            }
        }
        System.out.println("Total number of correct answers: " + correct);
        System.out.println("Total number of wrong answers: " + mistake);

        scan.close();

    }
    
    static List<String> color() {
        HashSet<String> comp = new HashSet<>();
        comp.add("Red");
        comp.add("Green");
        comp.add("Blue");
        comp.add("Orange");
        comp.add("Yellow");

        return new ArrayList<>(comp);
    }

    static String color_rand() {
        List<String> colorList = color(); 
        Random rand = new Random();
        int randomIndex = rand.nextInt(colorList.size()); 
        return colorList.get(randomIndex); 
    }

    static int rand_num() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    static Pair pair_dic(String x, int y) {
        return new Pair(x, y);
    }
}

class Pair {
    private String color;
    private int number;

    public Pair(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Number: " + number;
    }
}
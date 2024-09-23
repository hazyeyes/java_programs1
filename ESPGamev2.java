import java.util.*;

public class ESPGamev2 {
    static int corr_num = 0;
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            espgame();
        }
        System.out.println("You correctly guessed the colors " + corr_num + " times.");
    }    
    
    static void espgame() {
        Scanner scan = new Scanner(System.in);
        String user_input;

        HashMap<String, Boolean> colorDictionary = new HashMap<>();
        colorDictionary.put("Red", true);
        colorDictionary.put("Green", true);
        colorDictionary.put("Blue", true);
        colorDictionary.put("Orange", true);
        colorDictionary.put("Yellow", true);
        
        System.out.print("Enter a color: ");
        user_input = capitalizeFirstLetter(scan.nextLine());

        if (colorDictionary.containsKey(user_input)) {
            String color = color_select(); 
            if (user_input.equals(color)) {
                System.out.println("Congratulations! You got it right.\nThe color is " + color);
                corr_num++; 
            } else {
                System.out.println("Incorrect! Try again.\nThe color is " + color);
            } 
        } else {
            System.out.println("Enter a valid input.");
            espgame(); 
        }
    }

    static String color_select() {
        int num = rand_num();
        String color;
        if (num == 0) {
            color = "Red";
        } else if (num == 1) {
            color = "Green";
        } else if (num == 2) {
            color = "Blue";
        } else if (num == 3) {
            color = "Orange";
        } else {
            color = "Yellow";
        }
        return color;
    }

    static int rand_num() {
        Random rand = new Random();
        return rand.nextInt(5);
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
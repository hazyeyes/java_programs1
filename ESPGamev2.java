import java.util.*;

public class ESPGamev2 {
    
    public static void main(String[] args) {
        espgame();
    }    
    
    static void espgame() {
        Scanner scan = new Scanner (System.in);
        String color = color_select();
        String user_input;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter a color: ");
            user_input = capitalizeFirstLetter(scan.nextLine());
            if (user_input.equals(color)) {
                System.out.println("Congratulations! You get it right.\nThe color is " + color);
            } else {
                System.out.println("Incorrect! Try again.\nThe color is " + color);
            }
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
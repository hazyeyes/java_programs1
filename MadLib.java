import java.util.*;

public class MadLib {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        String adverb, type_of_con, adjective_1, adjective_2;
        String something_icky, animal_1, noun, silly_word_1;
        String plural_noun_1, verb_ing, adjective_3, silly_word_2;
        String type_of_food, plural_noun_2, animal_2, foreign_country;

        System.out.println("====================================================");
        System.out.println("");
        System.out.println("              WHAT NOT TO EAT FOR LUNCH             ");
        System.out.println("");
        System.out.println("====================================================");

        System.out.println("Everyone knows that kids who eat junkfood turn out ______________.");
        System.out.print("ADVERB >>> ");
        adverb = scan.nextLine().toLowerCase();
        System.out.println("Everyone knows that kids who eat junkfood turn out " + adverb +".");
        System.out.println("Make sure your lunch ______________ is filled with nutritious, ______________ food.");
        System.out.print("TYPE OF CONTAINERS >>> ");
        type_of_con = scan.nextLine().toLowerCase();
        System.out.print("ADJECTIVE >>> ");
        adjective_1 = scan.nextLine().toLowerCase();
        System.out.println("Make sure your lunch " + type_of_con + " is filled with nutritious, " + adjective_1 + " food.");
        System.out.println("Do not go to the ______________ food stand accross the street from your school.");
        System.out.print("ADJECTIVE >>> ");
        adjective_2 = scan.nextLine().toLowerCase();
        System.out.println("Do not go to the " + adjective_2 + " food stand accross the street from your school.");
        System.out.println("The hamburgers they serve are fried in ______________ and are made of ______________ meat.");
        System.out.print("SOMETHING ICKY >>> ");
        something_icky = scan.nextLine().toLowerCase();
        System.out.print("ANIMAL >>> ");
        animal_1 = scan.nextLine().toLowerCase();
        System.out.println("The hamburgers they serve are fried in " + something_icky + " and are made of " + animal_1 + " meat.");
        System.out.println("The hot dogs contain chemicals such as hydrogenated ______________ and sodium ______________.");
        System.out.print("NOUN >>> ");
        noun = scan.nextLine().toLowerCase();
        System.out.print("SILLY WORD >>> ");
        silly_word_1 = scan.nextLine().toLowerCase();
        System.out.println("The hot dogs contain chemicals such as hydrogenated " + noun + " and sodium " + silly_word_1 + ".");
        System.out.println("And they are made from ground-up ______________.");
        System.out.print("PLURAL NOUN >>> ");
        plural_noun_1 = scan.nextLine().toLowerCase();
        System.out.println("And they are made from ground-up " + plural_noun_1 +".");
        System.out.println("If you spend time ______________ around those places, you will get fat and ______________, and people will call you a/an ______________.");
        System.out.print("VERB ENDING IN \"ING\" >>> ");
        verb_ing = scan.nextLine().toLowerCase();
        System.out.print("ADJECTIVE >>> ");
        adjective_3 = scan.nextLine().toLowerCase();
        System.out.print("SILLY WORD >>> ");
        silly_word_2 = scan.nextLine().toLowerCase();
        System.out.println("If you spend time " + verb_ing + " around those places, you will get fat and " + adjective_3 + ", and people will call you a/an " + silly_word_2 + ".");
        System.out.println("So take a sandwich made of chicken or turkey, or lettuce, ______________, and ______________.");
        System.out.print("TYPE OF FOOD >>> ");
        type_of_food = scan.nextLine().toLowerCase();
        System.out.print("PLURAL NOUN >>> ");
        plural_noun_2 = scan.nextLine().toLowerCase();
        System.out.println("So take a sandwich made of chicken or turkey, or lettuce, " + type_of_food + ", and " + plural_noun_2 + ".");
        System.out.println("And drink healthy ______________ milk instead of cola drinks.");
        System.out.print("ANIMAL >>> ");
        animal_2 = scan.nextLine().toLowerCase();
        System.out.println("And drink healthy " + animal_2 + " milk instead of cola drinks.");
        System.out.println("If you eat good food, you might grow up to become president of ______________.");
        System.out.print("FOREIGN COUNTRY >>> ");
        foreign_country = scan.nextLine().toLowerCase();
        System.out.println("If you eat good food, you might grow up to become president of " + foreign_country + ".");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("====================================================");
        System.out.println("");
        System.out.println("              WHAT NOT TO EAT FOR LUNCH             ");
        System.out.println("");
        System.out.println("====================================================");
        System.out.println("Everyone knows that kids who eat junkfood turn out " + adverb +".");
        System.out.println("Make sure your lunch " + type_of_con + " is filled with nutritious");
        System.out.println( adjective_1 + " food. Do not go to the " + adjective_2 + " food");
        System.out.println("stand accross the street from your school. The hamburgers they serve are fried");
        System.out.println("in " + something_icky + " and are made of " + animal_1 + " meat. The hot dogs");
        System.out.println("contain chemicals such as hydrogenated " + noun + " and sodium");
        System.out.println(silly_word_1 + ". And they are made from ground-up " + plural_noun_1 + ".");
        System.out.println("If you spend time " + verb_ing + " around those places, you will get fat");
        System.out.println("and " + adjective_3 + ", and people will call you a/an " + silly_word_2 + ".");
        System.out.println("So take a sandwich made of chicken or turkey, or lettuce, " + type_of_food + ",");
        System.out.println("and " + plural_noun_2 + ". And drink healthy " + animal_2 + " milk instead");
        System.out.println("of cola drinks. If you eat good food, you might grow up to become president of");
        System.out.println(foreign_country);
        System.err.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(">>> DONE");
    }
}

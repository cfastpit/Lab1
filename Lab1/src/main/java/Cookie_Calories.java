
import java.util.Scanner;

public class Cookie_Calories {

    /*
    A bag of cookies holds 40 cookies.
    10 servings in the bag 
    a serving equals 300 calories
     lets the user enter the number of cookies they ate
    then reports the total number of calories consumed
     */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the amount of cookies consumed");
        double number_Of_Cookies = keyboard.nextDouble();
        final int BAG = 40;
        final double SERVINGS_IN_BAG = 10;
        final int COOKIE_CALORIES = 300;
        double calories_consumed = number_Of_Cookies * COOKIE_CALORIES;
        double servings = number_Of_Cookies / SERVINGS_IN_BAG;
        double ate_In_Bag = number_Of_Cookies / BAG;

        System.out.println("The number of cookies you ate\t" + number_Of_Cookies + " Cookies");
        System.out.println("servings in a bag \t\t" + SERVINGS_IN_BAG + " Cookies");
        System.out.println("1 cookie = \t\t\t" + COOKIE_CALORIES + " Calories");
        System.out.println("You consume\t\t\t" + calories_consumed + " Calories");
        System.out.println("The number of servings you ate\t" + servings);
        System.out.println("The number of bags you ate\t" + ate_In_Bag);
    }
}


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Sales_Tax {

    /*  Write a program that will ask the user to enter the amount of a purchase. 
     State sales tax is 4 percent 
    county sales tax is 2 percent
display the amount of the 
    -purchase, 
    -the state sales tax, 
    -the county sales tax, 
    -the total sales tax,*/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the amount of the purchase");
        double purchase = keyboard.nextDouble();

        final double STATE_SALES_TAX = 0.04;
        final double COUNTY_SALES_TAX = 0.02;

        double stateTax = purchase * STATE_SALES_TAX;
        double countyTax = purchase * COUNTY_SALES_TAX;
        double total = stateTax + countyTax + purchase;
        System.out.println("Purchase\t" + "$" + purchase);
        System.out.println("state Tax \t" + "$" + stateTax);
        System.out.println("County Tax\t" + "$" + countyTax);
        System.out.println("Total\t\t" + "$" + total);
    }
}

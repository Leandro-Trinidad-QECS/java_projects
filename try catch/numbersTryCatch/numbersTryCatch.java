import java.util.Scanner; // scanner class for geting user inputing

// used for creating lists and dictionary
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import java.text.DecimalFormat; // used for formatting the money

public class numbersTryCatch {
// main class


//creates a scanner to get user input
public static Scanner input = new Scanner(System.in);

public static void main(String[] args) throws Exception {

        //places items in the dictionary that is in the Inforation class
        Information.market.put("Apples",10); // Information.market.put(name of item, item amount)
        Information.market.put("Oranges",20);
        Information.market.put("bannanas",16);

        //declaires variable for the users money
        String money_amount;

        // gets how much money the user has
        // checks to see if the user input is a double
        // if not exits the program
        int i = 0; // use to count the amount of tries
        while (true) {
                System.out.print("type 'exit' to exit\nHow much money do you have ['50.65']: ");
                money_amount = input.next();
                if (Information.catchArgs(money_amount)) {
                        i = 0;
                        break;
                } else if (i >= 2) { //if the user types incorrectly 3 times kicks out of the program
                        System.out.println("Maybe you can type later");
                        System.exit(0);
                } else {
                        System.out.println("Try Again");
                        i++;
                }
        }

        //asks the user what item they want and the amount of items
        int hello;
        int amount;
        do {
                Information.print_opt(Information.market);
                hello = Information.getOptions("type 'done' when finished\nMarket");
                if (hello != 666) {
                        amount = Information.getOptions("Amount of items");
                }
        } while(hello != 666); // 666 is the exit code


        // packs the items in a box
        //TODO: packs the item in a box





}



}

import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


import java.text.DecimalFormat;

public class numbersTryCatch {



//creates a scanner to get user input
public static Scanner input = new Scanner(System.in);

public static void main(String[] args) throws Exception {

        Information.market.put("Apples",10); // (name of item in the market)(How many items there are)
        Information.market.put("Oranges",20);
        Information.market.put("bannanas",16);
        //vars
        String money_amount;

        //try catch statement
        int i = 0;
        while (true) {
                System.out.print("type 'exit' to exit\nHow much money do you have ['50.65']: ");
                money_amount = input.next();
                if (Information.catchArgs(money_amount)) {
                        i = 0;
                        break;
                } else if (i >= 2) {
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

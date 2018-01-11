
import java.util.Scanner; // Scanner gets user input

//creates lists and dictionaries using maps
import java.util.HashMap;

import java.util.Map;

//creates decimal formatting
import java.text.DecimalFormat;


public class Information {
//stores error checking and information of the fruit diameter and amounts

// creates a dictionary called market that will store the name of the item and the item amount
public static Map<String, Integer> market = new HashMap<String, Integer>();

//Instance variables from Receiving Department
public static final double appleCost = 1.3465;
public static final double appleDiameter = 7.2;
public static final double orangeCost = 2.315468;
public static final double orangeDiameter = 7.2;
public static final double chocolateBoxCost = 6.1235874;
public static final double chocolateBoxWidth = 5;
public static final double chocolateBoxLength = 5;
public static final double chocolateBoxHeight = 5;
//All values statistically verified with Normal Distribution
//Easy caliper or ruler measures

//Instance Variables from Box Company
//Variables about the box to pack Spheres in, conversion from inches
public static final double box1Width = 1.5 * 12 * 2.54; //Traditional math definition (smallest in 2D)
public static final double box1Length = 2.0 * 12 * 2.54; //Traditional math definition (longest in 2D)
public static final double box1Height = 1 * 12 * 2.54; //Traditional math definition (3D Dimension)


public static Scanner input = new Scanner(System.in);


public static Boolean catchArgs(Object money) throws Exception {
        // checks if the money is an Integer or not
        try {
                Double.parseDouble(String.valueOf(money));
                return true;
        } catch (Exception e) {
                if(String.valueOf(money).equals("exit")) { // exits the program when the user types exit
                        System.out.println("bye");
                        System.exit(0);
                }
                return false;
        }
}

public static int getOptions(String optionName) throws Exception { // gets the user input
        //gets the user input of options

        int option_int = 0;
        while(true) {
                String options = "";
                System.out.print(optionName + ": ");
                try {
                        options = input.next();
                        try {
                                option_int = Integer.parseInt(options);
                                break;
                        } catch (Exception e) {
                                if (options.equals("exit")) {
                                        System.out.println("bye");
                                        System.exit(0);
                                }
                                if (options.equals("done")) {
                                        return 666;
                                }
                                System.out.println("Thats not right");
                        }
                } catch (Exception e) {
                        System.out.println(String.format("[!] %s", e));
                }

        }
        return option_int;

}



public static String formatMoney(Object money, boolean print) {
        //formats the money to two decimal places
        // cna print

        DecimalFormat df;
        //turns object to string
        String money_string = money.toString();
        //turns string to double
        double money_double = Double.parseDouble(money_string);

        //decimal format
        if (print) {
                df = new DecimalFormat("$#.00");
        } else {
                df = new DecimalFormat("#.00");
        }
        //formats the double & returns it
        String return_string = df.format(money_double);
        // double return_double = Double.parseDouble(return_string);
        return return_string;
}

public static boolean isInt(Object num) throws Exception {
        //checks if object is an Integer if its a string or double sends false
        try {
                Integer.parseInt((String) num);
                return true;
        }
        catch (Exception e) {
                return false;
        }

}

public static void print_opt(Map<String, Integer> mp) throws Exception {
        //prints a dictionary in this formatting
        //
        // Market:
        // [0] Item 1
        // [1] Item 2
        // [3] Item 3


        int numbering; // used for numbering the items
        System.out.println("\nMarket:");
        System.out.print("------\n");

        numbering = 0;
        for (String key : mp.keySet()) {
                // use the key here
                System.out.println(String.format("[%d] %s", numbering, key));
                numbering++;
        }
        System.out.println("type 'exit' to exit");
        System.out.println("----------");
}
public static String printMoney (double money) {
    String pM = String.format ("$%.2f", money);
    System.out.println("Current Money output is " + pM);
    return pM;
  }
}

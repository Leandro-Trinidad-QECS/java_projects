
import java.util.Scanner; // Scanner gets user input

//creates lists and dictionaries using maps
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//creates decimal formatting
import java.text.DecimalFormat;


public class Information {
//stores error checking and information of the fruit diameter and amounts

// creates a dictionary called market that will store the name of the item and the item amount
public static Map<String, Integer> market = new HashMap<String, Integer>();

public static Scanner input = new Scanner(System.in);


public static Boolean catchArgs(Object money) throws Exception {
        // checks if the money is an Integer or not
        try {
                Double.parseDouble(String.valueOf(money));
                return true;
        } catch (Exception e) {
                if(String.valueOf(money).equals("exit")) {
                        System.out.println("bye");
                        System.exit(0);
                }
                return false;
        }
}

public static int getOptions(String optionName) throws Exception {
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
                int i = Integer.parseInt((String) num);
                return true;
        }
        catch (Exception e) {
                return false;
        }

}

public static void print_opt(Map<String, Integer> mp) throws Exception {
        int numbering;
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
}

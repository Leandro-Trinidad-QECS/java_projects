import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.text.DecimalFormat;

public class numbersTryCatch {

public static Map<String, Double> market = new HashMap<String, Double>();
public static Scanner input = new Scanner(System.in);
public static void main(String[] args) throws Exception {

        market.put("Test",1.00);
        market.put("asd",1.00);
        market.put("sgh",1.00);
        //vars
        String money_amount;

        //try catch statement
        int i = 0;
        while (true) {
                System.out.print("How much money do you have ['50.65']: ");
                money_amount = input.next();
                if (catchArgs(money_amount)) {
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

        printmarket();
        int hello = getOptions("Market");
        System.out.println(hello);





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
                                System.out.println("Thats not right");
                        }
                } catch (Exception e) {
                        System.out.println(String.format("[!] %s", e));
                }

        }
        return option_int;

}

public static Boolean catchArgs(Object money) throws Exception {
        // checks if the money is an interger or not
        try {
                Double.parseDouble(String.valueOf(money));
                return true;
        } catch (Exception e) {
                return false;
        }
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
        //checks if object is an interger if its a string or double sends false
        try {
                int i = Integer.parseInt((String) num);
                return true;
        }
        catch (Exception e) {
                return false;
        }

}

public static void printmarket() throws Exception {
        System.out.println("Market");
        for (int i = 0; i < market.size(); i++) {

                System.out.println(String.format("[%d] %s", i, i) );
        }
}


}

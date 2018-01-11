import java.util.Scanner; // scanner class for getting user inputing


public class numbersTryCatch {
// main class


//creates a scanner to get user input
public static Scanner input = new Scanner(System.in);

public static void main(String[] args) throws Exception {

        //places items in the dictionary that is in the Inforation class
        Information.market.put("Apples",10); // Information.market.put(name of item, item amount)
        Information.market.put("Oranges",20);

        //Declares variable for the users money
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
        int item;
        int apple_amm = 0;
        int orange_amm = 0;
        do {
                Information.print_opt(Information.market);
                item = Information.getOptions("type 'done' when finished\nMarket");
                if ((item != 666) && item == 0) { // 0 means apples
                        apple_amm = Information.getOptions("Amount of apples: ");
                }
                if ((item != 666) && item == 1) { // 1 means oranges
                		orange_amm = Information.getOptions("Amount of oranges: ");
                }
        } while(item != 666); // 666 is the exit code

        
        double diameter = Information.appleDiameter;
        Apple apples1 = new Apple ( apple_amm, diameter );
        
        System.out.println(apples1); //Console Apple Order
        System.out.println("The total bill for Apples is: " + Information.printMoney(apples1.getTotalCost() ) );
        diameter = Information.orangeDiameter;
        Orange oranges1 = new Orange (orange_amm, diameter); //Creating object with Oranges ordered
        System.out.println(oranges1); //Console Apple Order
        System.out.println("The total bill for Oranges is: " + Information.printMoney(oranges1.getTotalCost() ) );





}



}

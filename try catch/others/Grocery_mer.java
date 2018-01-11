public int checkIntEntry (String userNumber1) {
        String userNumber2 = new String(); //Creating new String Object different than numbers
        userNumber2 = ""; //need to assign for IF inside Try-Catch
        int item_int = 0; //default value for fruit
        double item_double = 0.0; //used to catch user entry if value has a decimal
        try { //note: once a line fails, rest of try will not run b/c line needs "catching"
                item_double = Double.parseDouble(userNumber1);
                //If parseDouble fails, user probably entered a string
                //If parseDouble passes, user probably entered an integer
                item_double = 0.0; //reset this value and further test userNumber1
        }
        catch (NumberFormatException ne3) {
                System.out.println ("User has failed first attempt at entering item number");
                userNumber2 = JOptionPane.showInputDialog ("Please enter how many " +
                                                           "whole items.\nFor example: \' 3 \'");
                try {
                        item_double = Double.parseDouble(userNumber2);
                        userNumber1 = userNumber2;
                        item_double = 0.0; //reset this value and further test userNumber1
                }
                catch (NumberFormatException ne4) {
                        System.out.println ("User failed a second attempt for " +
                                            "an integer value of items.");
                        JOptionPane.showMessageDialog (null, "Please restart the program and " +
                                                       "enter a whole number of items, as a whole number.", "ERROR " +
                                                       "MESSAGE", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                }
        }
        try {
                System.out.println ("User entered a double or int for number of items.");
                item_int = Integer.parseInt(userNumber1);
                //If parseInt fails, user probably entered a decimal
                System.out.println ("User entered an int for number of items.");
        }
        catch (NumberFormatException ne6) {
                System.out.println ("User entered a decimal value for the number of items.");
                userNumber2 = JOptionPane.showInputDialog ("It seems you have entered " +
                                                           " a decimal number.\nPlease enter a number of whole items.\n" +
                                                           "For example: \' 3 \'");
                try {
                        item_int = Integer.parseInt(userNumber2);
                        item_double = 0.0;
                }
                catch (NumberFormatException ne7) {
                        System.out.println ("User failed a second attempt for " +
                                            "the whole number of items.");
                        JOptionPane.showMessageDialog (null, "Please restart the program and " +
                                                       "enter a whole number of items, as a whole number.", "ERROR " +
                                                       "MESSAGE", JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                }
        }

        System.out.println ("Tracking Variables of Procedure for debugging");
        //Output all the variales to check values and reset if necessary
        System.out.println (item_int);
        System.out.println (item_double);
        System.out.println (userNumber1);
        System.out.println (userNumber2);
        return item_int;
}

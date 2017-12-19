import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.text.DecimalFormat;

public class numbersTryCatch {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    System.out.print("Money Amount:");
    while (!catchArgs(input.next())) {
      System.out.println("Error");
      System.out.print("Money Amount:");
    }



  }

  public static String[] catchArgs(Object money) throws Exception {

    // checks if the money is an interger or not
    try {
      Double.parseDouble(String.valueOf(money));
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  public static Double formatMoney(Object money) {
    //formats the money to two decimal places

    //turns object to string
    String money_string = money.toString();
    //turns string to double
    double money_double = Double.parseDouble(money_string);

    //decimal format
    DecimalFormat df = new DecimalFormat("#.00");

    //formats the double & returns it
    String return_string = df.format(money_double);
    double return_double = Double.parseDouble(return_string);
    return return_double;
  }
}

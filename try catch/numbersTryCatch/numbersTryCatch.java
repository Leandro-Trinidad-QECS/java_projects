import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.text.DecimalFormat;

public class numbersTryCatch {
  public static void main(String[] args) throws Exception {

  System.out.println(checkMoney(args[0]));

  System.out.println(formatMoney(args[0]));

  }

  public static boolean checkMoney(Object money) throws Exception {
    // checks if the money is an interger or not
    try {
      Double.parseDouble(String.valueOf(money));
      return true;
    } catch (Exception e) {
      System.out.println(e);
    }
    return false;
  }
  public static Double formatMoney( Object money) {
    DecimalFormat df = new DecimalFormat("#.00");

    return df.format(obj.toString(money).Double.valueOf(money));
  }
}


import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.text.DecimalFormat;

public class numbersTryCatch {




  private static DecimalFormat fmoney = new DecimalFormat("#.00");
  private static DecimalFormat printMon = new DecimalFormat("$#.00");

  public static void main(String[] args) throws Exception {

    //adds marke things in a dictionary
    Map<String, Double> market = new HashMap<String, Double>();
    market.put("apples",10.0);
    market.put("bannana",10.0);
    market.put("orange",10.0);

    //creates new scanner
    Scanner input = new Scanner(System.in);

    //sets vars
  	double userMoney = 0;


    //checks: if the user input is not a double asks again
  	while(true) {
  		System.out.print("Amount of money: ");
  		try {
  			userMoney = Double.parseDouble(input.next());
        break;
  		} catch(Exception ignore) {
  			System.out.println(" [ ! ] I dont think thats right");
  		}
  	}
    System.out.println(printMoney(userMoney);

  }

  public static String printMoney(double amount) {
    return printMon.format(amount);
  }

}

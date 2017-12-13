import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args)
  throws Exception
  {
    double a , b, c;
    if (args.length < 3) {
      // throw new Exception("'a' 'b' & 'c' are required arguments");
      System.out.println("'a' 'b' & 'c' are required arguments");
      System.exit(0);
    } else if(args.length > 3) {
      System.out.print("only need 3 inputs. ignoring ");
      for (int i = 3; i < args.length ; i++) {
        System.out.print(args[i] + " ");
      }
    }
    try {
      for (int i = 0; i < 3; i ++) {
        Integer.parseInt(args[i]);
      }
    } catch (NumberFormatException e) {
      // System.out.println(e);
      System.out.println("Arguments must be Intergers or Error:" + e);
      System.exit(0);
    }
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    c = Integer.parseInt(args[2]);

    /////
    // Main
    //////////

    //finds the xIntercepts and the YIntercepts
    double xint = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    double xint2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);


    //prints the input that the user puts in the arguments
    System.out.println(String.format("\na = %f \nb = %f\nc = %f", a,b,c));

    //prints the  xints and yints
    System.out.println(String.format("\nX = %f %f", xint, xint2));

    //checks for errors
    if (Double.isNaN(xint) || Double.isNaN(xint2))
    {
      System.out.println("\n[!] Calculation Error");
      System.exit(0);
    }

  }
}

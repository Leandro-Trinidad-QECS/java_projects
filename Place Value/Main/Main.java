public class Main {
  public static void main(String[] args)
  throws Exception
  {
    int number;
    try {
      if (args.length == 0) {
         number = (int)(Math.random()));
      } else {
        number = Integer.parseInt(args[0]);
      }

      int length = (int)(Math.log10(number)+1);
      System.out.println(number + " has " + length);
    } catch (Exception e) {
      System.out.println("Error:" + e);
      System.exit(0);
    }


  }
}

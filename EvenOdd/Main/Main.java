public class Main {
  public static void main(String[] args)
    throws Exception
  {
    int num;
    try {
      num = Integer.parseInt(args[0]);
      if ((num%2) == 0) {
        System.out.println(num + " is even");
      } else {
        System.out.println(num + " is odd");
      }
    } catch (Exception e) {
      System.out.println("Error");
    }

  }
}

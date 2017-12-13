public class Main {
  public static void main(String[] args)
    throws ArrayIndexOutOfBoundsException
  {
    String userMode;
    String userName;
    String userPass;
    String[] option = {"-n", "-i"};
    //checks when the args are empty

    /////
    /// TRY CATCH
    ////////
    try {
      for (int i = 0; i < option.length; i++) {
        if(!args[0].equals(option[i])) {
          System.out.println("Usage: Main [option] <username> <password>\n" +
                             "            [  -n  ] <- New username and password\n" +
                             "            [  -i  ] <- Put username and password");
          System.exit(0);
        } else {
          break;
        }
      }
      //if username and password are empty
      if (args[1] == null || args[2] == null) {
        System.out.println("Usage: Main [option] <username> <password>\n" +
                           "            [  -n  ] <- New username and password\n" +
                           "            [  -i  ] <- Put username and password");
        System.exit(0);
      }
    } catch (Exception e) {
      System.out.println("Usage: Main [option] <username> <password>\n" +
                         "            [  -n  ] <- New username and password\n" +
                         "            [  -i  ] <- Put username and password");
      System.exit(0);
    }
    // <- End of try Catch

    //puts args as variables
    userMode = args[0];
    userName = args[1];
    userPass = args[2];

    /////
    //  MAIN
    ///////



  }
}

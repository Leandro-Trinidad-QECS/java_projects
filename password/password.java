public class password {
	public static void main(String[] args)
	throws Exception
	{
		//checks if args amount is correct
		if (args.length < 3) {
			System.out.println("Need more arguments");
			System.exit(0);
		} else if (args.length > 3) {
			System.out.println("To many armuments");
			System.exit(0);
		} else if (args.length == 0) {
			System.out.println("No arguments given");
			System.exit(0);
		}

		// modes can be store or checks
		System.out.println(args[0]);
		if (args[0].equals("-s") || args[0].equals("-store")) {
			//store username and password

		} else if (args[0].equals("-c") || args[0].equals("-check")) {
			//checks the password if in the database

			//TODO: database is a textfile that has all the username and passwords
		} else {
			System.out.println(args[0] + " is incorrect");
			System.out.println("Mode Usage: -store   -s  store usernames and passwords\n" +
												 "             -check  -c  checks if account is in database");
			System.exit(0);
		}


	}

}

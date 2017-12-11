/**
* The password program allows a user to store username and passwords
* In a file and checks if the password is stored.
* Test project for school
*
* //DANGER//
* Do not actually store your passwords in this program
* It is not a secure way of storing passwords use onepass or dashlane
*
* @author  Leandro Trinidad
* @version 1.0
* @since   2017-12-10
*/

import java.io.*;
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
		if (args[0].equals("-s") || args[0].equals("-store")) {
			//store username and password

			if(writeToFile(args[1],args[2])) {
				System.out.println("Account added to database");
			} else {
				System.out.println("Account already in the database");
			}

		} else if (args[0].equals("-c") || args[0].equals("-check")) {
			//checks the password if in the database
			if(checkUserPass(args[1],args[2])) {
				System.out.println("Account is in the database");
			} else {
				System.out.println("Account not in the database");
			}

			//TODO: database is a textfile that has all the username and passwords
		} else {
			System.out.println(args[0] + " is incorrect");
			System.out.println("Mode Usage: -store   -s  store usernames and passwords\n" +
												 "             -check  -c  checks if account is in database");
			System.exit(0);
		}


	}

//writes the username and password in a text file called pass.txt
//TODO: encrypt the text before appending to file
// for security reasons
public static boolean writeToFile(String username, String password) throws Exception {
	//checks if the username and password is already in the database
		if (!checkUserPass(username,password)) {
			BufferedWriter out = new BufferedWriter(new FileWriter("pass.txt",true));
			out.write(username + ":" + password);
			out.newLine();
			out.close();
			return true;
		}
		return false;
}

//checks the username and password if they are in the database or not
public static boolean checkUserPass(String user, String pass) throws Exception {
	BufferedReader br = null;
	br = new BufferedReader(new FileReader("pass.txt"));
            String line;
						String[]  userPass;
            while ((line = br.readLine()) != null) {
							userPass = line.split(":");
							if (user.equals(userPass[0]) && pass.equals(userPass[1])) {
								return true;
							}
            }
						return false;
}



}


import java.util.Scanner;
public class numbersTryCatch {
  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
	double userMoney = 0;
	while(true) {
		System.out.println("Money:");
		try {
			userMoney = Double.parseDouble(input.next());
			break;
		} catch(Exception ignore) {
			System.out.println("Please type in money amount");
		}
	}
	



  }
}

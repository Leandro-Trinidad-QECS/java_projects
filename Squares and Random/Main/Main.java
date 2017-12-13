import java.util.concurrent.ThreadLocalRandom;
public class Main {
  public static void main(String[] args) {

    int[] oneUp = new int[11];
    int[] by2 = new int[11];
    int[] rand = new int[11];
    for (int i = 1; i < 11; i++) {
      oneUp[i] = i;
      System.out.println(i);
    }
    System.out.println("---------");
    for (int i = 1; i < 11; i++) {
      by2[i] = i*i;
      System.out.println(i*i);
    }
    System.out.println("---------");
    for (int i = 1;i<11 ;i++ ) {
      rand[i] = ThreadLocalRandom.current().nextInt(oneUp[i], by2[i] + 1);
    }

    for (int i = 1; i<11 ; i++ ) {
      System.out.println(oneUp[i] + "\t" + by2[i] + "\t" + rand[i]);
    }
  }
}

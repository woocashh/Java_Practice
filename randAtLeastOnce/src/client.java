import java.util.Random;
import java.util.Scanner;


public class client {

  private static Random rand = new Random();
  private static numsAlready already;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the bound:");

    int bound = Integer.parseInt(scan.nextLine());
    int count = 0;
    int current;

    already = new numsAlready(bound);

    while (!already.isListReady()){
      current = rand.nextInt(bound);
      already.updateList(rand.nextInt(bound));
      System.out.println(current);
      count ++;
    }
    System.out.println("The number of numbers:" + count);
  }

}

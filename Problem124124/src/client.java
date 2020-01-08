import java.util.Scanner;

public class client {

  private static void collatz(int i){
    System.out.println(i);
    if(i == 1){
      return;
    } else if (i%2 == 1) {
      collatz(3 * i + 1);
    } else {
      collatz(i / 2);
    }
  }

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    int i = obj.nextInt();
    collatz(i);
    return;
  }

}

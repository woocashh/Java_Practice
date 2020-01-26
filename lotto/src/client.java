import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class client {


  private static Random rand = new Random();
  private static List<Integer> already = new ArrayList<Integer>();

  public static void main(String[] args) {
    int chosen;

    while (already.size()<=7){
      chosen = rand.nextInt(48) + 1;
      if(!already.contains(chosen)){
        already.add(chosen);
      }
    }

    for (int i : already){
      System.out.println("The number is: " + i);
    }
  }

}

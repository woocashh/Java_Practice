import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class main {

  public static void main(String[] args) throws IOException {
    Deque<String> myDeque = new ArrayDeque<>();

    BufferedReader reader =
        new BufferedReader(new InputStreamReader(System.in));

    String line = reader.readLine();

    int counter = 0;
    int max = 10;

    while (line !=null && counter < max){
      myDeque.push(line);
      line = reader.readLine();
      counter++;
    }

    while (!myDeque.isEmpty()){
      System.out.println(myDeque.pop());
    }

  }

}

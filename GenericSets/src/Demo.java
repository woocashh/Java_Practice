import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {

  public static GenericSet readIntegers(int numIntegers) throws IOException {

    GenericSet result = (numIntegers > 10 ? new MemoryEfficientGenericSet()
        : new SpeedEfficientGenericSet());

    BufferedReader br = new BufferedReader(
        new InputStreamReader(
            System.in
        )
    );

    for (int i = 0; i < numIntegers; i++) {
      System.out.println("Please enter an int:");
      result.add(new Integer(br.readLine()));
    }

    return result;
  }

  public static void main(String[] args) throws IOException {

    GenericSet integers = readIntegers(Integer.parseInt(args[0]));

    System.out.println("Set is: " + integers.getClass());

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("Enter an int, to be tested for membership:");
      String line = br.readLine();
      if (line.equals("q")) {
        System.out.println("Goodbye!");
        break;
      }
      System.out.println("Set contains " + new Integer(line) + ": "
          + integers.contains(new Integer(line)));
    }


  }

}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NumberManipulation {

  public static <T extends Number> Set<T>
  readNumbers(int n, NumberParser<T> parser) throws IOException {
    int counter = 0;
    Set<T> res = new HashSet<>();
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter " + parser.typeParsed());
    while (counter < n){
      res.add(parser.parseNumber(r.readLine()));
      counter++;
    }
    return res;
  }

  public static void displayAsDoubles(Set<? extends Number> nums){
     System.out.println(nums.stream().map(Number::doubleValue)
        .collect(Collectors.toSet()));
  }

  public static void main(String[] args) throws IOException {
    Set<Integer> ints = readNumbers(5, new IntegerParser());
    Set<Double> doubles = readNumbers(5, new DoubleParser());

    System.out.println(doubles);
    System.out.println(ints);

    IntegerAdder intAdd = new IntegerAdder();

    System.out.println(ints.stream().reduce(intAdd.zero(), intAdd::add));

  }
}

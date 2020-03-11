import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class NumberManipulation {

  public NumberManipulation(int i, IntegerParser integerParser) {
  }

  public static <T extends Number> Set<T> readNumbers(int n, NumberParser<T> np )
      throws IOException {
    Set<T> res = new HashSet<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for(int i = 0 ; i < n; i++){
      System.out.println("Please supply an number of type " + np.typeParsed());
      res.add(np.parseNumber(reader.readLine()));
    }
    return res;
  }

  public static <T extends Number> T addNumbers(Set<T> coll, NumberAdder<T> adder){
    T zero = adder.zero();
    return coll.stream().reduce(zero,adder::add);
  }

  public static void displayAsDoubles(Set<? extends Number> numbers){
    numbers.forEach((x) -> System.out.println((x.doubleValue())));

  }

  public static void displayAsInts(Set<? extends Number> numbers){
    numbers.forEach((x) -> System.out.println(x.intValue()));
  }


  public static void main(String[] args) throws IOException {
    Set<Integer> ints = readNumbers(5, new IntegerParser());
    Set<Double> doubles = NumberManipulation.readNumbers(5, new DoubleParser());

    System.out.println(ints);
    System.out.println(addNumbers(ints, new IntegerAdder()));
    System.out.println(addNumbers(doubles, new DoubleAdder()));

    displayAsDoubles(ints);
    displayAsInts(doubles);
}

}

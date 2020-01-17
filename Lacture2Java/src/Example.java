import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example{

  static int timesTwo(int value){
    return  value * 2;
  }

  static List<Integer> doubleElementsWithStream(List<Integer> elems){
    return elems.stream()
        .map(x -> x * 2)
        .collect(Collectors.toList());
  }

  private static List<String> makeUpperCase(List<String> input){

    return input.stream()
        .map(item -> item.toUpperCase())
        .collect(Collectors.toList());

  }

  static List<String> wierd(List<String> strings){
    return strings.stream()
        .map(Integer::new)// instance method, cleaner
        .map(item -> item++)
        .map(item -> "!" + item + "!")
        .collect(Collectors.toList());
  }

  static List<String> filterFalseStrings(List<String> strings){
    return strings.stream()
        .filter(Boolean :: new)
        .collect(Collectors.toList());
  }

  static String concat(List<String> strigns){
    return strigns.stream()
        .reduce("", String::concat);
  }

  static String commaSeperate(List<String> input){
    return input.stream()
        .reduce((s,t) -> s + ", " + t)
        .orElse("DON'T KNOW");
  }

  static Map<String, Integer> getLength(List<String> input){

    return input.stream()
        .collect(Collectors.toMap(
            Function.identity(), // or k -> k
            k -> k.length()
        ));

  }

  public static void main(String[] args) {
    List<Integer> someInts =  new ArrayList<>();
    someInts.add(1);
    someInts.add(2);
    someInts.add(3);
    someInts.add(4);
    someInts.add(5);
    System.out.println(doubleElementsWithStream(someInts));

    // instance map
    List<String> myStrings = Arrays.asList("Ally", "Spcl");
    System.out.println(Example.makeUpperCase(myStrings));

    // applying many maps
    List<String> nums = Arrays.asList("12", "2");
    System.out.println(Example.wierd(nums));

    // filter
    System.out.println(filterFalseStrings(Arrays.asList("True", "False", "true", "1", "0", "cat")));

    // concat
    System.out.println(concat(Arrays.asList("True", "False", "true", "1", "0", "cat")));

    // commaSeparate
    System.out.println(commaSeperate(Collections.emptyList()));
    System.out.println(commaSeperate(Arrays.asList("a", "b", "c")));
    System.out.println(commaSeperate(Arrays.asList("a")));

    // Map streams

    System.out.println(getLength(Arrays.asList("a", "bb", "ccc")));

  }

}

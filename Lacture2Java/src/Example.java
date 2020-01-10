import java.util.ArrayList;
import java.util.List;
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

  public static void main(String[] args) {
    List<Integer> someInts =  new ArrayList<>();
    someInts.add(1);
    someInts.add(2);
    someInts.add(3);
    someInts.add(4);
    someInts.add(5);

    System.out.println(doubleElementsWithStream(someInts));

  }

  //Stream<String> myStringStream = myStringList.stream();


  //  Stream<String> myStringStream= ...;
  //  List<String> myStringList= myStringStream.collect(Collectors.toList());

}

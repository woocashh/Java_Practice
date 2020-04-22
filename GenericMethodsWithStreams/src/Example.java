import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

  public static <T> List<T> concatenate(List<List<T>> lists){
    return lists.stream().reduce(Collections.emptyList(),(x,y) -> {
      List<T> temp = new ArrayList<>(x);
      temp.addAll(y);
      return temp;
    });
  }

  public static <S,T> List<ImmutablePair<Optional<S>, Optional<T>>>
      zip(List<S> first, List<T> second){
    return IntStream
        .range(0, Math.max(first.size(), second.size()))
        .mapToObj(item -> new ImmutablePair<Optional<S>, Optional<T>>(
            item < first.size() ? Optional.of(first.get(item)) : Optional.empty(),
            item < second.size() ? Optional.of(second.get(item)) : Optional.empty()))
        .collect(Collectors.toList());
  }

  public static <S,T> List<ImmutablePair<S,T>> flatten(
      List<ImmutablePair<Optional<S>, Optional<T>>> maybePairs,
  S defaultS, T defaultT){
    return maybePairs
        .stream()
        .map(x -> new ImmutablePair<>(x.getFirst().orElse(defaultS),
            x.getSecond().orElse(defaultT))).collect(Collectors.toList());
  }

  public static void main(String[] args) {

    final List<String> strings1 = Arrays.asList("Then", "again", "he", "said");
    final List<String> strings2 = Arrays.asList("it", "makes", "me", "wonder", "about", "you");
    final List<String> strings3 = Arrays
        .asList("The", "binders", "what", "is", "it", "like");
    final List<String> strings4 = Arrays.asList("to", "steal", "a", "soul?");

    final List<Float> floats1 = Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
    final List<Float> floats2 = Arrays.asList(20.0f, 19.0f, 18.0f, 17.0f, 16.0f, 15.0f);
    final List<Float> floats3 = Collections.singletonList(10.0f);
    final List<Float> floats4 = Arrays.asList(11.0f, 1.0f);

    final List<List<String>> listOfListsOfStrings = Arrays.asList(strings1, strings2, strings3,
        strings4);
    final List<List<Float>> listOfListsOfFloats = Arrays.asList(floats1, floats2, floats3,
        floats4);
    System.out.println("Concatenated string lists: " + concatenate(listOfListsOfStrings));
    System.out.println("Concatenated float lists: " + concatenate(listOfListsOfFloats));

    final List<ImmutablePair<Optional<String>, Optional<String>>> zippedStringLists
        = zip(strings1, strings2);
    final List<ImmutablePair<Optional<String>, Optional<Float>>> zippedStringAndFloatLists
        = zip(strings1, floats4);
    System.out.println("Zipped string lists: " + zippedStringLists);
    System.out.println("Zipped string and float lists: " + zippedStringAndFloatLists);

    final List<ImmutablePair<String, Float>> flattenedZippedStringAndFloatLists
        = flatten(zippedStringAndFloatLists, "NOTHING", -1.0f);
    System.out.println("Zipped string an float lists after flattening: "
        + flattenedZippedStringAndFloatLists);
  }

}

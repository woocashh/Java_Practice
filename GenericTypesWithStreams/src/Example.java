import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Example {

  public static <T> List<T> concatenate(List<List<T>> lists){
    return lists
        .stream()
        .reduce(Collections.emptyList(),
            (first, second) -> {
              List<T> result = new ArrayList<>(first);
              result.addAll(second);
              return result;
            });

  }

  public static <S,T> List<ImmutablePair<Optional<S>, Optional<T>>>
    zip(List<S> fsts, List<T>scnds){

    return IntStream.range(0, Math.max(fsts.size(),scnds.size()))
        .mapToObj(item -> new ImmutablePair<Optional<S>,Optional<T>>(
            item < fsts.size() ? Optional.of(fsts.get(item)) : Optional.empty(),
            item < scnds.size() ? Optional.of(scnds.get(item)) : Optional.empty()))
        .collect(Collectors.toList());
  }

  public static <S,T> List<ImmutablePair<S, T>>
  flatten(List<ImmutablePair<Optional<S>, Optional<T>>> lst, S defaultS, T defaultT){
    return lst.stream().map((ImmutablePair<Optional<S>, Optional<T>> e)
        -> new ImmutablePair<>(e.getFst().orElse(defaultS), e.getScd().orElse(defaultT)))
        .collect(Collectors.toList());
  }



  static <C extends Collection<E>, E> Optional<C>
  getSmallestCollection(List<C> collections){
    return collections.stream().reduce((f,s)
        -> f.size() > s.size() ? s : f);

  }

  public static void main(String[] args) {

    final Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 2));
    final Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
    final Set<Integer> s4 = new HashSet<>(Arrays.asList(3, 4));
    final List<Set<Integer>> listOfSetsOfIntegers = Arrays.asList(s1, s2, s3, s4);

    final Optional<Set<Integer>> smallestSet = getSmallestCollection(listOfSetsOfIntegers);

    System.out.println(smallestSet);

    final List<String> strings1 = Arrays.asList("Then", "again", "he", "said");
    final List<String> strings2 = Arrays.asList("it", "makes", "me", "wonder", "about", "you");
    final List<String> strings3 = Arrays.asList("The", "binders", "what", "is", "it", "like");
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

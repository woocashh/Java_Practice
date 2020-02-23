import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Demo {

  public static void main(String[] args) {

    Person p1 = new Person("A","E", "2");
    Person p2 = new Person("B","A", "3");
    Person p3 = new Person("C","B", "3");
    Person p4 = new Person("A","D", "4");
    Set<Person> people = new HashSet<>();
    people.add(p1);
    people.add(p2);
    people.add(p3);
    people.add(p4);

    System.out.println(findGlobalMin(people));
    System.out.println(findMin(people, new SurnameComparator()));
    System.out.println(findMin(people, new ForenameComparator()));
    System.out.println(findMin(people, new TelephoneNumberComparator()));
    System.out.println(findMin(new HashSet<Person>(), new SurnameComparator()));
  }


  public static Person findMin(Set<Person> people,
      PersonComparator comparator) {
    return people.stream().min(comparator)
        .orElse(null);
  }

  public static Person findGlobalMin(Set<Person> people) {
    return people.stream().min(
        (new SurnameComparator())
            .thenComparing(new ForenameComparator())
            .thenComparing(new TelephoneNumberComparator()))
        .orElse(null);
  }


}

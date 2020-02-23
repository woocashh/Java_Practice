import java.util.Comparator;

public interface PersonComparator extends Comparator<Person> {

  int compare(Person p1, Person p2);

}

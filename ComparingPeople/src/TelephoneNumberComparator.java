public class TelephoneNumberComparator implements PersonComparator {

  @Override
  public int compare(Person p1, Person p2) {
    return p1.getTelNo().compareTo(p2.getTelNo());
  }
}

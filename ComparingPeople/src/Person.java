public class Person {

  private String surname;
  private String forename;
  private String telNo;

  public Person(String surname, String forename, String telNo) {
    this.surname = surname;
    this.forename = forename;
    this.telNo = telNo;
  }

  public String getSurname() {
    return surname;
  }

  public String getForename() {
    return forename;
  }

  public String getTelNo() {
    return telNo;
  }

  @Override
  public String toString() {
    return "Person{" +
        "surname='" + surname + '\'' +
        ", forename='" + forename + '\'' +
        ", telNo='" + telNo + '\'' +
        '}';
  }
}

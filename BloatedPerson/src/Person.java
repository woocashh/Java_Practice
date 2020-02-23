

public class Person {

  private Name name;
  private Date dateOfBirth;
  private Address address;
  private NiNumber nationalInsuranceNumber;

  public Person(String forename, String surname,
      int dayOfBirth,
      int monthOfBirth,
      int yearOfBirth,
      int houseNumber,
      String address1,
      String address2,
      String postCode,
      String nationalInsuranceNumber) {
    this.name = new Name(forename, surname);
    this.dateOfBirth = new Date(dayOfBirth,monthOfBirth,yearOfBirth);
    this.address =new Address(houseNumber,address1,address2,postCode);
    this.nationalInsuranceNumber = new NiNumber(nationalInsuranceNumber);
  }

  public boolean sameAddress(Person that){
    return address.equals(that.address);
  }

  // Should include toString methods of other classes
  public String toString() {
    return "Name: " + name + "\n"
        + "DOB: " + dateOfBirth + "\n"
        + address + "\n"
        + nationalInsuranceNumber;

  }

}
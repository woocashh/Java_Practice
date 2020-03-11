public class AddressAlreadyExistsException extends Exception {
  private final String identifier;

  public AddressAlreadyExistsException(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public String toString() {
    return "Attempt to add email address with duplicate identifier: " + identifier;
  }
}

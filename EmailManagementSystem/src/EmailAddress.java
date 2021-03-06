import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class EmailAddress {

  protected String identifier;
  private static Set<String> alreadyIn = new HashSet<>();

  public EmailAddress(String identifier) throws AddressAlreadyExistsException {
    if(alreadyIn.contains(identifier)){
      throw new AddressAlreadyExistsException(identifier);
    }else {
    alreadyIn.add(identifier);
    this.identifier = identifier;}
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof EmailAddress)) {
      return false;
    }
    EmailAddress that = (EmailAddress) o;
    return identifier.equals(that.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier);
  }

  protected abstract Collection<? extends EmailAddress> helperGetTargets(List<EmailAddress> soFar);

  public abstract Set<EmailAddress> getTargets();

  @Override
  public String toString() {
    return identifier;
  }
}

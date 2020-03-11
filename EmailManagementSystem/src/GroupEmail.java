import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupEmail extends EmailAddress {

  private List<EmailAddress> content;

  public GroupEmail(String identifier) throws AddressAlreadyExistsException {
    super(identifier);
    this.content = new ArrayList<>();
  }

  public void addEmail(EmailAddress email){
    content.add(email);
  }

  @Override
  public Set<EmailAddress> getTargets(){
    List<EmailAddress> th = new ArrayList<>();
    th.add(this);
   return helperGetTargets(th).stream()
       .filter((EmailAddress e) -> e instanceof IndividualEmailAddress).collect(Collectors.toSet());
  }

  @Override
  protected List<EmailAddress> helperGetTargets(List<EmailAddress> soFar){
    for(EmailAddress e : content){
      if(!soFar.contains(e)){
        if (e instanceof GroupEmail){
          soFar.add(e);
        }
        soFar.addAll(e.helperGetTargets(soFar));
      }
    }
    return soFar;
  }

}

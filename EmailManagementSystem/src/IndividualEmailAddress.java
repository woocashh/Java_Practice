import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class IndividualEmailAddress extends EmailAddress  {

  public IndividualEmailAddress(String identifier) throws AddressAlreadyExistsException {
    super(identifier);
  }


  @Override
  public Set<EmailAddress> getTargets(){
    Set<EmailAddress> res = new HashSet<>();
    res.add(this);
    return res;
  }

  @Override
  protected List<EmailAddress> helperGetTargets(List<EmailAddress> soFar){
    List<EmailAddress> res = new ArrayList<>();
    if(!soFar.contains(this)){
    res.add(this);}
    return res;
  }
}

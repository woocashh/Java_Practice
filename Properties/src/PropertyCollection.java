import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PropertyCollection {

  private List<Property> content;

  public PropertyCollection(){
    this.content = new ArrayList<>();
  }

  // Add a property to the collection
  public void addProperty(Property p){
    content.add(p);
  }

  // Return the set of all houses in the collection
  public Set<House> getHouses(){
    return content.stream().filter((Property p) -> p instanceof House)
        .map((Property p)-> (House) p)
        .collect(Collectors.toSet());
  }

  // Return the set of all bungalows in the collection
  public Set<Bungalow> getBungalows(){
    return content.stream().filter((Property p) -> p instanceof Bungalow)
        .map((Property p)-> (Bungalow) p)
        .collect(Collectors.toSet());
  }

  // Return the set of all flats in the collection
  public Set<Flat> getFlats(){
    return content.stream().filter((Property p) -> p instanceof Flat)
        .map((Property p)-> (Flat) p)
        .collect(Collectors.toSet());
  }

  // Return the set of all maisonettes in the collection
  public Set<Maisonette> getMaisonettes(){
    return content.stream().filter((Property p) -> p instanceof Maisonette)
        .map((Property p)-> (Maisonette) p)
        .collect(Collectors.toSet());
  }
  
}

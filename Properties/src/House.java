public class House extends Property {

  private Detach detach;

  public House(Detach detach, int noOfBedrooms){
    this.numberOfBedrooms = noOfBedrooms;
    this.detach = detach;
  }

  @Override
  public boolean isHouse(){
    return true;
  }

}

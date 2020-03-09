public class Bungalow extends House {

  public Bungalow(Detach detach, int noOfBedrooms) {
    super(detach, noOfBedrooms);
  }

  @Override
  public boolean isBungalow(){
    return true;
  }
}

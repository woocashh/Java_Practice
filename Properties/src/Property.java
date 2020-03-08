public abstract class Property {

  protected int numberOfBedrooms;
  protected int numberOfReceptionRooms;
  protected int numberOfBathrooms;
  protected double squareFootage;


  public boolean isHouse(){
    return false;
  }

  public boolean isBungalow(){
    return false;
  }

  public boolean isFlat(){
    return false;
  }

  public boolean isMaisonette(){
    return false;
  }
}

public class PropertyDemo {

  public static void main(String[] args) {
    PropertyCollection coll = new PropertyCollection();

    for (int i = 0; i < 1000; i++) {
      coll.addProperty(new House(Detach.SEMI_DETACHED));
      coll.addProperty(new House(Detach.TERRACED));
    }

    for (int i = 0; i < 100; i++) {
      coll.addProperty(new House(Detach.DETACHED));
      coll.addProperty(new Bungalow(Detach.SEMI_DETACHED));
      coll.addProperty(new Flat());
    }

    for (int i = 0; i < 20; i++) {
      coll.addProperty(new Bungalow(Detach.DETACHED));
      coll.addProperty(new Bungalow(Detach.TERRACED));
      coll.addProperty(new Maisonette());
    }

    System.out.println(coll.getHouses().size());
    System.out.println(coll.getBungalows().size());
    System.out.println(coll.getFlats().size());
    System.out.println(coll.getMaisonettes().size());



  }
}

public class A {

  private int id;

  static int numCollected = 0;

  public A(int id){
    this.id = id;
  }

  @Override
  public void finalize(){
    System.out.println("A with id: " + id +" has been deleted");
    numCollected++;
  }

}

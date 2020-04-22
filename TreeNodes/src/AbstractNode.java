public class AbstractNode<E> {

  private E key;

  @SuppressWarnings("unchecked")
  public AbstractNode(E key){
    this.key = key;
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }




}

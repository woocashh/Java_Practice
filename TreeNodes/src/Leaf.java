public class Leaf<E> extends AbstractNode<E> {


  public Leaf(E key, E[] children) {
    super(key);
  }

  public E getChild(int index){
    assert false;
    return null;
  }
}

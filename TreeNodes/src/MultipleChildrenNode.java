public class MultipleChildrenNode<E> extends AbstractNode<E> {

  private AbstractNode<E>[] children;

  public int getNumberOfChildren() {
    return children.length;
  }
  public MultipleChildrenNode(E key, int numberOfChildren) {
    super(key);
    children = (AbstractNode<E>[]) new AbstractNode[numberOfChildren];

  }
}

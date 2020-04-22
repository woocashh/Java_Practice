public class BinaryNode<E> extends AbstractNode<E> {

  private AbstractNode<E> leftChild;
  private AbstractNode<E> rightChild;

  public BinaryNode(E key, AbstractNode leftChild,
      AbstractNode rightChild) {
    super(key);
    this.leftChild = leftChild;
    this.rightChild = rightChild;
  }

}

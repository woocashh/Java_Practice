public class TreeNode<E> {

  private E key;
  private TreeNode<E>[] children;

  @SuppressWarnings("unchecked")
  public TreeNode(int numberOfChildren) {
    children = (TreeNode<E>[]) new TreeNode[numberOfChildren];
  }

  public int getNumberOfChildren() {
    return children.length;
  }

  public TreeNode<E> getChild(int childIndex) {
    return children[childIndex];
  }

  public void setChild(int childIndex, TreeNode<E> child) {
    children[childIndex] = child;
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  public TreeNode<E> clone(){
    TreeNode<E> cloned = new TreeNode<>(getNumberOfChildren());
    cloned.setKey(getKey());
    for(int i = 0; i < getNumberOfChildren(); i++){
      cloned.setChild(i, getChild(i).clone());
    }
    return cloned;
  }

}

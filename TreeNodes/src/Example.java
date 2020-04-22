public class Example {

  public static void main(String[] args) {
    TreeNode<String> n1 = new TreeNode<String>(1);
    n1.setKey("A");
    TreeNode<String> n2 = new TreeNode<String>(1);
    n2.setKey("B");
    n1.setChild(0, n2);
    n2.setChild(0, n1);
    System.out.println(n1.clone());


    TreeNode<String> n3 = new TreeNode<String>(2);
    n3.setKey("C");
    TreeNode<String> n4 = new TreeNode<String>(1);
    n4.setKey("D");
    TreeNode<String> n5 = new TreeNode<String>(0);
    n5.setKey("E");
    n3.setChild(0, n4);
    n3.setChild(1, n5);
    n4.setChild(0, n5);

    //System.out.println(n3.clone());
  }

}

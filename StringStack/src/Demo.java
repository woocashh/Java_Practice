public class Demo {

  public static void transferStacks(GenericStack<Integer> dst, GenericStack<Integer> src){
    while (!src.isEmpty()){
      dst.push(src.pop());
    }
  }

  public static void main(String[] args) {
    GenericStack stack1 = new GenericStackArray();
    GenericStack stack2 = new GenericStackList();
    stack1.push(1);
    stack1.push(2);
    System.out.println(stack1);
    System.out.println(stack2);
    transferStacks(stack2,stack1);
    System.out.println(stack1);
    System.out.println(stack2);

  }

}

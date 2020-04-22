public class GenericStackArray<T> implements GenericStack<T>{

  private static final int STACK_LIMIT = 100;

  private T[] elements;
  private int stackPointer;

  @SuppressWarnings("unchecked")
  public GenericStackArray() {
    this.elements = (T[]) new Object[STACK_LIMIT];
    this.stackPointer = 0;
  }

  @Override
  public void push(T elem) {
    if (stackPointer < STACK_LIMIT) {
      elements[stackPointer] = elem;
      stackPointer++;
    }
  }

  @Override
  public T pop() {
    if (stackPointer > 0) {
      stackPointer--;
      return elements[stackPointer];
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return stackPointer == 0;
  }
}

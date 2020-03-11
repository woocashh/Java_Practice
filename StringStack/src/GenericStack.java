public interface GenericStack<E> extends GenericCollection {
  void push(E s);
  E pop();
  boolean isEmpty();
}

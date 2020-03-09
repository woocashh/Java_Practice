public abstract class AbstractGenericStack<E> implements GenericStack<E> {

  @Override
  public abstract void push(E s);

  @Override
  public abstract E pop();

  @Override
  public abstract boolean isEmpty();

  @Override
  public abstract GenericStackIterator<E> iterator();

  @Override
  public String toString() {
    StringBuilder res = new StringBuilder();
    res.append("[");
    GenericStackIterator it = iterator();
    while(it.hasNext()) {
      res.append(it.next() + ", ");
    }
    return res.toString();
  }
}

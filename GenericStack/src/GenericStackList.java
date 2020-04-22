import java.util.ArrayList;
import java.util.List;

public class GenericStackList<T> implements GenericStack<T> {

  private List<T> elements;

  public GenericStackList() {
    this.elements = new ArrayList<T>();
  }

  @Override
  public void push(T elem) {
    elements.add(elem);
  }

  @Override
  public T pop() {
    if (elements.size() > 0) {
      return elements.remove(elements.size() - 1);
    }
    return null;
  }

  @Override
  public boolean isEmpty() {
    return elements.isEmpty();
  }

}

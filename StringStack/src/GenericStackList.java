import java.util.LinkedList;
import java.util.List;

public class GenericStackList<E> extends AbstractGenericStack<E> {

  private List<E> content;

  public GenericStackList(){
    this.content = new LinkedList<>();
  }

  // If the stack is full, does nothing.
// Otherwise, pushes the given String on to the top of the stack
  public void push(E s){
    content.add(s);
  }

  // If the stack is empty, leaves the stack unchanged and returns
// null.  Otherwise, removes the string that is on the top of
// the stack and returns it
  public E pop(){
    E temp = content.get(content.size()-1);
    content.remove(content.size()-1);
    return temp;
  }

  // Returns true iff the stack is empty
  public boolean isEmpty(){
    return content.isEmpty();
  }

  @Override
  public GenericStackIterator iterator() {
    return new GenericStackListIterator();
  }

  public class GenericStackListIterator implements GenericStackIterator {
    private int currentIndex;

    public GenericStackListIterator(){
      currentIndex = 0;
    }

    @Override
    public boolean hasNext() {

      if(!isEmpty() && currentIndex < content.size()){
        return content.get(currentIndex) != null;
      }
      return false;
    }

    @Override
      public E next() {
        if (currentIndex >=content.size() || content.get(currentIndex) == null){
          return null;
        }else {
          E temp = content.get(currentIndex);
          currentIndex++;
          return temp;
        }
    }
  }
}

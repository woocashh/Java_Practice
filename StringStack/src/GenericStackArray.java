
public class GenericStackArray<E> extends AbstractGenericStack<E> {

  private E[] content;

  @SuppressWarnings("unchecked")
  // Creates an empty string stack
  public GenericStackArray(){
    this.content =  (E[]) (new Object[100]);
  };

  // If the stack is full, does nothing.
// Otherwise, pushes the given String on to the top of the stack
  public void push(E s){
    if(content[99] != null){
      return;
    }
    for(int i = 0; i < 100; i++ ){
      if (content[i] == null){
        content[i] = s;
        return;
      }

    }
  }

  // If the stack is empty, leaves the stack unchanged and returns
// null.  Otherwise, removes the string that is on the top of
// the stack and returns it
  public E pop(){
    if(content[0] == null){
      return null;
    }else {
      E res;
      for(int i = 0; i < 100; i++ ){
        if (content[i] == null){
          res = content[i-1];
          content[i-1] =null;
          return res;
        }
    }
      res =content[99];
      content[99] =null;
      return res;
  }}

  // Returns true iff the stack is empty
  public boolean isEmpty(){
    return content[0]==null;
  }

  @Override
  public GenericStackIterator iterator() {
    return new GenericStackArrayIterator();
  }

  private class GenericStackArrayIterator implements GenericStackIterator{
    int currentIndex;

    public GenericStackArrayIterator(){
      currentIndex = 0;
    }


    @Override
    public boolean hasNext() {
      if(!isEmpty()){
      return currentIndex < 100 && content[currentIndex] != null;}
      return false;
    }

    @Override
    public E next() {
      if (currentIndex >=100 || content[currentIndex] == null){
        return null;
      }else {
        E temp = content[currentIndex];
        currentIndex++;
        return temp;
      }
    }
  }
}

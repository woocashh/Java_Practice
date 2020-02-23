import java.util.LinkedList;
import java.util.List;

public class Bookshelf {

  private List<Book> shelf;

  public Bookshelf(){
    this.shelf = new LinkedList<>();
  }

  public int size(){
    return shelf.size();
  }

  public void addBookOnLeftSide(Book b){
    shelf.add(0,b);
  }

  public void addBookOnRightSide(Book b){
    shelf.add(b);
  }

  public void addBook(int i, Book b){
    shelf.add(i,b);
  }

  public void remove(int i){
    shelf.remove(i);
  }

  public String printFromLeft(){
    String result = "";
    for (Book b : shelf){
      if (b instanceof Dictionary){
        result += "d";
      }else {
        result +="c";
      }
    }
    return result;
  }

}

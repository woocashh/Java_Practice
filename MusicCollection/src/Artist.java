import java.util.ArrayList;
import java.util.List;

public class Artist {

  private String name;
  private List<Record> catalogue;
  private Genre mainGenre;

  public Artist(String name, ArrayList<Record> catalogue, Genre mainGenre){
    this.name = name;
    this.catalogue = catalogue;
    this.mainGenre = mainGenre;
  }

  public void addRecord(String name){
    addRecord(name, mainGenre);
  }

  public void addRecord(String name, Genre genre){
    catalogue.add(new Record(name, genre));
  }

  public void showCatalogue(){
    for(Record r : catalogue){
      System.out.println(r.getTitle());
    }
  }

  public void showGenre(Genre genre){
    for(Record r : catalogue){
      if (r.getGenre() == genre) {
        System.out.println(r.getTitle());
      }
    }
  }
}

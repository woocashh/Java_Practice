import java.util.ArrayList;

public class main {

  public static void main(String[] args) {
    ArrayList<Record> catalogue= new ArrayList<>();

    Artist artist = new Artist("W8", catalogue, Genre.JAZZ);

    artist.addRecord("love", Genre.POP);
    artist.addRecord("blue");

    artist.showCatalogue();
    artist.showGenre(Genre.POP);
  }

}

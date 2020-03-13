import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PhysicalTune extends AbstractTune {

  private List<TuneElement> content;

  public PhysicalTune(){
    this.content = new LinkedList<>();
  }

  @Override
  public void addTuneElement(TuneElement tuneElement) {
    content.add(tuneElement);
  }

  @Override
  public Iterator<TuneElement> iterator() {
    return content.iterator();
  }
}

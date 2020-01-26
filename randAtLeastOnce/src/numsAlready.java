import java.util.ArrayList;
import java.util.List;

public class numsAlready {

  private int bound;
  private List<Integer> already = new ArrayList<>();

  public numsAlready(int bound){
    this.bound = bound;
  }

  public void updateList(int num){
    if(!already.contains(num)){
      already.add(num);
    }
  }

  public boolean isListReady(){
    return already.size() == bound;
  }




}

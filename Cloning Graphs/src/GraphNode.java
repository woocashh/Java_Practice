import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphNode<E> implements Cloneable{

  private E key;
  private List<GraphNode<E>> successors;

  public GraphNode() {
    successors = new ArrayList<GraphNode<E>>();
  }

  public int getNumberOfSuccessors() {
    return successors.size();
  }

  public GraphNode<E> getSuccessor(int successorIndex) {
    return successors.get(successorIndex);
  }

  public void addSuccessor(GraphNode<E> successor) {
    successors.add(successor);
  }

  public E getKey() {
    return key;
  }

  public void setKey(E key) {
    this.key = key;
  }

  @Override
  public GraphNode<E> clone(){
    Map<GraphNode<E>, GraphNode<E>> oldToNew = new HashMap<GraphNode<E>, GraphNode<E>>();
    Deque<GraphNode<E>> stack = new ArrayDeque<>();
    Set<GraphNode<E>> alreadyIn = new HashSet<>();
    stack.push(this);
    while (!stack.isEmpty()){
      GraphNode<E> old = stack.pop();
      if(oldToNew.getOrDefault(old,null)==null){
        oldToNew.put(old, old.internalClone());
      }
      alreadyIn.add(old);
      for(GraphNode<E> succ : old.successors){
        if(!alreadyIn.contains(succ)){
          stack.push(succ);
          alreadyIn.add(succ);
        }
      }
    }

    for(GraphNode<E> n: oldToNew.keySet()){
      for(GraphNode<E> m : oldToNew.keySet()){
        if(n.successors.contains(m)){
         oldToNew.get(n).addSuccessor(oldToNew.get(m));
        }
      }
    }

    return oldToNew.get(this);
  }

  private GraphNode<E> internalClone(){
    try {
      GraphNode<E> result = (GraphNode<E>) super.clone();
      result.successors = new ArrayList<GraphNode<E>>();
      return result;
    } catch (CloneNotSupportedException e) {
      assert false;
      return null;
    }
  }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
  static int noOfCalls = 0;

  public static void main(String[] args) throws IOException {
    ExhaustMemory();
    StackOver();
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    int howMany = Integer.parseInt(bf.readLine());
    for(int i = 0; i < howMany; i++){
      try{
        int temp = Integer.parseInt(bf.readLine());
        if (temp<0){
          System.out.println("Only non-neg!");
          i--;
          continue;
        }
        System.out.println("Correct!");
      }catch (NumberFormatException e){
        i--;
        System.out.println("Please enter int!");
      }
    }
  }

  public static void StackOver(){
    try{
      noOfCalls++;
      StackOver();}
    catch (StackOverflowError e){
      System.out.println(noOfCalls);
    }
  }

  public static void ExhaustMemory(){
    List<Integer> exhaust = new ArrayList<>();
    int counter = 0;
    while(true){
      counter++;
    try {
      exhaust.add(new Integer(counter));
    }catch (OutOfMemoryError e){
      System.out.println("This is the size: " + exhaust.size());
      break;
    }}

  }
}

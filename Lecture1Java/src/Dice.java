import java.util.Random;

public class Dice{

  public static final int SIDES_ON_DICE = 6;
  private int top;
  private Random generator;


  public Dice(){
    this.generator = new Random();
    roll();
  }

  public int getTop(){
    return top;
  }

  public int getBottom(){
    return (SIDES_ON_DICE + 1) - top;
  }

  public void roll(){
    top = generator.nextInt(SIDES_ON_DICE) + 1;
  }

}

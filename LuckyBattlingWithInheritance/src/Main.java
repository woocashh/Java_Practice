
public class Main {

  public static void main(String[] args) {

    GameEngine gameEngine = new GameEngine();

    Fighter humanWarrior = new LuckyFighter("Joe", "Human Warrior", 16, 12, 12,
        Strategy.AGGRESSIVE, gameEngine);

    Fighter elfLord = new Fighter("Alex", "Elf Lord", 18, 6, gameEngine);

    gameEngine.simulateBattle(humanWarrior, elfLord);

  }

}
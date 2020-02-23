public class Fighter {

  protected String name;
  protected String type;
  protected int skill;
  protected int stamina;
  protected GameEngine theGameEngine;
  protected final int damageValue = 2;

  public Fighter(String name, String type, int skill, int stamina,
      GameEngine theGameEngine) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
    this.theGameEngine = theGameEngine;
  }

  public String getName() {
    return name;
  }

  public boolean isDead() {
    return stamina == 0;
  }

  @Override
  public String toString() {
    return name + ", "+ type + " - skill: "
        + skill + "; stamina: " + stamina;
  }

  public int calculateAttackScore() {
    return skill + theGameEngine.rollDice() + theGameEngine.rollDice();
  }

  public int calculateDamage() {
    return damageValue;
  }

  public void takeDamage(int damage) {
    stamina = Math.max(stamina - damage, 0);
  }


}

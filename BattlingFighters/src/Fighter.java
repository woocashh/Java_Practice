public class Fighter {

  private String name;
  private String type;
  private final int skill;
  private int stamina;


  public Fighter(String name, String type, int skill, int stamina) {
    this.name = name;
    this.type = type;
    this.skill = skill;
    this.stamina = stamina;
  }

  public void takeDamage(int damage){
    stamina-=damage;
    if (stamina<=0){
      stamina = 0;
    }
  }
}

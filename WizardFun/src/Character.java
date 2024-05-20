public class Character {
  private String name; 
  private int damage, endurance, speed; 
  private double xp;
  public Character(String name, int damage,int endurance,int speed, double xp){
    this.damage = damage;
    this.endurance = endurance; 
    this.speed = speed;
    this.xp = xp;
  }
  public Character(String name) {
    this(name, 20, 30, 15, 100.0);
  }
  public String getName(){
    return name;
  } 
  public int getDamage(){
    return damage;
    }
  public int getEndurance(){
    return endurance;
  }
  public int getSpeed(){
     return speed;
  }
  public double getXp(){
     return xp; 
  } 
  public void takeDamage(int damage) {
	  xp -= damage;
  }
}

public class Wizard {
private String name;
  private int damage, endurance, speed;
  private double xp;
  private Wiz questionsAndAnswers;
  
public Wizard (String wzd,int damage,int endurance, int speed, double xp, Wiz qa){
  this.name = wzd; 
  this.damage = damage;
  this.endurance = endurance;
  this.speed = speed;
  this.xp = xp;
  
  questionsAndAnswers = qa;
}
  public Wizard(String name,Wiz qa) {
    this(name, 25, 15, 10, 100.0,qa);
  }
  public Wiz getQuestionsAndAnswers() {
	  return questionsAndAnswers;
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
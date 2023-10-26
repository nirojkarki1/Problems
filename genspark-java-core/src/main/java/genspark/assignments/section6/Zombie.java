package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Zombie extends Humanoid implements Assignment{
     private int brainLust;
     private int strength;
     private int intelligence;
     private int health;
     private int compassion;

    public int getBrainLust() {
        return brainLust;
    }

    public void setBrainLust(int brainLust) {
        this.brainLust = brainLust;
    }

    public int getStrength() {
        return brainLust;
    }

    public void setStrength(int strength) {
        this.brainLust = brainLust;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCompassion() {
        return compassion;
    }

    public void setCompassion(int compassion) {
        this.compassion = compassion;
    }

    // Default Constructor
  public Zombie(){

  }

    public Zombie(int brainLust,int strength,int intelligence, int health, int compassion){
      this.brainLust = brainLust;
      this.strength = strength;
      this.intelligence = intelligence;
      this.health = health ;
      this.compassion = compassion ;
    }

    public Class wholsTheParent(){

        return super.getClass().getSuperclass();
    }

    public String attack(Object human){
        if(human instanceof Human){
            Human human1 = (Human)human;
            human1.setHealth(strength);

            if(human1.getHealth()<= 3){
                return "The zombie bites the human for " + this.getStrength() +" damage, the human has died...";
            }
            else{
                return "The zombie bites the human for " + this.getStrength() +" damage, the human survives but will be turning soon...";
            }

        }
     return "";
    }

}

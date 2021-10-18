package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class Zombie extends Humanoid implements Assignment{
    private int brainLust;
    private int strength;
    private int intelligence;
    private int compassion;
    private int health;

    public Zombie() {
    }

    public Zombie(int brainLust, int strength, int intelligence, int compassion, int health) {
        this.brainLust = brainLust;
        this.strength = strength;
        this.intelligence = intelligence;
        this.compassion = compassion;
        this.health = health;
    }

    public Class<?> whoIsTheParent() {
        return this.getClass().getSuperclass();
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public int getBrainLust() {
        return brainLust;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getCompassion() {
        return compassion;
    }

    @Override
    public String attack(Object other) {
        var human = (Human) other;
        human.setHealth(human.getHealth() - this.strength);
        if (human.getHealth() <= 3) {
            return "The zombie bites the human for " + this.strength +
                    " damage, the human has died...";
        }
        return "The zombie bites the human for " + this.strength +
                " damage, the human survives but will be turning soon...";
    }
}

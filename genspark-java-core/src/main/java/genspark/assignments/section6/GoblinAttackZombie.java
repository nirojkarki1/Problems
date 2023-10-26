package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class GoblinAttackZombie implements Assignment {
    // ↓↓↓↓ your code goes here ↓↓↓↓
    public Zombie attack(){
        Zombie z1 = new Zombie();
        int t1 =  new Goblin().strength;
        z1.setStrength(t1);
        return z1;
    }
     public String determineOutcome( Zombie zombie){
        if(zombie.getHealth()>= 0){
            return "ermmm I am still alive!";
        }
        else{
            return "Zombie is alive, therefore it is not a zombie!";
        }
     }
}

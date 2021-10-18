package genspark.assignments.section6;

import genspark.assignments.Assignment;

public class GoblinAttackZombie implements Assignment {
    public String determineOutcome(Zombie z){
        if (z.getHealth() > 0){
            return "ermmm I am still alive!";
        }
        return "Zombie is alive, therefore it is not a zombie!";
    }
}

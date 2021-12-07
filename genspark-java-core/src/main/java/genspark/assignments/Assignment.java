package genspark.assignments;
import genspark.assignments.section6.*;
import reload_system.session.Session;

import java.io.IOException;

public interface Assignment {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_BLACK = "\u001B[30m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_BLUE = "\u001B[34m";
    String ANSI_PURPLE = "\u001B[35m";
    String ANSI_CYAN = "\u001B[36m";
    String ANSI_WHITE = "\u001B[37m";

    default void test() throws IOException {
        if (
            this.getClass() == Human.class    ||
            this.getClass() == Cat.class      ||
            this.getClass() == Goblin.class   ||
            this.getClass() == Humanoid.class ||
            this.getClass() == Dog.class
        ) {
            System.out.println(ANSI_PURPLE + "COMPILE SUCCESSFUL... now compile the class that the gui is currently reflecting" + ANSI_RESET);
        }
        else if (Session.session == null){
            System.out.println(ANSI_RED + "GUI IS NOT CONNECTED!!!" + ANSI_RESET);
        }
        else {
            Session.sendMessage(backend.harness.dispatcher(this));
        }
    }
}

package genspark.assignments;
import reload_system.session.Session;

import java.io.IOException;

public interface Assignment {
    default void test() throws IOException {
        if (Session.session == null){
            System.out.println("GUI is not connected!");
        } else {
            System.out.println(this);
            Session.sendMessage(backend.harness.dispatcher(this));
        }
    }
}

package genspark.assignments;

import session.Session;

import java.io.IOException;

public interface Assignment {
    default void test() throws IOException {
        if (Session.session == null){
            System.out.println("GUI is not connected!");
        } else {
            Session.sendMessage(backend.harness.dispatcher(this));
        }
    }
}

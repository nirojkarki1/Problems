import genspark.assignments.section1.AddOne;
import hotswap_plugins.session.Session;
import hotswap_plugins.watch_for_reloads.ObjectRefs;
import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public class Main extends WebSocketServer {

    public static void main(String[] args) {
        ObjectRefs.loadObjects();
        String host = "localhost";
        int port = 8887;
        new AddOne();
        WebSocketServer server = new Main(new InetSocketAddress(host, port));
        //Path reloadDir = Paths.get(System.getProperty("user.dir") + "/reload");
        //File reloadFile = Paths.get(System.getProperty("user.dir") + "/reload/reload.log").toFile();
        //new FileWatcher(reloadFile, reloadDir).watch();
        server.run();
    }
    public Main(InetSocketAddress address) {
        super(address);
    }
    @Override
    public void onOpen(WebSocket conn, ClientHandshake handshake) {
        Session.session = conn;
        conn.send("{\"type\": \"connection\", \"message\": \"Welcome to the server!\"}"); //This method sends a message to the new client
        //broadcast( "new connection: " + handshake.getResourceDescriptor() ); //This method sends a message to all clients connected
        System.out.println("new connection to " + conn.getRemoteSocketAddress());
    }

    @Override
    public void onClose(WebSocket conn, int code, String reason, boolean remote) {
        System.out.println("closed " + conn.getRemoteSocketAddress() + " with exit code " + code + " additional info: " + reason);
    }

    @Override
    public void onMessage(WebSocket conn, String message) {
        System.out.println("received message from "    + conn.getRemoteSocketAddress() + ": " + message);
        //Session.sendMessage(backend.harness.messageFromGui(message));
    }

    @Override
    public void onMessage( WebSocket conn, ByteBuffer message ) {
        System.out.println("received ByteBuffer from "    + conn.getRemoteSocketAddress());
    }

    @Override
    public void onError(WebSocket conn, Exception ex) {
        System.err.println("an error occurred on connection " + conn.getRemoteSocketAddress()  + ":" + ex);
    }

    @Override
    public void onStart() {
        System.out.println("server started successfully");
    }



}

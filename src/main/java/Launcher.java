import io.jeamlit.core.Server;

public class Launcher {

    public static void main(String[] args) {
        final var server = Server.builder(App.class, 8080).build();
        server.start();
    }
}

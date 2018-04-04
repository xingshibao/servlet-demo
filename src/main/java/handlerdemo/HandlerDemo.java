package handlerdemo;

import org.eclipse.jetty.server.Server;

/**
 * @author shibao.xing
 * @since 2018-03-28 19:59
 */
public class HandlerDemo {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8088);
        server.setHandler(new MeituanHandler());
        server.start();
        server.join();
    }
}

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author shibao.xing
 * @since 2018-03-28 17:33
 */
public class JettyServer {

    public static void main(String[] args) throws Exception {
        int port = 8089;
        Server server = new Server(port);

        WebAppContext webAppContext = new WebAppContext("webapp","/web");
        webAppContext.setDescriptor("webapp/WEB-INF/web.xml");
        webAppContext.setResourceBase("src/main/webapp/");
        webAppContext.setDisplayName("web");
        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());
        webAppContext.setConfigurationDiscovered(true);
        webAppContext.setParentLoaderPriority(true);


        server.setHandler(webAppContext);
        System.out.println(webAppContext.getContextPath());
        System.out.println(webAppContext.getDescriptor());
        System.out.println(webAppContext.getResourceBase());
        System.out.println(webAppContext.getBaseResource());

        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("server is  start, port is "+port+"............");
    }
}

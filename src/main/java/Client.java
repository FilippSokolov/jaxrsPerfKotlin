


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;


@ApplicationPath("/")
public class Client extends Application {
    public void getEndpointTest1() throws MalformedURLException {

        javax.ws.rs.client.Client client = ClientBuilder.newClient();
        String name = client.target("http://localhost/helloExtended/ext8/versions")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    }


}










import okhttp3.HttpUrl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.*;
import java.net.MalformedURLException;
import java.net.URL;


@ApplicationPath("/")
public class Client extends Application {
    public void getEndpointTest1() throws MalformedURLException {

        HttpUrl aseUrl1 = HttpUrl.get("https://localhost:8080/");
    }


}







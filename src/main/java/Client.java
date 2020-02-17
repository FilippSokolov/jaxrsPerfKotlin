


import okhttp3.HttpUrl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.net.MalformedURLException;
import java.net.URL;


@ApplicationPath("/")
public class Client extends Application { 
    public void getEndpointTest1() throws MalformedURLException {
        HttpUrl aseUrl1 = HttpUrl.get("https://localhost:8080/");
        //HttpUrl testUrl1 = HttpUrl.parse("http://localhost:8080/hello/");
        System.out.println("sdf");
        //    HttpUrl baseUrl1 = HttpUrl.get("");
        new URL("");
        //Request request1 = new Request.Builder().url(aseUrl1 + "http://localhost:8080")
    }


}







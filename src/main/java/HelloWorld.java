

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/test")
public class HelloWorld {

    @GET
    @Produces
    public String getMessage() {
        return "Hello World";
    }

}

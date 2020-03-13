import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/helloAbstract")
public abstract class AbstractEndpoint {

    @GET
    public String getMessageForm() {
        return "<form action=\"helloOlga/sayHello\" method=\"GET\">\n" +
                " Name <input id=\"name\" name=\"name\"/> " +
                "<input type=\"submit\" />\n" +
                "  </form>";
    }


    @GET
    @Path(value = "helloValue")
    abstract public String getMessage1();


}

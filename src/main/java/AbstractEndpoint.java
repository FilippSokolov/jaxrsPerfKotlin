import javax.annotation.security.PermitAll;
import javax.ws.rs.*;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.PathSegment;
import javax.ws.rs.core.Response;

@Path(value = "/helloAbstract")
public abstract class AbstractEndpoint {

    @PermitAll
    @POST
    @Path("/TEST")
    @Consumes("application/json")
    @Produces("application/json")
    public abstract Response insert(Object user);

    @POST
    @Consumes("application/json")
    public void submit(final @Suspended AsyncResponse response) {
    }

    @GET
    @Path("/matrix/{make}/{model}/{year}")
    @Produces("text/plain")
    public String getFromMatrixParam(
            @PathParam("make") String make,
            @PathParam("model") PathSegment car,
            @MatrixParam("color") String color,
            @PathParam("year") String year) {
        return "A " + color + " " + year + " "
                + make + " " + car.getPath();
    }

    @GET
    public String getMessageForm() {
        return "<form action=\"helloOlga/sayHello\" method=\"GET\">\n" +
                " Name <input id=\"name\" name=\"name\"/> " +
                "<input type=\"submit\" />\n" +
                "  </form>";
    }

    @GET
    public Response get() {


        Response.ResponseBuilder builder = Response.ok("hello", "text/plain");
        return builder.build();
    }

    @GET
    @Produces("application/xml")
    public Response getCustomerList() {

        return Response.ok().build();
    }

    @PATCH
    @Path("VVVVV/{name}" + "/some" + "/{value}")
    public String getTest133() {
        return "Hello3";
    }

    @GET
    @Path("sayHe23llo/{name}" + "/some" + "/{value}")
    public String getTest122() {
        return "Hello3";
    }

    @PUT
    @Path("sayHello/{name}" + "/some")
    abstract public String getTest12();

    @GET
    @Path(value = "helloValue")
    abstract public String getMessage1();

    @PUT
    @Path(value = "/ext4")
    @Produces("application/xml")
    public String say4() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello xml" + "</hello>";

    }

    @GET
    @Path(value = "/ext3")
    @Produces("text/plain")
    abstract public String say3();

    @POST
    @Path(value = "/ext11")
    @Produces(MediaType.TEXT_XML)
    public abstract String say10();

    @Path("sayHello{name}")
    @GET
    public String doSayHello2(@PathParam("name") String name) {
        return "Hello there " + name;
    }

}

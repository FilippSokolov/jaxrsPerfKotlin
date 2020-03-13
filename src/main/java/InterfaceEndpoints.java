import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/helloInterface")
public interface InterfaceEndpoints {

    @Path("InterfaceRoot")
    @GET
    public String interfaceDo();

    @Path("/{applianceId}/versions")
    @POST
    public Response createApplianceSoftwareVersion(@Context HttpHeaders headers,
                                                   @PathParam("applianceId") Long applianceId);

    @GET
    @Path(value = "/ext5")
    @Produces("text/html")
    public String say3();


        @GET
    @Produces({MediaType.APPLICATION_XML})
    @Path("/ext11")
    public String say11();

    @GET
    @Path("sayHe23llo/{name}" + "/some" + "/{value}")
    public String getTest122();


}

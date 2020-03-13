import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
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
}

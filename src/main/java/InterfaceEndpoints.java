import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@Path(value = "/helloInterface")
public interface InterfaceEndpoints {

    @GET
    @Path("run")
    @Produces(APPLICATION_JSON)
    @Consumes(APPLICATION_JSON)
    public Object run(@QueryParam("tipVersion") String object) throws Exception;


    @Path(Endpoints.COUNTRY_SELECTED_STATE)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createStateInCountrySelectingState2(String testSessionDto);

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

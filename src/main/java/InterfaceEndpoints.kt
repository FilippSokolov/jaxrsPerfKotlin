import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path(value = "/helloInterface")
interface InterfaceEndpoints {
    @GET
    @Path("run")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Throws(Exception::class)
    fun run(@QueryParam("tipVersion") `object`: String?): Any?

    @Path(Endpoints.COUNTRY_SELECTED_STATE)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun createStateInCountrySelectingState2(testSessionDto: String?): Response?

    @Path("InterfaceRoot")
    @GET
    fun interfaceDo(): String?

    @Path("/{applianceId}/versions")
    @POST
    fun createApplianceSoftwareVersion(@Context headers: HttpHeaders?,
                                       @PathParam("applianceId") applianceId: Long?): Response?

    @GET
    @Path(value = "/ext5")
    @Produces("text/html")
    fun say3(): String?

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/ext11")
    fun say11(): String?

    @get:Path("sayHe23llo/{name}" + "/some" + "/{value}")
    @get:GET
    val test122: String?
}
import javax.annotation.security.PermitAll
import javax.ws.rs.*
import javax.ws.rs.container.AsyncResponse
import javax.ws.rs.container.Suspended
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.PathSegment
import javax.ws.rs.core.Response

@Path(value = "/helloAbstract")
abstract class AbstractEndpoint {
    @PermitAll
    @POST
    @Path("/TEST")
    @Consumes("application/json")
    @Produces("application/json")
    abstract fun insert(user: Any?): Response?

    @POST
    @Consumes("application/json")
    fun submit(@Suspended response: AsyncResponse?) {
    }

    @GET
    @Path("/matrix/{make}/{model}/{year}")
    @Produces("text/plain")
    fun getFromMatrixParam(
            @PathParam("make") make: String,
            @PathParam("model") car: PathSegment,
            @MatrixParam("color") color: String,
            @PathParam("year") year: String): String {
        return ("A " + color + " " + year + " "
                + make + " " + car.path)
    }

    @get:GET
    open val messageForm: String?
        get() = """<form action="helloOlga/sayHello" method="GET">
 Name <input id="name" name="name"/> <input type="submit" />
  </form>"""

    @GET
    fun get(): Response {
        val builder = Response.ok("hello", "text/plain")
        return builder.build()
    }

    @get:Produces("application/xml")
    @get:GET
    val customerList: Response
        get() = Response.ok().build()

    @get:Path("VVVVV/{name}" + "/some" + "/{value}")
    @get:PATCH
    open val test133: String?
        get() = "Hello3"

    @get:Path("sayHe23llo/{name}" + "/some" + "/{value}")
    @get:GET
    open val test122: String?
        get() = "Hello3"

    @get:Path("sayHello/{name}" + "/some")
    @get:PUT
    abstract val test12: String?

    @get:Path(value = "helloValue")
    @get:GET
    abstract val message1: String?

    @PUT
    @Path(value = "/ext4")
    @Produces("application/xml")
    open fun say4(): String? {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello xml" + "</hello>"
    }

    @GET
    @Path(value = "/ext3")
    @Produces("text/plain")
    abstract fun say3(): String?

    @POST
    @Path(value = "/ext11")
    @Produces(MediaType.TEXT_XML)
    abstract fun say10(): String?

    @Path("sayHello{name}")
    @GET
    open fun doSayHello2(@PathParam("name") name: String): String? {
        return "Hello there $name"
    }
}
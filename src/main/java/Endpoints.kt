import java.io.InputStream
import javax.ws.rs.*
import javax.ws.rs.core.Context
import javax.ws.rs.core.HttpHeaders
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path(value = "/helloClass")
open class Endpoints : AbstractEndpoint(), InterfaceEndpoints {
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON)
    fun updateDeliverableType(@Context request: String?, @Context header: HttpHeaders?,
                              @BeanParam input: String?, @PathParam("id") id: Long): Response? {
        return null
    }

    override fun insert(user: Any?): Response? {
        return null
    }

    @get:GET
    override val messageForm: String
        get() = """<form action="helloOlga/sayHello" method="GET">
 Name <input id="name" name="name"/> <input type="submit" />
  </form>"""

    @get:Path("sayHello/{name}" + "/some" + "/{value}")
    @get:GET
    val test1: String
        get() = "Hello3"

    @get:Path("users/{username: [a-zA-Z][a-zA-Z_0-9]}")
    @get:DELETE
    val test4: String
        get() = "Hello3"

    @get:Path("us[a-zA-Z][a-zA-Z_0-9]ers/{username: [a-zA-Z][a-zA-Z_0-9]}")
    @get:POST
    val test5: String
        get() = "Hello3"

    @GET
    @Path("{machine}")
    @Produces(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
    fun getMachineMetric(@PathParam("machine") machine: String?): Response {
        return Response.ok().build()
    }

    @Path("registerclientseeder")
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    fun registerClientSeeder(@QueryParam("file_hash") file_hash: String?,
                             @QueryParam("chunk_hash") chunk_hash: String?,
                             @QueryParam("chunk_id") chunk_id: String?,
                             @QueryParam("ip") ip: String?,
                             @QueryParam("port") port: String?): String? {
        val query = ("INSERT INTO chunk_owners(file_hash, chunk_hash, chunk_id, "
                + "owner_ip, owner_port, is_seeder)"
                + String.format(file_hash!!,
                chunk_hash,
                chunk_id,
                ip,
                port))

        // runUpdate(query);
        return null
    }

    @PUT
    @Path("/folder_format/{path: .*}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    fun test() {
    }

    @Path(COUNTRY_SELECTED_STATE)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun createStateInCountrySelectingState(testSessionDto: String?): Response {
        return Response.ok().build()
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("unsubscribe")
    fun unsubscribe(input: InputStream?): Response.ResponseBuilder {
        return Response.accepted()
    }

    @POST
    @Path("fi.le/{file}")
    @Produces(MediaType.TEXT_PLAIN)
    fun setConnectorFileByURL(
            url: String?,
            @PathParam("file") file: String?,
            @QueryParam("scope") scope: String?,
            @QueryParam("nodeId") nodeId: List<String?>?): String {
        return say2()
    }

    @Path("AbstractRoot")
    @GET
    fun doSome1(): String? {
        return null
    }

    @get:Produces("text/plain")
    @get:Path("/restfuljava")
    @get:GET
    val book: Response
        get() {
            val book = "..."
            val builder = Response.ok(book)
            builder.language("fr")
                    .header("Some-Header", "some value")
            return builder.build()
        }

    @POST
    @Path(value = "/{lastName}")
    @Produces(value = ["text/xml"])
    fun getByLastName(@PathParam(value = "lastName") lastName: String?) {
    }

    override val test12: String?
        get() = null

    override val message1: String?
        get() = null

    @Throws(Exception::class)
    override fun run(`object`: String?): Any? {
        return null
    }

    override fun createStateInCountrySelectingState2(testSessionDto: String?): Response? {
        return null
    }

    override fun interfaceDo(): String? {
        return null
    }

    @POST
    override fun createApplianceSoftwareVersion(headers: HttpHeaders?, applianceId: Long?): Response? {
        return Any() as Response
    }

    @Path("sayHello")
    @GET
    fun doSayHelloWithRequestParam(@QueryParam("name") name: List<String?>): String {
        return "Hi there $name"
    }

    @GET
    @Path(value = "/ext1")
    @Produces("application/atom+xml")
    open fun say1(): String? {
        return """<?xml version="1.0" encoding="utf-8"?>
<feed xmlns="http://www.w3.org/2005/Atom">
<title>Example Feed</title>
<subtitle>A subtitle.</subtitle>
<link href="http://example.org/feed/" rel="self" />
<link href="http://example.org/" />
<id>urn:uuid:60a76c80-d399-11d9-b91C-0003939e0af6</id>
<updated>2003-12-13T18:30:02Z</updated>
<entry>
<title>Atom-Powered Robots Run Amok</title>
<link href="http://example.org/2003/12/13/atom03" />
<content type="xhtml">
<div xmlns="http://www.w3.org/1999/xhtml">
<p>This is the entry content.</p>
</div>
</content>
<author>
<name>John Doe</name>
<email>johndoe@example.com</email>
</author>
</entry>
</feed>"""
    }

    @GET
    @Path(value = "/ext2")
    @Produces("image/jpeg,image/png")
    open fun say2(): String {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello image/jpeg,image/png" + "</hello>"
    }

    @GET
    @Path(value = "/ext3")
    @Produces("application/json")
    override fun say3(): String? {
        return """
            {
            "firstName": "json F",
            "lastName": "json L",
            }
            """.trimIndent()
    }

    override fun say11(): String? {
        return null
    }

    @GET
    @Path(value = "/ext7")
    @Produces("*/*")
    open fun say7(): String? {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>"
    }

    @GET
    @Path(value = "/ext8")
    @Produces(MediaType.TEXT_XML)
    open fun say8(): String? {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>"
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/ext11")
    override fun say10(): String? {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>"
    }

    @Path("sayHello/{name}")
    @POST
    open fun doSayHello(@PathParam("name") name: String): String? {
        return "Hello there $name"
    }

    @Path("sayHello/{age}")
    @DELETE
    open fun doSayAge(@PathParam("age") name: String): String? {
        return "Hello there $name"
    }

    @Path("sayHello1")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    open fun doSayHelloWithFormParam(@FormParam("name1") name: String): String? {
        return "Hi there1 $name"
    }

    @POST
    @Path(value = "/ext12")
    @Produces("application/json")
    open fun say12(): String? {
        return """
            {
            "firstName": "json F111",
            "lastName": "json L111",
            }
            """.trimIndent()
    }

    companion object {
        const val COUNTRY_SELECTED_STATE = "CONSTANT"
        var temp1 = "Variable"
    }
}
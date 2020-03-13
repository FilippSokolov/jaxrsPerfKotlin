


import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path(value = "/helloClass")
public class Endpoints extends AbstractEndpoint implements InterfaceEndpoints {

    static public final String COUNTRY_SELECTED_STATE = "CONSTANT";
    static public String temp1 = "Variable";

    @PUT
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_FORM_URLENCODED})
    @Produces({MediaType.APPLICATION_XML, APPLICATION_JSON})
    public Response updateDeliverableType(@Context String request, @Context HttpHeaders header,
                                          @BeanParam String input, @PathParam("id") long id) {
        return null;
    }

    public Response insert(Object user) {
        return null;
    }

    @GET
    public String getMessageForm() {
        return "<form action=\"helloOlga/sayHello\" method=\"GET\">\n" +
                " Name <input id=\"name\" name=\"name\"/> " +
                "<input type=\"submit\" />\n" +
                "  </form>";
    }

    @GET
    @Path("sayHello/{name}" + "/some" + "/{value}")
    public String getTest1() {
        return "Hello3";
    }

    @DELETE
    @Path("users/{username: [a-zA-Z][a-zA-Z_0-9]}")
    public String getTest4() {
        return "Hello3";
    }

    @POST
    @Path("us[a-zA-Z][a-zA-Z_0-9]ers/{username: [a-zA-Z][a-zA-Z_0-9]}")
    public String getTest5() {
        return "Hello3";
    }

    @GET
    @Path("{machine}")
    @Produces({APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getMachineMetric(@PathParam("machine") String machine) {
        return Response.ok().build();
    }

    @Path("registerclientseeder")
    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String registerClientSeeder(@QueryParam("file_hash") String file_hash,
                                       @QueryParam("chunk_hash") String chunk_hash,
                                       @QueryParam("chunk_id") String chunk_id,
                                       @QueryParam("ip") String ip,
                                       @QueryParam("port") String port) {

        String query = "INSERT INTO chunk_owners(file_hash, chunk_hash, chunk_id, "
                + "owner_ip, owner_port, is_seeder)"

                + "VALUES('%s', '%s', %s, '%s', %s, 'f');".format(file_hash,
                chunk_hash,
                chunk_id,
                ip,
                port);

        // runUpdate(query);
        return null;
    }

    @PUT
    @Path("/folder_format/{path: .*}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void test() {
    }


    @Path(COUNTRY_SELECTED_STATE)
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createStateInCountrySelectingState(String testSessionDto) {

        return Response.ok().build();
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("unsubscribe")
    public Response.ResponseBuilder unsubscribe(InputStream input) {

        return Response.accepted();
    }

    @POST
    @Path("fi.le/{file}")
    @Produces(MediaType.TEXT_PLAIN)
    public String setConnectorFileByURL(
            String url,
            @PathParam("file") String file,
            @QueryParam("scope") String scope,
            @QueryParam("nodeId") List<String> nodeId) {

        return say2();
    }

    @Path("AbstractRoot")
    @GET
    public String doSome1() {
        return null;
    }

    @GET
    @Path("/restfuljava")
    @Produces("text/plain")
    public Response getBook() {

        String book = "...";
        Response.ResponseBuilder builder = Response.ok(book);
        builder.language("fr")
                .header("Some-Header", "some value");

        return builder.build();
    }

    @POST
    @Path(value = "/{lastName}")
    @Produces(value = "text/xml")
    public void getByLastName(@PathParam(value = "lastName") String lastName) {

    }

    public String getTest12() {
        return null;
    }

    public String getMessage1() {
        return null;
    }

    public Object run(String object) throws Exception {
        return null;
    }

    public Response createStateInCountrySelectingState2(String testSessionDto) {
        return null;
    }

    public String interfaceDo() {
        return null;
    }

    @POST
    public Response createApplianceSoftwareVersion(HttpHeaders headers, Long applianceId) {
        return (Response) new Object();
    }

    @Path("sayHello")
    @GET
    public String doSayHelloWithRequestParam(@QueryParam("name") List<String> name) {
        return "Hi there " + name;

    }

    @GET
    @Path(value = "/ext1")
    @Produces("application/atom+xml")
    public String say1() {
        return "<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n" +

                "<feed xmlns=\"http://www.w3.org/2005/Atom\">" + "\n" +

                "<title>Example Feed</title>" + "\n" +
                "<subtitle>A subtitle.</subtitle>" + "\n" +
                "<link href=\"http://example.org/feed/\" rel=\"self\" />" + "\n" +
                "<link href=\"http://example.org/\" />" + "\n" +
                "<id>urn:uuid:60a76c80-d399-11d9-b91C-0003939e0af6</id>" + "\n" +
                "<updated>2003-12-13T18:30:02Z</updated>" + "\n" +

                "<entry>" + "\n" +
                "<title>Atom-Powered Robots Run Amok</title>" + "\n" +
                "<link href=\"http://example.org/2003/12/13/atom03\" />" + "\n" +

                "<content type=\"xhtml\">" + "\n" +
                "<div xmlns=\"http://www.w3.org/1999/xhtml\">" + "\n" +
                "<p>This is the entry content.</p>" + "\n" +
                "</div>" + "\n" +
                "</content>" + "\n" +
                "<author>" + "\n" +
                "<name>John Doe</name>" + "\n" +
                "<email>johndoe@example.com</email>" + "\n" +
                "</author>" + "\n" +

                "</entry>" + "\n" +

                "</feed>";
    }

    @GET
    @Path(value = "/ext2")
    @Produces({"image/jpeg,image/png"})
    public String say2() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello image/jpeg,image/png" + "</hello>";
    }

    @GET
    @Path(value = "/ext3")
    @Produces("application/json")
    public String say3() {
        return "{" + "\n" +
                "\"firstName\": \"json F\"," + "\n" +
                "\"lastName\": \"json L\"," + "\n" +
                "}";
    }

    public String say11() {
        return null;
    }

    @GET
    @Path(value = "/ext7")
    @Produces("*/*")
    public String say7() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }

    @GET
    @Path(value = "/ext8")
    @Produces(MediaType.TEXT_XML)
    public String say8() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }

    @GET
    @Produces({MediaType.APPLICATION_XML})
    @Path("/ext11")
    public String say10() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello *" + "</hello>";
    }

    @Path("sayHello/{name}")
    @POST
    public String doSayHello(@PathParam("name") String name) {
        return "Hello there " + name;
    }

    @Path("sayHello/{age}")
    @DELETE
    public String doSayAge(@PathParam("age") String name) {
        return "Hello there " + name;
    }

    @Path("sayHello1")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String doSayHelloWithFormParam(@FormParam("name1") String name) {
        return "Hi there1 " + name;
    }

    @POST
    @Path(value = "/ext12")
    @Produces("application/json")
    public String say12() {
        return "{" + "\n" +
                "\"firstName\": \"json F111\"," + "\n" +
                "\"lastName\": \"json L111\"," + "\n" +
                "}";
    }
}

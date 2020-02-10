import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path(value = "/helloInterface")
public interface InterfaceEndpoints {

    @Path("InterfaceRoot")
    @GET
    public String interfaceDo() ;
}

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path(value = "/helloAbstract")
abstract public class RootAbstractEndpoints implements InterfaceEndpoints{

//    @Path("InterfaceRoot")
//    @GET
//  abstract   public String doSome1a() ;

    @Path("AbstractRoot")
    @GET
    abstract   public String doSome1() ;

    @Path("InterfaceMethodFromAbstractClass")
    @GET
    public String interfaceDo() {
        return null;
    }


    //    @Path("AbstractRoot")
//    @GET
//    public String doSome() {
//        return null;
//
//    }


}

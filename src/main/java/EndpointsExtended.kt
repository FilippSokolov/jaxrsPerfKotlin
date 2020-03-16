import javax.ws.rs.Path;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import java.util.List;

@Path("/helloExtended")
public class EndpointsExtended extends Endpoints {

    @Override
    public String say1() {
        return super.say1();
    }

    @Override
    public String say2() {
        return super.say2();
    }

    @Override
    public String say3() {
        return super.say3();
    }

    @Override
    public String say11() {
        return super.say11();
    }


    @Override
    public String say7() {
        return super.say7();
    }

    @Override
    public String say8() {
        return super.say8();
    }

    @Override
    public String say10() {
        return super.say10();
    }

    @Override
    public String doSayHello(String name) {
        return super.doSayHello(name);
    }

    @Override
    public String doSayAge(String name) {
        return super.doSayAge(name);
    }

    @Override
    public String doSayHelloWithFormParam(String name) {
        return super.doSayHelloWithFormParam(name);
    }

    @Override
    public String say12() {
        return super.say12();
    }

    @Override
    public String getTest133() {
        return super.getTest133();
    }

    @Override
    public String getTest122() {
        return super.getTest122();
    }

    @Override
    public String say4() {
        return super.say4();
    }


    @Override
    public String doSayHello2(String name) {
        return super.doSayHello2(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

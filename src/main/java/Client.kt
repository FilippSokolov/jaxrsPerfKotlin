import okhttp3.HttpUrl
import java.net.MalformedURLException
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application
import javax.ws.rs.core.UriBuilder

@ApplicationPath("/")
class Client : Application() {
    @get:Throws(MalformedURLException::class)
    val endpointTest1: Unit
        get() {
            val aseUrl1 = HttpUrl.get("https://localhost:8080/")
            UriBuilder.fromUri("http://localhost:8080/jaxrs_paths/")
        }
}
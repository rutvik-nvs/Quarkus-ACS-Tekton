import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/api")
public class REST {

    @ConfigProperty(name = "properties.key")
    public String value;

    @GET()
    @Path("/data")
    @Produces(MediaType.TEXT_PLAIN)
    public String Data(){
        return ("GET Request served with value: " + value);
    }
}
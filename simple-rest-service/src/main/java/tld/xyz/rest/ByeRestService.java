package tld.xyz.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("bye")
public class ByeRestService {

    @GET
    @Produces("text/html")
    public String sayGoodBye() {
        return "Good Bye!";
    }
}


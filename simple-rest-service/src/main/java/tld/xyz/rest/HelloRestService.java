package tld.xyz.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hello")
public class HelloRestService {

    @GET
    @Produces("text/html")
    public String sayHello() {
        return "Hello!";
    }
}


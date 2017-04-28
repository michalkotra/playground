package pl.app.playground.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/")
@Produces()
public class HelloResource {
    @GET
    public String hello() {
        return "HELLO";
    }
}

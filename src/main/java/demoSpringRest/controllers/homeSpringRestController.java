package demoSpringRest.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/home")

public class homeSpringRestController {

    @GET
    public String hola() {
        return "This is the demo homepage! with Sprinboot and Jersey by Jau";
    }


}

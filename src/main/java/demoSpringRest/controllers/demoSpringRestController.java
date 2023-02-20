package demoSpringRest.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")

public class demoSpringRestController {
    @GET
    public String hola() {
        return "Hello World! with Sprinboot and Jersey by Jau";
    }
}

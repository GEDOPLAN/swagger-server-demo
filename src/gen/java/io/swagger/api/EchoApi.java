package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EchoApiService;
import io.swagger.api.factories.EchoApiServiceFactory;


import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/echo")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class EchoApi  {
   private final EchoApiService delegate = EchoApiServiceFactory.getEchoApi();

    @GET
    @Path("/{name}")
    
    @Produces({ "application/json" })
    public Response echoNameGet( @PathParam("name") String name, @QueryParam("message") String message,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.echoNameGet(name,message,securityContext);
    }
}

package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TimeApiService;
import io.swagger.api.factories.TimeApiServiceFactory;

import io.swagger.model.CurrentTime;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/time")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class TimeApi  {
   private final TimeApiService delegate = TimeApiServiceFactory.getTimeApi();

    @GET
    
    
    @Produces({ "application/json" })
    public Response timeGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.timeGet(securityContext);
    }
}

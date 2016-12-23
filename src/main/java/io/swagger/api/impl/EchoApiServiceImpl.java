package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class EchoApiServiceImpl extends EchoApiService {

  @Override
  public Response echoNameGet(String name, String message, SecurityContext securityContext) throws NotFoundException
  {
    // do some magic!
    return Response
        .ok()
        .entity(new ApiResponseMessage(ApiResponseMessage.OK, String.format("Echo: %s:%s", name, message)))
        .build();
  }
}

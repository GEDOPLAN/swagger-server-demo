package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;



import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public abstract class EchoApiService {
      public abstract Response echoNameGet(String name,String message,SecurityContext securityContext)
      throws NotFoundException;
}

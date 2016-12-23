package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.CurrentTime;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public abstract class TimeApiService {
      public abstract Response timeGet(SecurityContext securityContext)
      throws NotFoundException;
}

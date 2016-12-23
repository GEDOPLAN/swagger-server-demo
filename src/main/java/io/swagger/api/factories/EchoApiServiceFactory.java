package io.swagger.api.factories;

import io.swagger.api.EchoApiService;
import io.swagger.api.impl.EchoApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class EchoApiServiceFactory {

   private final static EchoApiService service = new EchoApiServiceImpl();

   public static EchoApiService getEchoApi()
   {
      return service;
   }
}

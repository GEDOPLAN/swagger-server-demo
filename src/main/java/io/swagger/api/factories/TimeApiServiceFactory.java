package io.swagger.api.factories;

import io.swagger.api.TimeApiService;
import io.swagger.api.impl.TimeApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class TimeApiServiceFactory {

   private final static TimeApiService service = new TimeApiServiceImpl();

   public static TimeApiService getTimeApi()
   {
      return service;
   }
}

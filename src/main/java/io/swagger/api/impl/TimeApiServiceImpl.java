package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.api.NotFoundException;
import io.swagger.model.CurrentTime;
import java.math.BigDecimal;
import java.util.GregorianCalendar;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class TimeApiServiceImpl extends TimeApiService {

  @Override
  public Response timeGet(SecurityContext securityContext) throws NotFoundException
  {
    GregorianCalendar cal = new GregorianCalendar();
    CurrentTime currentTime = new CurrentTime();
    currentTime.setDay(new BigDecimal(cal.get(GregorianCalendar.DATE)));
    currentTime.setHour(new BigDecimal(cal.get(GregorianCalendar.HOUR)));
    currentTime.setMinute(new BigDecimal(cal.get(GregorianCalendar.MINUTE)));
    currentTime.setMonth(new BigDecimal(cal.get(GregorianCalendar.MONTH)));
    currentTime.setSecond(new BigDecimal(cal.get(GregorianCalendar.SECOND)));
    currentTime.setYear(new BigDecimal(cal.get(GregorianCalendar.YEAR)));

    return Response.ok().entity(currentTime).build();
  }
}

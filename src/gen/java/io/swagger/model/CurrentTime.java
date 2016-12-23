package io.swagger.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-12-23T10:40:00.476Z")
public class CurrentTime   {
  
  private BigDecimal year = null;
  private BigDecimal month = null;
  private BigDecimal day = null;
  private BigDecimal hour = null;
  private BigDecimal minute = null;
  private BigDecimal second = null;

  /**
   **/
  
  @JsonProperty("year")
  public BigDecimal getYear() {
    return year;
  }
  public void setYear(BigDecimal year) {
    this.year = year;
  }

  /**
   **/
  
  @JsonProperty("month")
  public BigDecimal getMonth() {
    return month;
  }
  public void setMonth(BigDecimal month) {
    this.month = month;
  }

  /**
   **/
  
  @JsonProperty("day")
  public BigDecimal getDay() {
    return day;
  }
  public void setDay(BigDecimal day) {
    this.day = day;
  }

  /**
   **/
  
  @JsonProperty("hour")
  public BigDecimal getHour() {
    return hour;
  }
  public void setHour(BigDecimal hour) {
    this.hour = hour;
  }

  /**
   **/
  
  @JsonProperty("minute")
  public BigDecimal getMinute() {
    return minute;
  }
  public void setMinute(BigDecimal minute) {
    this.minute = minute;
  }

  /**
   **/
  
  @JsonProperty("second")
  public BigDecimal getSecond() {
    return second;
  }
  public void setSecond(BigDecimal second) {
    this.second = second;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentTime currentTime = (CurrentTime) o;
    return Objects.equals(year, currentTime.year) &&
        Objects.equals(month, currentTime.month) &&
        Objects.equals(day, currentTime.day) &&
        Objects.equals(hour, currentTime.hour) &&
        Objects.equals(minute, currentTime.minute) &&
        Objects.equals(second, currentTime.second);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day, hour, minute, second);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentTime {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


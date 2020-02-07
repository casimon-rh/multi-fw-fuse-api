package com.redhat.fuse;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class Routes extends RouteBuilder {

  @Override
  public void configure() throws Exception {
    restConfiguration()
      .component("netty-http")
      .bindingMode(RestBindingMode.off)
      .contextPath("/rest").port("8080")
      .apiContextPath("/api-doc")
        .apiProperty("api.title", "Api-Spring")
        .apiProperty("api.version", "0.0.1");
    
    rest()
      .path("/users").consumes("application/json").produces("application/json")
        .post("/new")
          .to("direct:prueba");
    
    from("direct:prueba")
      .to("log:com.redhat.fuse.Routes")
      .setBody()
        .constant("{ \"resut\": \"ok\" }");
  }

  
}
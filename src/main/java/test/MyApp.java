package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("myapp")
public class MyApp {
	 /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @Path("hello/{hello}/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("hello") String helloStr) {
        return "Jersey says "+helloStr;
    }
    
    @Path("service/{hello}/")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHelloService(@PathParam("hello") String helloStr) {
        return "Service says "+helloStr;
    }
}

package test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class TestClient {
	public static void main(String args[]) {
		ClientConfig clientConfig = new ClientConfig();
		
		 
		Client client = ClientBuilder.newClient(clientConfig);

		 
		WebTarget webTarget = client.target("http://localhost:7001/testjersey/webapi");
	
		WebTarget resourceWebTarget = webTarget.path("myresource");
		//WebTarget helloworldWebTarget = resourceWebTarget.path("helloworld");
		//WebTarget helloworldWebTargetWithQueryParam =
		  //      helloworldWebTarget.queryParam("greeting", "Hi World!");
		 
		Invocation.Builder invocationBuilder =
				resourceWebTarget.request(MediaType.TEXT_PLAIN_TYPE);
		//invocationBuilder.header("some-header", "true");
		 
		Response response = invocationBuilder.get();
		System.out.println(response.getStatus());
		System.out.println(response.readEntity(String.class));
	}

}

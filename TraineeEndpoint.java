package COM.BAE.Rest;

import javax.inject.Inject;
import javax.ws.rs.Path;

import com.qa.business.service.MovieService;

@Path("/controller")
public class TraineeEndpoint {
	@inject
	private traineeService service;

	
	public String getAnAccount(int traineeID) {
		
	}
	
}
//@Path("/movie")
//public class MovieEndpoint {
//	
//	@Inject
//	private MovieService service;

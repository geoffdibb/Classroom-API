package COM.BAE.Rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import COM.BAE.BusinessLayer.traineeService;

@Path("/Trainee")
public class TraineeEndpoint {

	@Inject
	private traineeService service;

	@Path("/getATrainnee/{traineeId}")
	@GET
	@Produces({ "application/json" })
	public String getAnTrainee(@PathParam("traineeId") int traineeId) {
		return service.getAnTrainee(traineeId);
	}

	@Path("/getAllTrainees")
	@GET
	@Produces({ "application/json" })
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
}
package COM.BAE.Rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import COM.BAE.BusinessLayer.traineeService;

@Path("/Trainee")
public class TraineeEndpoint {

	@Inject
	traineeService service;

	@Path("/getATrainee/{traineeId}")
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

	// @Path("/Createtrainee/{traineeName}")
	// @GET
	// @Produces({ "application/json" })
	// public String createTrainee(@PathParam("traineeName") String traineeName) {
	//
	// return service.createTrainee(traineeName);
	// }

	@Path("/createTraineeAccount")
	@POST
	@Produces({ "application/json" })
	public String addTrainee(String name) {
		return service.createTrainee(name);
	}

	@Path("/deleteTrainee/{TraineeId}")
	@DELETE
	@Produces({ "application/json" })
	public String deleteTrainee(@PathParam("Id") int traineeId) {
		return service.deleteTrainee(traineeId);
	}

}
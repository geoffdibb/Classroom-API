package COM.BAE.BusinessLayer;

public interface traineeService {

	String createTrainee(String name);

	String getAllTrainees();

	String getAnTrainee(int traineeID);

	String updateTrainee(String name, int traineeID);

	String deleteTrainee(int traineeID);

}

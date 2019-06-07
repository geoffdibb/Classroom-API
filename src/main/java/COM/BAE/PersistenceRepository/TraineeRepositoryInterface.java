package COM.BAE.PersistenceRepository;

public interface TraineeRepositoryInterface {

	String createTrainee(String name);

	String getAllTrainees();

	String getAnTrainee(int traineeID);

	String updateTrainee(String name, int traineeID);

	String deleteTrainee(int traineeID);

}

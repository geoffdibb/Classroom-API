package COM.BAE.PersistenceRepository;

public interface TraineeRepositoryInterface {

	String createTrainee(String name);

	String getAllTrainees();

	String getAnTrainee(int traineeId);

	String updateTrainee(String name, int traineeId);

	String deleteTrainee(int traineeId);

}

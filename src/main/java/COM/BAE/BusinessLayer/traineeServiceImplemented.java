package COM.BAE.BusinessLayer;

import javax.inject.Inject;

import COM.BAE.PersistenceRepository.TraineeRepositoryInterface;

public class traineeServiceImplemented implements traineeService {

	@Inject
	TraineeRepositoryInterface traineeRepo;

	@Override
	public String createTrainee(String name) {
		return null;
	}

	@Override
	public String getAllTrainees() {
		return traineeRepo.getAllTrainees();
	}

	@Override
	public String getAnTrainee(int traineeID) {

		return traineeRepo.getAnTrainee(traineeID);
	}

	@Override
	public String updateTrainee(String name, int traineeID) {
		return null;
	}

	@Override
	public String deleteTrainee(int traineeID) {
		return null;
	}

}

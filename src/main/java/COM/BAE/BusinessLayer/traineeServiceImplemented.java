package COM.BAE.BusinessLayer;

import javax.inject.Inject;

import COM.BAE.PersistenceRepository.TraineeRepositoryInterface;

public class traineeServiceImplemented implements traineeService {

	@Inject
	TraineeRepositoryInterface traineeRepo;

	@Override
	public String createTrainee(String name) {
		return traineeRepo.createTrainee(name);
	}

	@Override
	public String getAllTrainees() {
		return traineeRepo.getAllTrainees();
	}

	@Override
	public String getAnTrainee(int traineeId) {

		return traineeRepo.getAnTrainee(traineeId);
	}

	@Override
	public String updateTrainee(String name, int traineeId) {
		return null;
	}

	@Override
	public String deleteTrainee(int traineeId) {
		return traineeRepo.deleteTrainee(traineeId);
	}

}

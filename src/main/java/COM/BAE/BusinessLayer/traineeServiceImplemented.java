package COM.BAE.BusinessLayer;

import javax.inject.Inject;

import COM.BAE.PersistenceRepository.TraineeDatabaseRepository;

public class traineeServiceImplemented implements traineeService {

	@Inject
	TraineeDatabaseRepository traineeRepo;

	@Override
	public String createTrainee(String name) {
		return null;
	}

	@Override
	public String getAllTrainees() {
		return null;
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

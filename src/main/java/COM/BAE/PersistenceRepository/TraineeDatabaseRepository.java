package COM.BAE.PersistenceRepository;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import COM.BAE.UTIL.JSONUtil;

@Default
public class TraineeDatabaseRepository implements TraineeRepositoryInterface {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

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
		return null;
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

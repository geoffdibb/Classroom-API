package COM.BAE.PersistenceRepository;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import COM.BAE.PersistenceDomain.TraineeAccount;
import COM.BAE.UTIL.JSONUtil;

@Default
@Transactional(TxType.SUPPORTS)
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
	@Transactional(TxType.SUPPORTS)
	public String getAllTrainees() {
		TypedQuery<TraineeAccount> query = null;
		query = manager.createQuery("SELECT a FROM Trainee a", TraineeAccount.class);

		List<TraineeAccount> accList = query.getResultList();
		return new JSONUtil().getJSONForObject(accList);
	}

	@Override
	public String getAnTrainee(int traineeID) {
		return util.getJSONForObject(manager.find(TraineeAccount.class, traineeID));
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

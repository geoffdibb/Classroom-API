package COM.BAE.PersistenceRepository;

import java.util.List;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		TraineeAccount newtrainee = util.getObjectForJSON(name, TraineeAccount.class);
		manager.persist(newtrainee);
		return "Trainee Made";
	}

	// @Override
	// @Transactional(TxType.REQUIRED)
	// public String createAccount(String account) {
	// Account newAccount = new JSONUtil().getObjectForJSON(account, Account.class);
	// em.persist(newAccount);
	//
	// return "Account made";
	// }
	@Override
	
	public String getAllTrainees() {
		Query query = manager.createQuery("SELECT a FROM TraineeAccount a", TraineeAccount.class);

		List<TraineeAccount> traineeacList = query.getResultList();

		
		
		return util.getJSONForObject(traineeacList);
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
